package study.lessons.lesson3;

import study.lessons.lessons13.Workable;

public class App implements Workable {
    public static void main(String[] args) {
        Arithmetic arithmetic1 = new Arithmetic();
        Arithmetic arithmetic2 = new Arithmetic();
        System.out.println(arithmetic1 == arithmetic2);


    }

    @Override
    public void work(int salary, String name) {

    }
}
