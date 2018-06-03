import java.time.LocalDate;
import java.util.Objects;
import java.lang.Object;
import java.util.Random;
import java.util.Arrays;
import java.util.Date;

/*
We need a comparable interface if 
we want to sort it using the Arrays.sort() function
*/

public class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private double salary;
    private LocalDate hireDay;

    private int id;
    // There will only be one nextId field that is
    // shared among all instances of the class
    private static int nextId = 1;

    // Initialization block
    {
        id = nextId;
        nextId++;
    }

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee(" + getName() + ", " + 
                getSalary() + ", " + getHireDay() + ")";
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    // @Override
    // public int compareTo(Object otherObject) {
    //     Employee other = (Employee) otherObject;
    //     return Double.compare(salary, other.salary);
    // }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

    public Employee clone() throws CloneNotSupportedException {
        // Shallow copy
        // return (Employee) super.clone();

        // Deep copy
        Employee cloned = (Employee) super.clone();

        // clone mutable fields
        //cloned.hireDay = (LocalDate) hireDay.clone();

        return cloned;
    }

    public static void main(String[] args) {
        String[] words = {"jaime", "abbariao", "jenny", "chen"};

        // Suppose that I want to sort it by the length of the string
        Arrays.sort(words, (first, second)-> first.length() - second.length());

        for (String word: words) {
            System.out.print(word + " ");
        }

        System.out.println();
    }
}