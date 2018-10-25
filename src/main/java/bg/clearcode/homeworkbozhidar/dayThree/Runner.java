package bg.clearcode.homeworkbozhidar.dayThree;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.Stack;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        final Organization clearCode = new Organization("ClearCode", "Ltd.", LocalDateTime.now());
        final Organization newHorizons = new Organization("New Horizons", "Ltd.", LocalDateTime.now());
        final Stack<Organization> stack = new Stack<>();

        final Thread threadPush = new Thread(() -> {
            System.out.println("I am here to push");
            stack.push(clearCode);
            stack.push(newHorizons);
            System.out.println("Stack size before remove : " + stack.size());
        });

        final Thread threadRemove = new Thread(() -> {
            System.out.println("I am here to remove");
            while (stack.size() > 0) {
                stack.pop();
            }
            System.out.println("Stack size after remove : " + stack.size());
        });

        try {
            threadPush.start();
            threadRemove.start();
        } finally {
            try {
                threadPush.join();
                threadRemove.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}