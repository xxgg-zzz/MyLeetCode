package Ti;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class RevertNumber_7 {

    public static void main(String[] args) {

        int x = -1277777228;
        System.out.println(revertIt(x));

    }

    private static int revertIt(int x) {
        long a = 0;
        while(x!=0){
            a = a*10+x%10;
            x = x/10;
        }
        return (int) a == a ? (int) a : 0;
    }

}
