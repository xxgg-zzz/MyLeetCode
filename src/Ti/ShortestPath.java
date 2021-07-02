package Ti;

import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class ShortestPath {

    public static void main(String[] args) {

        String path = "/home/";
        String s = new ShortestPath().simplifyPath(path);
        System.out.println(s);
    }


    public String simplifyPath(String path) {
        String[] strs = path.split("/");
        Deque<String> stringDeque = new LinkedBlockingDeque<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strs) {
            switch (str){
                case ".":
                case "":
                    break;
                case "..":
                    if(!stringDeque.isEmpty()){
                        stringDeque.removeLast();
                    }
                    break;
                default:
                    stringDeque.offer(str);
                    break;
            }
        }
        while (!stringDeque.isEmpty()){
            stringBuffer.append("/");
            stringBuffer.append(stringDeque.pop());
        }
        if (stringBuffer.length()==0){
            stringBuffer.append("/");
        }

        return stringBuffer.toString();
    }

}
