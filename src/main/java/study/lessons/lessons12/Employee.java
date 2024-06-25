package study.lessons.lessons12;


import java.util.Objects;

public class Employee {
    public String name;
    public String job;
    public int salary;

    public Employee(String name, String job, int salary){
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(job, employee.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, job, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
