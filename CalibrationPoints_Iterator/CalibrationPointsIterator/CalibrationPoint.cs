namespace CalibrationPointsIterator
{
    public class CalibrationPoint
    {
        public double Temperature { get; }
        public double CorrectionFactor { get; }

        public CalibrationPoint(double temperature, double correctionFactor)
        {
            Temperature = temperature;
            CorrectionFactor = correctionFactor;
        }
    }
}