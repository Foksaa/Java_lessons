package study.lessons.lessons13;

import study.lessons.lessons12.Employee;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(100);
        numbers.add(50);
        numbers.add(55);

        List<Integer> newNumbers = numbers.stream().filter(number -> number >= 50).toList();
        System.out.println(newNumbers);

    }
}
