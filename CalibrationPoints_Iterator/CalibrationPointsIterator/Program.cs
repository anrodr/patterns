namespace CalibrationPointsIterator
{
    public class Program
    {
        private static void Main(string[] args)
        {
            IThermometer thermometer = new Thermometer();
            thermometer.AddCalibrationPoint(5, 0.5);
            thermometer.AddCalibrationPoint(15, 0.8);
            thermometer.AddCalibrationPoint(25, 1.1);
            thermometer.AddCalibrationPoint(35, 1.4);

            double measuredTemperature = postTemperature();
            double correctedTemperature = thermometer.GetCorrectedValue(measuredTemperature);
            Console.WriteLine($"Temperatura medida: {measuredTemperature}°C");
            Console.WriteLine($"Temperatura corregida: {correctedTemperature}°C");
        }

        private static double postTemperature()
        {
            double temperature;
            bool isValid;
            do
            {
                Console.WriteLine("Hola, Ingresa un valor de temperatura en °C, entre 5 y 30 °C");
                Console.Write("Ingresa la temperatura: ");
                string input = Console.ReadLine()!;

                isValid = double.TryParse(input, out temperature);

                if (!isValid || temperature < 5 || temperature > 30)
                {
                    Console.WriteLine("Entrada inválida. Por favor, ingresa un número entre 5 y 30.");
                    isValid = false;
                }

            } while (!isValid);

            return temperature;
        }

    }
}