package MotorSystem;

public class PidController {
    private double p;
    private double i;
    private double d;
    private double integral;
    private int previousError;
    private long previousTime;
    private int target;
    private int maxOutputValue;
    private int minOutputValue;


    public PidController(double p, double i, double d, int target, int maxOutputValue, int minOutputValue) {
        this.p = p;
        this.i = i;
        this.d = d;
        this.integral = 0;
        this.previousError = 0;
        this.previousTime = 1;
        this.target = target;
        this.maxOutputValue = maxOutputValue;
        this.minOutputValue = minOutputValue;
    }

    public int run(int currentPosition) {
        long cycleTime = System.currentTimeMillis() - this.previousTime;
        int error = this.target - currentPosition;

        double pOut = this.p * error;

        this.integral += error * cycleTime;
        if (this.integral > this.maxOutputValue){
            this.integral = this.maxOutputValue;
        } else if (this.integral < -this.maxOutputValue) {
            this.integral = -this.maxOutputValue;
        }
        double iOut = this.integral * this.i;

        double derivative = (double) ((error - this.previousError) / cycleTime);
        double dOut = derivative * this.d;

        int pid = (int) (pOut + iOut + dOut);
        if (pid > this.maxOutputValue) {
            pid = this.maxOutputValue;
        } else if (pid < this.minOutputValue) {
            pid = this.minOutputValue;
        }

        this.previousTime = System.currentTimeMillis();

        return pid;
    }
}
