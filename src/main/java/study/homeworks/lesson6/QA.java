package study.homeworks.lesson6;

public class QA {
    public static void main(String[] args) {
        Department department = new Department();
        department.addEmployee();
        department.addEmployee();
        department.addEmployee();
        department.addEmployee();
        department.checkNumbersOfEmployee();
        department.showNumberOfEmployee();
        department.removeEmployee();
        department.checkNumbersOfEmployee();
        department.showNumberOfEmployee();
        department.addEmployee();
        department.checkNumbersOfEmployee();
        department.addEmployee();
        department.showNumberOfEmployee();
        System.out.println("Название отдела: " + Department.NAME);
        department.checkNumbersOfEmployee();
    }
}
