package StopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime, endTime;
    Date date = new Date();

    public StopWatch() {
        this.startTime = date.getTime();
    }

    public long getterStarTime() {
        return this.startTime;
    }

    public long getterStopTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = date.getTime();
    }

    public void stop() {
        this.endTime = date.getTime();
    }

    public int getElapsedTime() {
        return (int) (this.endTime - this.startTime);
    }

}
