using System.Data;

namespace DataBaseAdapter
{
    public class GetResult
    {

        private readonly UserInput _inputUser;
        private readonly ShowResult _showResult;

        public GetResult()
        {
            _inputUser = new UserInput();
            _showResult = new ShowResult();
        }

        public void GetResultMilk()
        {
            var selectedEquipment = _inputUser.GetEquipment();

            if (selectedEquipment != null)
            {
                IDatabaseAdapter adapter = null;

                if (selectedEquipment == "1")
                {
                    adapter = new AccessAdapter(selectedEquipment);
                }
                else if (selectedEquipment == "2")
                {
                    adapter = new SqlServerAdapter(selectedEquipment);
                }

                DataTable dataTable = adapter.ReadTableResult();

                _showResult.ShowResultAnalyzed(dataTable);
            }
        }

    }
}
