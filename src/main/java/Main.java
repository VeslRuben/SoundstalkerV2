import MotorSystem.PidController;

import java.util.concurrent.TimeUnit;

public class Main{

    public static void main(String[] args) throws InterruptedException {
//        Thread GUI = new Thread( new GUI());
//        GUI.run();
//        Thread.sleep(10000);
//        System.out.println("yolo");
        TimeWatch timer = new TimeWatch();
        timer.start();
        int a = 0;
        for (int i = 0; i < 1000; i++) {
            a += i;
        }
        long elapsedTime = timer.elapsedTime(TimeUnit.MICROSECONDS);
        System.out.println(elapsedTime);
        elapsedTime = timer.elapsedTime(TimeUnit.MICROSECONDS);
        System.out.println(elapsedTime);
    }
}
