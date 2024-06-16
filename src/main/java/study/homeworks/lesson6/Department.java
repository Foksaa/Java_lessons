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
        boolean b = numberOfEmployee > 10;
        boolean c = numberOfEmployee <= 8;
        boolean d = numberOfEmployee == 9 || numberOfEmployee == 10;
        if (b) {
            c = true;
            d = true;
            System.out.println("Штат сотрудников стал слишком большим");
        }
        if (c) {
            System.out.println("В штате не хватает сотрудников");
        }
        if (d) {
            System.out.println("В штате достаточное количество сотрудников");
        }
    }

}

