package study.lessons.lessons13.pet;

public class Fish extends Animal implements Eatable {

    @Override
    public void feed() {
        System.out.println("Рыба кушает");
    }

    @Override
    void sleep() {

    }
}
