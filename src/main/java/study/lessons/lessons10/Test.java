package study.lessons.lessons10;

public class Test {
    String s1 = new String("    He  llo   ");
    String s2 = new String("HELLO");
    Integer i = 15;
    boolean abc = true;


    public static void main(String[] args) {
        Test primer1 = new Test();
        Test primer2 = new Test();
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("Hello" == str2); // здесь идет сравнение значений в String pool
        System.out.println(primer1.s1.equals(primer2.s2)); // данный метод проверяет присовенные значения
        System.out.println(primer1.s1.charAt(1));//метод получения символа по индексу из строки
        System.out.println(primer1.s1.equalsIgnoreCase(primer2.s2));//сравнивает без учета регистра
        System.out.println(primer1.s1.trim());// убирает пробелы перед и в конце слова, а внутри оставляет
        System.out.println(primer1.i.toString());

        Cat kot = new Cat("Simba", "bengal", 6);
        System.out.println(kot.toString());
        System.out.println(primer1.i + primer2.s1);

    }
}
