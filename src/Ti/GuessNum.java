package Ti;

public class GuessNum {
    /**
     * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，
     * 小A 每次也从 1, 2, 3 中选择一个猜。
     * 他们一共进行三次这个游戏，请返回 小A 猜对了几次？
     */

    public static void main(String[] args) {
        int[] guess = {1,2,3};
        int[] answer = {1,2,3};

        int i = new GuessNum().game(guess,answer);
        System.out.println(i);


    }
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if(guess[i] == answer[i]){
                count++;
            }
        }
        return count;
    }

}
