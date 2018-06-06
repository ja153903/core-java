import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.Timer;

class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr.add(i);
        }

        // we get to pass in a lambda here
        arr.removeIf(element -> element % 2 == 0);

        for (int i =0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        // Method reference which is essentially a lambda
        Timer t = new Timer(1000, System.out::println);

        // Suppose we want to sort lexicographically and not care about the case
        String[] names = {"jaime", "abbariao", "korea", "japan", "texas"};

        Arrays.sort(names, String::compareToIgnoreCase);
    }
}

class Greeter {
    public void greet() {
        System.out.println("Hello, world!");
    }
}

class TimedGreeter extends Greeter {
    public void greet() {
        Timer t = new Timer(1000, super::greet);
        t.start();
    }
}