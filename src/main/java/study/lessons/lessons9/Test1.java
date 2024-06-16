package study.lessons.lessons9;

public class Test1 {
    public static void main(String[] args) {
        boolean b = true;
        int i = 0;
        while (b) {
            i++;
            if (i == 10){
                break;
            }

            System.out.println(b);
        }
    }
}
