package Ti;

import java.util.HashMap;
import java.util.Map;

public class TransRomar {

    public static void main(String[] args) {

        /**
         *
         I - 1
         V - 5
         X - 10
         L - 50
         C - 100
         D - 500
         M - 1000
         I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
         X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
         C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
         */
        String str = "CMXCIX";
        int i = trans(str);
        System.out.println(i);
    }

    private static int trans(String str) {
        int result  = 0;
        Map<Character,Integer> romarMap = new HashMap<>();
        romarMap.put('I',1);
        romarMap.put('V',5);
        romarMap.put('X',10);
        romarMap.put('L',50);
        romarMap.put('C',100);
        romarMap.put('D',500);
        romarMap.put('M',1000);
        
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];
            switch (c1){
                case 'I':
                    result += romarMap.get('I');
                    break;
                case 'V':
                    result += romarMap.get('V');
                    if(i>=1&&c[i-1]=='I'){
                        result -= 2*romarMap.get('I');
                    }
                    break;
                case 'X':
                    result += romarMap.get('X');
                    if(i>=1&&c[i-1]=='I'){
                        result -= 2*romarMap.get('I');
                    }
                    break;
                case 'L':
                    result += romarMap.get('L');
                    if(i>=1&&c[i-1]=='X'){
                        result -= 2*romarMap.get('X');
                    }
                    break;
                case 'C':
                    result += romarMap.get('C');
                    if(i>=1&&c[i-1]=='X'){
                        result -= 2*romarMap.get('X');
                    }
                    break;
                case 'D':
                    result += romarMap.get('D');
                    if(i>=1&&c[i-1]=='C'){
                        result -= 2*romarMap.get('C');
                    }
                    break;
                case 'M':
                    result += romarMap.get('M');
                    if(i>=1&&c[i-1]=='C'){
                        result -= 2*romarMap.get('C');
                    }
                    break;
            }

        }

        
        

        return result;
    }

}
