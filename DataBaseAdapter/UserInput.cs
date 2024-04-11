namespace DataBaseAdapter
{
    public class UserInput
    {
        public string GetEquipment()
        {
            string selectedEquipment;
            do
            {
                Console.WriteLine("Hola, Selecciona el equipo MilkoScan el cual usaste para analizar tu muestra");
                Console.WriteLine("1. MilkoScan FT 120");
                Console.WriteLine("2. MilkoScan 1");
                Console.Write("Ingrese el número de su elección: ");
                selectedEquipment = Console.ReadLine() ?? "";
            } while (string.IsNullOrEmpty(selectedEquipment) || (selectedEquipment != "1" && selectedEquipment != "2"));
            return selectedEquipment;

        }

    }
}
