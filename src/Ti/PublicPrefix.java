package Ti;

public class PublicPrefix {

    public static void main(String[] args) {
        String[] strs = {"aasddeea","aaddgg","aaduiu"};

        String result = getPrefix(strs);
        System.out.println(result);

    }

    private static String getPrefix(String[] strs) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean breakFlag = true;
        int index = 0;
        String temp = "";
        while (true){
            for (int i = 0; i < strs.length; i++) {
                if(index>=strs[i].length()){
                    return stringBuffer.toString();
                }
                if(i == 0){
                    temp =  strs[i].substring(index,index+1);
                }else {
                    if(!temp.equals(strs[i].substring(index,index+1))){
                        breakFlag = false;
                    }
                }

            }
            if(breakFlag){
                stringBuffer.append(temp);
            }
            index++;
        }
    }

}
