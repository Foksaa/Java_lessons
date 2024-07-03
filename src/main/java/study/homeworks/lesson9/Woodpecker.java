package study.homeworks.lesson9;

public class Woodpecker extends Bird implements Huntable, Eatable, Flyable {

    public Woodpecker(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunt() {
        Huntable huntable = () -> {
            System.out.println("Дятел тоже охотник");
        };
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }
}
