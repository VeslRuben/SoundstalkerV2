import MotorSystem.MotorController;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Thread GUI = new Thread(new GUI());
        GUI.start();
        System.out.println("Gui thred started");

        Thread motorController = new Thread(new MotorController());
        motorController.start();
        System.out.println("motorcontroller thred started");

    }

}


