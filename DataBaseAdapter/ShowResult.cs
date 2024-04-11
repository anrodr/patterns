using System.Data;

namespace DataBaseAdapter
{
    public class ShowResult
    {
        public void ShowResultAnalyzed(DataTable dataTable)
        {
            Console.WriteLine("Resultados de análisis de leche:");
            foreach (DataRow row in dataTable.Rows)
            {
                Console.WriteLine($"Proteina: {row["Proteina"]}, Grasa: {row["Grasa"]}, Lactosa: {row["Lactosa"]}, Solidos Totales: {row["SolidosTotales"]}, Solidos No Grasos: {row["SolidosNoGrasos"]}");
            }
        }

    }
}
