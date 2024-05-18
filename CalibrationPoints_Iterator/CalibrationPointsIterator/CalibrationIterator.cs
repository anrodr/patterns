namespace CalibrationPointsIterator
{
    public class CalibrationIterator : IIterator
    {
        private readonly List<CalibrationPoint> _calibrationPoints;
        private int _currentIndex = 0;

        public CalibrationIterator(Thermometer thermometer)
        {
            _calibrationPoints = new List<CalibrationPoint>(thermometer);
        }

        public CalibrationPoint Next()
        {
            CalibrationPoint point = _calibrationPoints[_currentIndex];
            _currentIndex++;
            return point;
        }

        public bool HasNext()
        {
            return _currentIndex < _calibrationPoints.Count;
        }
    }
}