package Ti;

public class Septenary {

    /**
     * 给定一个整数，将其转化为7进制，并以字符串形式输出。
     */

    public static void main(String[] args) {

        int num = -7;
        String s = new Septenary().convertToBase7(num);
        System.out.println(s);

    }

    public String convertToBase7(int num) {
        boolean minusFlag = false;
        if(num<0){
            minusFlag = true;
            num = -num;
        }
        StringBuffer sb = new StringBuffer();
        while (num!=0){
            int x = num%7;
            sb.append(x);
            num = num/7;
        }
        if(minusFlag){
            sb.append("-");
        }
        String result = sb.reverse().toString();
        return result;
    }

}
