package study.lessons.lessons13.pet;

public class Cat extends Animal implements Eatable, Soundable {
    void move(){
        System.out.println("Кошка начала беситься");
    }

    @Override
    void sleep() {

    }

    @Override
    public void feed() {
        System.out.println("Кошка кушает");
    }

    @Override
    public void sound() {
        System.out.println("Кошка мяукает");

    }
}
