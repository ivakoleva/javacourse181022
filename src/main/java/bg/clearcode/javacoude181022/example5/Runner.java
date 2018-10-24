package bg.clearcode.javacoude181022.example5;

import java.util.EnumSet;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public static final Country country = Country.BULGARIA;
    public static final EnumSet<Country> uk = EnumSet.of(Country.ENGLAND, Country.WALES);

    public static void main(String[] args) throws InterruptedException {
        /*System.out.println("language code: [" + country.getLanguageCode() + "] year of creation: [" + country.getYear() + "]");
        //uk.add(Country.BULGARIA);

        final EnumMap<Country, Set<String>> countyMap = new EnumMap<Country, Set<String>>();
        Arrays.stream(Country.values()).forEach(country -> {
            final Set<String> languages = new HashSet<>();
            // todo: populate
            countyMap.put(country, languages);
        });

        final Set<String> bulgariaLanguages = countyMap.get(Country.BULGARIA);*/


        final Runner runner = new Runner();
        final Runnable runnable = () -> {
            try {
                runner.test();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        final Thread thread1 = new Thread(runnable);
        final Thread thread2 = new Thread(runnable);

        thread1.start();
        Thread.sleep(1000 * 1);
        thread2.start();

        System.out.println("joining...");
        thread1.join();
        thread2.join();
        System.out.println("joined, exiting.");

    }

    synchronized public void test() throws InterruptedException {
        synchronized (Runner.class) { //
            System.out.println(Thread.currentThread().getName() + ": test start [" + System.currentTimeMillis() + "]");
            Thread.sleep(1000 * 5);
            System.out.println(Thread.currentThread().getName() + ": test end [" + System.currentTimeMillis() + "]");
        }
    }

    synchronized public static void test1() {
        System.out.println(Thread.currentThread().getName() + ": test1");
    }

    public static void test3() {
        synchronized (Runner.class) {
            System.out.println(Thread.currentThread().getName() + ": test3");
        }
    }
}
