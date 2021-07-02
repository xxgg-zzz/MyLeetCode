package Ti;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Symmetry {

    public static void main(String[] args) {
//        "aabcccccaa"
        String s = new Symmetry().compressString("aabcccccaa");
        System.out.println(s);

    }

    public String compressString(String s) {

        if(s==null || s.length() ==0){
            return s;
        }

        Deque<KeyNode> deque = new LinkedBlockingDeque<>();
        for(int i = 0; i < s.length(); i++){
            if(deque.size() == 0){
                KeyNode temp = new KeyNode();
                temp.key = s.charAt(i);
                temp.count = 1;
                deque.addLast(temp);
            }else{
                if(deque.getLast().key == s.charAt(i)){
                    KeyNode temp = deque.removeLast();
                    temp.count = temp.count+1;
                    deque.addLast(temp);
                }else{
                    KeyNode temp = new KeyNode();
                    temp.key = s.charAt(i);
                    temp.count = 1;
                    deque.addLast(temp);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        while (!deque.isEmpty()){
            KeyNode temp = deque.pop();
            sb.append(temp.key);
            sb.append(temp.count);

        }
        return sb.length() >= s.length() ? s:sb.toString();
    }
    class KeyNode{
        char key;
        int count;
    }


//    public boolean oneEditAway(String first, String second) {
//        int len1 = first.length();
//        int len2 = second.length();
//        if(Math.abs(len1-len2)>1){
//            return false;
//        }
//        boolean chance = true;
//        for(int i = 0, j = 0; i < len1 && j < len2; i++,j++){
//
//            if(first.charAt(i)==second.charAt(j)){
//                continue;
//            }else if(!chance){
//                return false;
//            }else{
//                if(len1==len2){
//                    continue;
//                }
//                if(len1 > len2){
//                    j--;
//                }else{
//                    i--;
//                }
//                chance = false;
//            }
//
//        }
//
//        return true;
//
//    }



}
