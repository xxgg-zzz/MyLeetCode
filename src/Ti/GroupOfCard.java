package Ti;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupOfCard {
    /**
     * 给定一副牌，每张牌上都写着一个整数。

     此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：

     每组都有 X 张牌。
     组内所有的牌上都写着相同的整数。

     仅当你可选的 X >= 2 时返回 true。
     */
    public static void main(String[] args) {
        int[] deck = {1,1,2,2,2,2};
        boolean flag = new GroupOfCard().hasGroupsSizeX(deck);
        System.out.println(flag);

    }
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int i = 0; i < deck.length; i++) {
            count[deck[i]]++;
        }
        return Arrays.stream(count).reduce(this::gcd).getAsInt() > 1;

    }
    public int gcd(int a,int b){
        return b == 0 ? a : gcd(b, a%b);
    }

}
