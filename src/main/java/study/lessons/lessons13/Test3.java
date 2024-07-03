package study.lessons.lessons13;

public class Test3 {

    public static void main(String[] args) {
        Relaxable relaxable = () -> { //лямбда выражение. по сути тоже анонимный, просто более компактный
            System.out.println("Время отдыхать");
        };
        Relaxable relaxable1 = new Relaxable() { //анонимный класс
            @Override
            public void relax() {
                System.out.println("Время отдыхать");

            }
        };

        Workable workable = (salary, name) -> System.out.println(salary + name);
        workable.work(500, "Irina");

    }
}

