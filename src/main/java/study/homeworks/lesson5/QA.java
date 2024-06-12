package study.homeworks.lesson5;
public class QA {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.showCount();
        employee1.minusCount();
        employee1.showCount();
        employee1.addEmployee();
        employee1.addEmployee();
        employee1.showCount();
        System.out.println("Название отдела: " + Employee.DEPARTMENT);

    }
}
