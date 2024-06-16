package study.lessons.lessons9;


import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int i = 0;
        do {
            Random random = new Random();
            i = random.nextInt(10);
            System.out.println("Поехали!");
            System.out.println(i);
        }
        while (i != 5);
    }
}
