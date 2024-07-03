package study.lessons.lessons14;

public class HashExample {
    Integer num1 = 100; //здесь хэш-код = 10
    Integer num2 = 100; //здесь хэш-код = 20
    String str1 = "Wall";
    String str2 = "Wall";

    Person person1 = new Person("Irina",32);

    Person person2 = new Person("Irina",32);

    public static void main(String[] args) {
        HashExample hashExample = new HashExample();

        //хэш код для чисел
        boolean isEqual = hashExample.num1.hashCode() == hashExample.num2.hashCode();
        System.out.println(isEqual);

        System.out.println("Хэш код для num1 " + hashExample.num1.hashCode());
        System.out.println("Хэш код для num2 " + hashExample.num2.hashCode());

        //хэш код для строк
        isEqual = hashExample.str1.hashCode() == hashExample.str2.hashCode();
        System.out.println(isEqual);

        System.out.println("Хэш код для str1 " + hashExample.str1.hashCode());
        System.out.println("Хэш код для str2 " + hashExample.str2.hashCode());

        //хэш код для объектов

        isEqual = hashExample.person1.hashCode() == hashExample.person2.hashCode();
        System.out.println(isEqual);

        System.out.println("Хэш код для person1 " + hashExample.person1.hashCode());
        System.out.println("Хэш код для person2 " + hashExample.person2.hashCode());
    }
}
