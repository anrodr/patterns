using System.Data;

namespace DataBaseAdapter
{
    public class DataResult
    {

        public DataTable GetData(string connectionString, string selectedEquipment)
        {
            Console.WriteLine();
            Console.WriteLine(selectedEquipment == "1" ? "Conexión base de datos Access." : "Conexión base de datos SQL server.");
            Console.WriteLine();
            Console.WriteLine("Conexión Abierta.");
            Console.WriteLine("Cadena de conexión Usada: " + connectionString);

            DataTable dataTable = new DataTable();

            dataTable.Columns.Add("Proteina", typeof(double));
            dataTable.Columns.Add("Grasa", typeof(double));
            dataTable.Columns.Add("Lactosa", typeof(double));
            dataTable.Columns.Add("SolidosTotales", typeof(double));
            dataTable.Columns.Add("SolidosNoGrasos", typeof(double));

            Random random = new Random();
            for (int i = 0; i < 5; i++)
            {
                DataRow row = dataTable.NewRow();
                row["Proteina"] = random.NextDouble() * 10;
                row["Grasa"] = random.NextDouble() * 10;
                row["Lactosa"] = random.NextDouble() * 10;
                row["SolidosTotales"] = random.NextDouble() * 10;
                row["SolidosNoGrasos"] = random.NextDouble() * 10;
                dataTable.Rows.Add(row);
            }

            Console.WriteLine("Conexión Cerrada.");
            Console.WriteLine();

            return dataTable;

        }

    }
}
