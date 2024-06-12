package study.lessons.lessons7;

public class Test {
    public static void main(String[] args) {
        /*System.out.println(Person.HOBBY);
        Person.work = "singer";
        System.out.println(Person.work);
        Person.work = "seller";
        System.out.println(Person.work);

        Person person1 = new Person("Irina",32);
        person1.showCount();
        Person.increaseCount();
        person1.showCount();*/

        Person person1 = new Person("Irina",32);
        person1.showCount();

        Person person2 = new Person("Ivan",33);
        person2.showCount();
        person2.showCount();
        person1.showCount();

        Person person3 = new Person("Maks",35);
        person3.showCount();
        person3.showCount();
        person2.showCount();
        person1.showCount();
        person1.showCount();
    }
}
