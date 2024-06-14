package study.lessons.lessons8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(31);
        System.out.println(randomNumber);

        if (randomNumber == 3) {
            System.out.println("Угадали число 3");
        } else if (randomNumber <= 10 && randomNumber > 3) {
            System.out.println("Не угадали, число от 4 до 10");
        } else if (randomNumber >= 11 && randomNumber < 30) {
            System.out.println("Не угадали, число  от 11 до 29");
        } else {
            System.out.println("Ничего не угадали");
        }

        String word = randomNumber >= 10 ? "Hello World!" : "Goodbye World!";
        System.out.println(word);

    }
}
