package study.lessons.lessons14.treeset;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(1);
        integerSet.add(100);
        integerSet.add(50);
        integerSet.add(-200);
        integerSet.add(200);
        integerSet.add(800);
        integerSet.add(20000);

        System.out.println(integerSet);

        integerSet.remove(100);

        System.out.println(integerSet);

        Random random = new Random();
        Integer i = random.nextInt(0, 2);;
        random.nextInt(100);

        System.out.println(i);
        if (!integerSet.contains(i)) { //проверить есть ли элемент
            integerSet.add(i);
        }

        for (Integer integer: integerSet) { //пройти по set с помощью цикла fot
            System.out.println(integer);
        }

        System.out.println(integerSet);

        //В чем отличие TreeSet от HashSet
    }
}
