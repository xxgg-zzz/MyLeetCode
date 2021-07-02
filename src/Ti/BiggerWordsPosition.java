package Ti;

import java.util.*;

public class BiggerWordsPosition {

    public static void main(String[] args) {

        String s = "llleeeeemmkkkkeeeehh";
        List<List<Integer>> result = new BiggerWordsPosition().largeGroupPositions(s);
        result.forEach(item->{
            System.out.println("["+item.get(0)+","+item.get(1)+"]");
        });

    }

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedHashMap<Character,List<Integer>> kmap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(kmap.containsKey(s.charAt(i))){
                if(i>0 && s.charAt(i)!=s.charAt(i-1)){
                    addToList(kmap,result);
                    kmap.clear();
                    i--;
                    continue;
                }
                kmap.get(s.charAt(i)).set(1,i);
            }else{
                List<Integer> temp= new ArrayList<>();
                temp.add(i);
                temp.add(i);
                kmap.put(s.charAt(i),temp);
            }
        }
        addToList(kmap,result);
        return result;
    }
    private void addToList(LinkedHashMap<Character,List<Integer>> kmap,List<List<Integer>> result){
        kmap.forEach((x,y)->{
            if(y.get(1)-y.get(0)+1>=3){
                result.add(y);
            }
        });
    }

}
