package bg.clearcode.javacoude181022.example12;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 25.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public static void main(String[] args) {
        // resource-expensive
        //final Thread thread = new CustomThread();

        /*
        final Callable<String> callable = () -> {
            System.out.println(value);
            return value;
        }*/
        ;

        // callable & future example
        /*final String value = "done.";
        final BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(10);
        final ExecutorService executorService = new ThreadPoolExecutor(
                2,
                3,
                30L,
                TimeUnit.MILLISECONDS,
                blockingQueue
        );

        final List<Future<String>> futureList = IntStream.range(0, blockingQueue.remainingCapacity()).boxed().map(i -> (Callable<String>) () -> {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            return value;
        }).map(executorService::submit).peek(future -> {
            System.out.println("getting future: " + future);
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }).collect(Collectors.toList());

        while (!futureList.stream().allMatch(Future::isDone)) {
            System.out.println("Waiting...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("exiting");*/

        // runnable & wait for all completed
        /*final BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(10);
        final ExecutorService executorService = new ThreadPoolExecutor(
                2,
                3,
                30L,
                TimeUnit.MILLISECONDS,
                blockingQueue
        );

        //final int[] iArray = new int[1];
        //final AtomicReference<Person> personAtomicReference = new AtomicReference<>(new Person());
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        IntStream.range(0, blockingQueue.remainingCapacity()).boxed().map(i -> (Runnable) () -> {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            System.out.println("modifying counter: " + atomicInteger.incrementAndGet());
        }).forEach(runnable -> {
            System.out.println("executing runnable: " + runnable);
            executorService.execute(runnable);
        });

        while (atomicInteger.get() < 10) {
            System.out.println("Waiting...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("exiting");*/

        /*final ExecutorService executorService = Executors.newFixedThreadPool(10, r -> new CustomThread(0));
        executorService.submit(() ->System.out.println("hi!"));
        executorService.submit(() ->System.out.println("hi 1!"));
        executorService.submit(() ->System.out.println("hi 2!"));
        try {
            Thread.sleep(1000 * 6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.exit(0);
    }
}
