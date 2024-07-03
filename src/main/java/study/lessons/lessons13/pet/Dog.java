package study.lessons.lessons13.pet;

public class Dog extends Animal implements Eatable, Soundable {

    @Override
    public void feed() {
        System.out.println("Собака кушает");
    }

    @Override
    public void sound() {
        System.out.println("Собака гавкает");

    }

    @Override
    void sleep() {

    }
}
