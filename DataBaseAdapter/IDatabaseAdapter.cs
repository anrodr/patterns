using System.Data;

namespace DataBaseAdapter
{
    public interface IDatabaseAdapter
    {
        DataTable ReadTableResult();

    }
}
