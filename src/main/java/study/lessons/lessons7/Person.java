package study.lessons.lessons7;

public final class Person {
    private String name;
    private final int age;
    public static String work = "qa";
    public static final String HOBBY = "Drawing";// если статик финал, то переменная только капсом
    private static int count;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        increaseCount();
    }

    public static void increaseCount(){
        count++;
    }
    public void showCount(){
        System.out.println(count);
    }




    public void setName(String name) {
        this.name = name;
    }

    /*public void setAge(int age) {
        this.age = age;
    }*/

    public void setWork(String work) {
        Person.work = work;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

}
