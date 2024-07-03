package study.lessons.lessons14;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", "Дворовой", 4);

        Map<Integer, Cat> catMap = new HashMap<>();
        catMap.put(100, barsik);

        Map<Integer, Integer> nums = new HashMap<>();
        nums.put(0, 168423158);

        System.out.println(nums.equals(catMap)); //здесь может возникнуть коллизия (вероятность низкая)


        System.out.println(catMap);
    }
}
