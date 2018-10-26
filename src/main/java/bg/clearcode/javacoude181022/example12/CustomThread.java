package bg.clearcode.javacoude181022.example12;

import java.util.stream.IntStream;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 26.10.2018,
 * a significant bit of leva.bg project.
 */
public class CustomThread extends Thread {
    int counter;
    int maxCount = 10;

    public int getCounter() {
        return counter;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public CustomThread(int counter) {
        this.counter = counter;
    }

    public CustomThread(final int counter, final int maxCount) {
        this.counter = counter;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": runned.");
        IntStream.range(0, maxCount)
                .forEach(i -> System.out.println(Thread.currentThread().getName() + ": counter " + ++counter));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": done.");
    }
}