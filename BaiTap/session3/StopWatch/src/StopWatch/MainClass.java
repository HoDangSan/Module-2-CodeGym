package StopWatch;

public class MainClass {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.stop();
        System.out.println(stopWatch.getterStarTime());
        System.out.println(stopWatch.getterStopTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
