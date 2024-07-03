package study.homeworks.lesson9;

public class Crow extends Bird implements Huntable, Eatable, Flyable {


    public Crow(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunt() {
        Huntable huntable = () -> {
            System.out.println("Ворона летит на охоту");
        };

    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }
}
