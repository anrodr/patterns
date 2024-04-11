namespace DataBaseAdapter
{
    public class ConnectionString
    {
        public string SetConnectionString(string Option)
        {
            string connectionString = Option switch
            {
                "1" => "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\\Export\\Milko\\MilkoExport.accdb;",
                "2" => "Server=MXDVPCLUXX4;Database=ExportMilko;User Id=user_lims;Password=XXXXXXXXXX;",
                _ => ""
            };

            return connectionString;

        }

    }
}
