package study.lessons.lessons12;

import java.util.Arrays;

public class Result {
    public static void main(String[] args) {
        Department department = new Department();
        Employee intern = new Employee("Vasya", "treini_qa", 50000);
        Employee junior = new Employee("Anna", "junior_qa", 70000);
        Employee middle = new Employee("Misha", "middle_qa", 100000);
        Employee senior = new Employee("Max", "senior_qa", 150000);

        department.workers_.add(intern);
        department.workers_.add(junior);
        department.workers_.add(middle);
        department.workers_.add(senior);

        department.addEmployee(new Employee("Zoya", "lead_qa", 200000));
        System.out.println("Список сотрудников на данный момент: " + department.workers_);
        department.removeEmployee(middle);
        System.out.println("Список сотрудников на данный момент: " + department.workers_);







    }
}
