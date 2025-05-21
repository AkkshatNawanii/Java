package test.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(
                () -> System.out.println("Task executed after every 5 second delay!"),
                2,
                2 ,
                TimeUnit.SECONDS
        );
        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown... ");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
    }
}
