namespace CalibrationPointsIterator
{
    public interface IIterator
    {
        CalibrationPoint Next();
        bool HasNext();
    }
}