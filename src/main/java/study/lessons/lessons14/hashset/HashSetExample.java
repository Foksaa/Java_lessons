package study.lessons.lessons14.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> integerSet1 = new HashSet<>();//set - это коллекция уникальных элементов
        integerSet1.add(1);
        integerSet1.add(100);
        integerSet1.add(1);
        integerSet1.add(1);
        integerSet1.add(1);
        integerSet1.add(1000);
        integerSet1.add(25);
        integerSet1.add(-50);

        System.out.println(integerSet1);

        System.out.println(integerSet1.size()); //размер Set

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(50);
        integerSet2.add(51);

        System.out.println(integerSet1.hashCode() == integerSet2.hashCode()); //здесь коллизия
        System.out.println(integerSet1.equals(integerSet2));

        integerSet1.remove(1); //удалить
        System.out.println(integerSet1);

        System.out.println(integerSet1.contains(50));

        //как устроен Set под капотом?

        Map<String, Object> map = new HashMap<>();
        map.put("Анна", new Object());
        map.put("Ирина", new Object());
        map.put("Макс", new Object());
        map.put("Дарья", new Object());
        map.put("Михаил", new Object());
        System.out.println(map);

        Set<String> set = new HashSet<>();
        set.add("Анна");
        set.add("Ирина");
        set.add("Макс");
        set.add("Дарья");
        set.add("Михаил");
        System.out.println(set);

    }
}
