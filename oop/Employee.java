import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Employee {
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
}