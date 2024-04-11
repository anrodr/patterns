using System.Data;

namespace DataBaseAdapter
{
    public class AccessAdapter : IDatabaseAdapter
    {

        private string _selectedEquipment;
        private readonly ConnectionString _conectionString;
        private readonly DataResult _dataResult;

        public AccessAdapter(string selectedEquipment)
        {
            _selectedEquipment = selectedEquipment;
            _conectionString = new ConnectionString();
            _dataResult = new DataResult();
        }

        public DataTable ReadTableResult()
        {

            var selectedConnectionString = _conectionString.SetConnectionString(_selectedEquipment);

            DataTable dataTable = _dataResult.GetData(selectedConnectionString, _selectedEquipment);

            return dataTable;

        }
    }
}
