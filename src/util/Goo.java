package util;

import java.util.concurrent.Semaphore;

class Pool {

    public static void main(String[] args) {
        String str = new String("ohomm");
        System.out.println(maxSizeOfString(str));

    }

    private static int maxSizeOfString(String str) {
        if("".equals(str) || str==null){
            return 0;
        }
        if(str.length()==1){
            return 1;
        }

        int startIndex = 0;
        int endIndex = 1;
        char[] chackStr = str.toCharArray();
        int currentLength = 1;
        int maxLength = 1;
        String aimStr = "";
        for (int i = 1; i < str.length(); i++) {
            endIndex = i;
            aimStr = str.substring(startIndex,endIndex);
            if(aimStr.indexOf(chackStr[i])==-1){
                currentLength = aimStr.length()+1;
            }else{
                maxLength = maxLength > currentLength? maxLength:currentLength;
                startIndex = aimStr.indexOf(chackStr[i]) + 1 + startIndex;
            }
        }
        return maxLength > currentLength? maxLength:currentLength;

    }

}