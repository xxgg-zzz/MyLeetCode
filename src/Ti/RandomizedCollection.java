package Ti;

import java.util.*;

public class RandomizedCollection {

    Map<Integer, Set<Integer>> kMap;
    List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public RandomizedCollection() {
        kMap = new HashMap<>();
        list = new ArrayList<>();
    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not
     * already contain the specified element.
     */
    public boolean insert(int val) {
        list.add(val);
        if (kMap.containsKey(val)) {
            kMap.get(val).add(list.size() - 1);
            return false;
        } else {
            Set<Integer> set = new HashSet<>();
            set.add(list.size() - 1);
            kMap.put(val, set);
            return true;
        }
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        if (!kMap.containsKey(val)) {
            return false;
        }

        Iterator<Integer> it = kMap.get(val).iterator();
        int i = it.next();
//        kMap.get(val).remove(i);
        if (i == list.size() - 1) {
            list = new ArrayList<>();
            return true;
        }
        list.set(i, list.get(list.size() - 1));
        kMap.get(list.get(list.size() - 1)).remove(list.size() - 1);
        kMap.get(list.get(list.size() - 1)).add(i);

        list.remove(list.size() - 1);
        return true;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        return list.get((int) (Math.random() * list.size()));
    }

    public static void main(String[] args) {

        // 初始化一个空的集合。
        RandomizedCollection collection = new RandomizedCollection();

// 向集合中插入 1 。返回 true 表示集合不包含 1 。
        System.out.println(collection.insert(1));

// 向集合中插入另一个 1 。返回 false 表示集合包含 1 。集合现在包含 [1,1] 。
        System.out.println(collection.insert(1));

// 向集合中插入 2 ，返回 true 。集合现在包含 [1,1,2] 。
        System.out.println(collection.insert(2));

// getRandom 应当有 2/3 的概率返回 1 ，1/3 的概率返回 2 。
        collection.getRandom();

// 从集合中删除 1 ，返回 true 。集合现在包含 [1,2] 。
        collection.remove(1);

// getRandom 应有相同概率返回 1 和 2 。
        collection.getRandom();

    }

}
