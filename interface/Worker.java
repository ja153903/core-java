import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.Arrays;

public class Worker implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        // do some work
    }

    static {
        String[] strings = {"jaime", "abbariao"};
        Arrays.sort(strings, new LengthComparator());
    };
}

class LengthComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}

// we would do something like this where we pass in a comparator