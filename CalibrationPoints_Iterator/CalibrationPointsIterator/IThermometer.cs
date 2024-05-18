using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalibrationPointsIterator
{
    public interface IThermometer
    {
        void AddCalibrationPoint(double temperature, double correctionFactor);
        double GetCorrectedValue(double measuredTemperature);
    }
}
