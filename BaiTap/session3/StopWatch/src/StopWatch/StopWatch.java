package StopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime, endTime;
    Date date = new Date();

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getterStarTime() {
        return this.startTime;
    }

    public long getterStopTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public int getElapsedTime() {
        return (int) (this.endTime - this.startTime);
    }

}
