package study.lessons.lessons14;


public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Irina",32);

        Person person2 = new Person("Irina",32);

        Person person3 = new Person("Maks",35);

        person1.getName();

        String name1 = person1.getName();
        String name2 = person2.getName();

        int age1 = person1.getAge();
        int age2 = person2.getAge();




        System.out.println(name1.equals(name2));//сравнивает строки(объекты)
        System.out.println(age1 == age2);//сравнивает примитивы
        System.out.println(person1.equals(person2)); //сравнивает объекты

    }
}
