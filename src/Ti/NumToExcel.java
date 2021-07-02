package Ti;

public class NumToExcel {

    public static void main(String[] args) {

        System.out.println(701%26);


    }

    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while(n > 0){
            sb.append('A'+ n%26);
            n = n/26;
        }
        return sb.reverse().toString();
    }

}
