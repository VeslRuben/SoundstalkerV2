package Comunication;

import FalutHandler.Fault;
import FalutHandler.FaultHandler;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import java.io.IOException;


public class ArduinoCom {

    private I2CDevice device;
    private int arduinoAddres;

    public ArduinoCom(int arduinoAddres) throws IOException, I2CFactory.UnsupportedBusNumberException {
        final I2CBus bus = I2CFactory.getInstance(I2CBus.BUS_1);
        this.device = bus.getDevice(arduinoAddres);
        this.arduinoAddres = arduinoAddres;
    }

    public int[] read() {
        boolean reading = true;
        int[] byteArray = new int[20];
        int i = 0;
        try {
            while (reading) {
                int value = device.read(arduinoAddres);
                if (value != 0) {
                    byteArray[i] = value;
                } else {
                    reading = false;
                }
                i++;
            }
        } catch (IOException e) {
            Fault fault = new Fault(Fault.serious,"Unable to read form arduino whit addrese " + arduinoAddres, 2000, "ArduinoCom.read");
            FaultHandler.getInstance().reportFault(fault);
            return null;
        }
        return byteArray;
    }
}
