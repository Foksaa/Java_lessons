package study.homeworks.lesson6;

public class Department {
    public static final String NAME = "IT_QA";
    private static int numberOfEmployee = 10;

    public Department(){

    }

    public void addEmployee(){
        numberOfEmployee++;
        System.out.println("Новый сотрудник трудоустроился");
    }
    public void removeEmployee(){
        numberOfEmployee--;
        System.out.println("Сотрудник уволился");
    }

    public int showNumberOfEmployee(){
        return numberOfEmployee;
    }
    public void checkNumbersOfEmployee(){
        if (numberOfEmployee > 10) {
            System.out.println("Штат сотрудников стал слишком большим");
        } else if (numberOfEmployee <= 8) {
            System.out.println("В штате не хватает сотрудников");
        } else if (numberOfEmployee == 9 || numberOfEmployee == 10) {
            System.out.println("В штате достаточное количество сотрудников");
        }
    }

}

