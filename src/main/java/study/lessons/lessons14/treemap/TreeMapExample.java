package study.lessons.lessons14.treemap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");
        treeMap.put(100, "three");
        treeMap.put(500, "three");

        System.out.println(treeMap);

        System.out.println(treeMap.firstKey()); // в отличие от HashMap - TreeMap можно отсортировать
    }
}
