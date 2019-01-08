import java.sql.Time;

public class Main{

    public static void main(String[] args) throws InterruptedException {
    Thread GUI = new Thread( new GUI());
    GUI.run();
    Thread.sleep(10000);
        System.out.println("yolo");

    }
}
