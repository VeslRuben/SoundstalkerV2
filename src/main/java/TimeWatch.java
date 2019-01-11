import java.util.concurrent.TimeUnit;

public class TimeWatch {

    private long startTime;
    private long previousElapsedTime;

    public TimeWatch() {
        this.startTime = 0;
        this.previousElapsedTime = 0;
    }

    /**
     * Run this method once before using to set start time.
     */
    public void start() {
        this.startTime = System.nanoTime();
    }

    /**
     * Calculates elapsed time
     * @return elapsed time since this.startTime was set in nano seconds
     */
    private long time() {
        long elapsedTime = System.nanoTime() - this.startTime;
        if (elapsedTime < 0) {
            elapsedTime = this.previousElapsedTime;
        }
        this.previousElapsedTime = elapsedTime;
        return elapsedTime;
    }

    /**
     * Returns the elapsed time since last method call in whichever time unit specified
     * @param timeUnit the specified return time unit
     * @return elapsed time since last call in specified time unit
     */
    public long elapsedTime(TimeUnit timeUnit) {
        long elapsedTime = timeUnit.convert(time(), TimeUnit.NANOSECONDS);
        this.start();
        return elapsedTime;
    }
}
