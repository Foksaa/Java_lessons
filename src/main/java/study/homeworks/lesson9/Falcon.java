package study.homeworks.lesson9;

public class Falcon extends Bird implements Huntable, Flyable, Eatable {

    public Falcon(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunt() {
        Huntable huntable = () -> {
            System.out.println("Сокол летит на охоту");
        };
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }
}
