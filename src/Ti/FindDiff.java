package Ti;

public class FindDiff {


    public static void main(String[] args) {

        String s = "ae", t = "aea";
        char c = new FindDiff().findTheDifference(s,t);
        System.out.println(c);

    }



    public char findTheDifference(String s, String t) {
        if(s.length()==0){
            return t.charAt(0);
        }
        int[] tKey = new int[26];
        for(int i = 0; i < t.length(); i++){
            tKey[t.charAt(i)-'a']++;
        }
        for(int j = 0; j < s.length(); j++){
            tKey[s.charAt(j)-'a']--;
        }
        for(int k = 0; k < tKey.length; k++){
            if(tKey[k]!=0){
                return (char)(k+'a');
            }
        }
        return 'x';
    }
}
