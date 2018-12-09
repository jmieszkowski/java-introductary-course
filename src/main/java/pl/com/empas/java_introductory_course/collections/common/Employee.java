package pl.com.empas.java_introductory_course.collections.common;

public class Employee {
    private final int employeeNumber;
    private final String name;
    private final long salary;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int employeeNumber, String name, long salary) {

        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return String.format("%04d", employeeNumber);
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }
}
