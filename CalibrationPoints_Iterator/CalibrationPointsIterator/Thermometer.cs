using System.Collections;

namespace CalibrationPointsIterator
{
    public class Thermometer : IThermometer, IEnumerable<CalibrationPoint>
    {
        private readonly List<CalibrationPoint> _calibrationPoints = new List<CalibrationPoint>();

        public void AddCalibrationPoint(double temperature, double correctionFactor)
        {
            _calibrationPoints.Add(new CalibrationPoint(temperature, correctionFactor));            
            _calibrationPoints.Sort((x, y) => x.Temperature.CompareTo(y.Temperature));
        }

        public double GetCorrectedValue(double measuredTemperature)
        {
            IIterator iterator = CreateIterator();
            CalibrationPoint lower = null!, upper = null!;

            while (iterator.HasNext())
            {
                var point = iterator.Next();
                if (measuredTemperature == point.Temperature)
                {
                    return measuredTemperature - point.CorrectionFactor;
                }
                else if (measuredTemperature < point.Temperature)
                {
                    upper = point;
                    break;
                }
                lower = point;
            }

            if (lower == null || upper == null)
            {
                return measuredTemperature;
            }

            double interpolatedCorrectionFactor = Interpolate(lower, upper, measuredTemperature);
            return Math.Round((measuredTemperature - interpolatedCorrectionFactor),3);
        }

        private double Interpolate(CalibrationPoint lower, CalibrationPoint upper, double measuredTemperature)
        {
            double slope = (upper.CorrectionFactor - lower.CorrectionFactor) / (upper.Temperature - lower.Temperature);
            return lower.CorrectionFactor + slope * (measuredTemperature - lower.Temperature);
        }

        public IIterator CreateIterator()
        {
            return new CalibrationIterator(this);
        }

        public IEnumerator<CalibrationPoint> GetEnumerator()
        {
            return _calibrationPoints.GetEnumerator();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return GetEnumerator();
        }
    }
}