package Ti;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStone {

    public static void main(String[] args) {

        int[] stones = {2,7,4,1,8,1};
        int r = new LastStone().lastStoneWeight(stones);
        System.out.println(r);

    }

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(stones).forEach(priorityQueue::add);

        int result = 0;
        int k1 = 0;
        int k2 = 0;
        while (!priorityQueue.isEmpty()){

            k1 = priorityQueue.poll();
            System.out.print(k1);
            if(!priorityQueue.isEmpty()){
                k2 = priorityQueue.poll();
            }else{
                k2 = 0;
            }
            System.out.println(k2);
            result = Math.abs(k1-k2);
            if(priorityQueue.isEmpty()){
                break;
            }
            priorityQueue.add(result);
        }
        return result;


    }

}
