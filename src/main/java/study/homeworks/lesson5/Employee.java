package study.homeworks.lesson5;

public class Employee {
    public static final String DEPARTMENT = "IT_QA";
    private static int count = 10;
    private String name;
    private int salary;
    private String job;

    public Employee(){

    }

    public Employee(String name, int salary, String job){
        this.name = name;
        this.salary = salary;
        this.job = job;
    }

    public void addEmployee(){
        plusCount();
    }
    public void plusCount(){
        count++;
        System.out.println("Новый сотрудник трудоустроился");
    }
    public void minusCount(){
        count--;
        System.out.println("Сотрудник уволился");
    }

    public void showCount(){
        System.out.println("Всего сотрудников: " + count);
    }

}

