package study.homeworks.lesson8;
import java.util.Arrays;

public class Department {
    Employee[] workers = new Employee[12];

    public void addEmployee(Employee worker) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                workers[i] = worker;
                break;
            }
        }
    }

    public void removeEmployee(Employee worker) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].name.equals(worker.name)) {
                workers[i] = null;
            }

        }

    }
}











