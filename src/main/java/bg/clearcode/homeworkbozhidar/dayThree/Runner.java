package bg.clearcode.homeworkbozhidar.dayThree;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final SynchronousQueue<Organization> synchronousQueue = new SynchronousQueue<>();

        final Thread threadPush = new Thread(() -> {
            final Organization clearCode = new Organization("ClearCode", "Ltd.", LocalDateTime.now());
            final Organization newHorizons = new Organization("New Horizons", "Ltd.", LocalDateTime.now());
            threadPrint("I am here to push");

            while (!synchronousQueue.offer(clearCode)) {
            }
            threadPrint("clearcode added");

            threadPrint("adding new horizons");
            while (!synchronousQueue.offer(newHorizons)) {
            }
            threadPrint("new horizons added");

            threadPrint("Stack size before remove : " + synchronousQueue.size());
        });

        final Thread threadRemove = new Thread(() -> {
            try {
                threadPrint("I am here to remove");
                Organization organization;
                int i = 0;

                do {
                    threadPrint("polling " + i++);
                    organization = synchronousQueue.poll(1, TimeUnit.MINUTES);
                    if (organization == null) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        threadPrint("polled: " + organization);
                    }
                } while (organization == null);
                threadPrint("Stack size after remove : " + synchronousQueue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadPush.start();
        threadRemove.start();

        try {
            threadPush.join();
            threadRemove.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void threadPrint(final String value) {
        System.out.println(Thread.currentThread().getName() + ": " + value);
    }
}