package study.lessons.lessons12;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("Privet");
        array1.add("Ok");
        array1.add(2, "Bye bye");
        System.out.println(array1);

        array1.remove("Ok");
        System.out.println(array1);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("Odin");
        array2.add(1,"Dva");
        array2.add("tri");
        System.out.println(array1.addAll(array2));
        System.out.println(array1);



    }
}
