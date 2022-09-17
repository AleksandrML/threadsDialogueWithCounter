import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallable myCallable = new MyCallable();
        ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        // run all threads and get result from the fastest one:
        Integer result = threadPool.invokeAny(new ArrayList<>(List.of(myCallable, myCallable, myCallable, myCallable)));
        System.out.println(result);
        threadPool.shutdown();
    }
}