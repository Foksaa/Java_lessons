package study.lessons.lessons9;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){

            if (i == 2) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

    }
}
