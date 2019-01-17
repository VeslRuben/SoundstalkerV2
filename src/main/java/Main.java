public class Main {


    public static void main(String[] args) throws InterruptedException {
        Thread GUI = new Thread(new GUI());
        GUI.start();
        System.out.println("yolo");
        for(int x = 0; x<10; x++) {
            Battery.Battery.setYolo(x);
            Thread.sleep(4000);

        }
    }
}
