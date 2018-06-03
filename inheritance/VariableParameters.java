package inheritance;

public class VariableParameters {
    /*
    public void f(Object... args);
    Object.. args === Object[] args
    */

    // same as passing an array of doubles
    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v: values) { 
            if (v > largest) {
                largest = v;
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        Student s = new Student("jaime", "computer science");
        System.out.println(s.getClass().getName());
    }
}