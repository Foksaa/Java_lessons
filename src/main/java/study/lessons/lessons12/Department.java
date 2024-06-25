package study.lessons.lessons12;

import java.util.ArrayList;

public class Department {
    ArrayList<Employee> workers_ = new ArrayList<>(12);

    public void addEmployee(Employee worker) {
        workers_.add(worker);
    }

    public void removeEmployee(Employee worker) {
        workers_.remove(worker);
    }

}











