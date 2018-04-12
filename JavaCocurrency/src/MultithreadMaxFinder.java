import java.util.concurrent.*;

public class MultithreadMaxFinder {
    public static int max(int[] data) throws ExecutionException, InterruptedException {
        if (data.length == 1) {
            return data[0];
        } else if (data.length == 0) {
            throw new IllegalArgumentException();
        }
        FindeMaxTask task1 = new FindeMaxTask(data, 0, data.length / 2);
        FindeMaxTask task2 = new FindeMaxTask(data, data.length / 2, data.length);

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = service.submit(task1);
        Future<Integer> future2 = service.submit(task2);
        return Math.max(future1.get(), future2.get());
    }
}
