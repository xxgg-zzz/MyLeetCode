package Ti;

import java.util.*;

public class RelativeRanking {
    /**
     * “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"
     */

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        String[] strings = new RelativeRanking().findRelativeRanks(nums);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public String[] findRelativeRanks(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return (x > y) ? -1 : ((x == y) ? 0 : 1);
            }
        });
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            priorityQueue.add(nums[i]);
        }
        String[] result = new String[nums.length];

        int count = 1;

        while (!priorityQueue.isEmpty()) {
            int key = priorityQueue.poll();
            if (count == 1) {
                result[map.get(key)] = "Gold Medal";
            } else if (count == 2) {
                result[map.get(key)] = "Silver Medal";
            } else if (count == 3) {
                    result[map.get(key)] = "Bronze Medal";
            } else {
                result[map.get(key)] = "" + count;
            }
            count++;
        }

        return result;
    }

}
