package Ti;

public class MidOfTwoAry {

    public static void main(String[] args) {
        int[] ary1 = {1,2,4,6,7,8,9};
        int[] ary2 = {2,5,7,9,13,56};
        int i = checkIt(ary1,ary2);
        System.out.println(i);

    }

    //O(log(m+n))
    private static int checkIt(int[] ary1, int[] ary2) {

        int a1Left = Integer.MAX_VALUE;
        int a2Left = Integer.MIN_VALUE;
        int a1Right = Integer.MAX_VALUE;
        int a2Right = Integer.MIN_VALUE;
        int[] aryMid;
        int[] aryMid2;
        while (a1Left<=a2Right&&a2Left<=a1Right){
            aryMid = getMid(ary1);
            aryMid2 = getMid(ary1);
            a1Left = ary1[aryMid[0]];
            a1Right = ary1[aryMid[1]];
            a2Left = ary2[aryMid2[0]];
            a2Right = ary2[aryMid2[1]];



            break;
        }



        return 0;
    }

    private static int[] getMid(int[] ary) {
        if(ary.length == 0){
            return new int[]{0, 0};
        }
        if(ary.length%2 == 1){
            return new int[]{ary.length / 2, ary.length / 2};
        }else{
            return new int[]{ary.length / 2 - 1, ary.length / 2};
        }
    }

}
