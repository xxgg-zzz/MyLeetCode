package Ti;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> maxQueue;

    public MaxQueue() {
        queue = new LinkedList<>();
        maxQueue = new LinkedList<>();
    }

    public int max_value() {
        return maxQueue.isEmpty()? -1:maxQueue.peekFirst();
    }

    public void push_back(int value) {
        while (!maxQueue.isEmpty() && maxQueue.peekLast() < value) {
            maxQueue.pollLast();
        }
        maxQueue.offerLast(value);
        queue.offer(value);
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }
        if(queue.peek() == maxQueue.peek()){
            maxQueue.pollFirst();
            return queue.poll();
        }
        return queue.poll();
    }
}
