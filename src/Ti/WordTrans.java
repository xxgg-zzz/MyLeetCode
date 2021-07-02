package Ti;

import java.util.*;

public class WordTrans {


    /**
     * 给定两个单词（beginWord 和 endWord）和一个字典，
     * 找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
     每次转换只能改变一个字母。
     转换过程中的中间单词必须是字典中的单词。
     */

    public static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";
        List<String> list = Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"});
        int i = new WordTrans().ladderLength(beginWord,endWord,list);
        System.out.println(i);
    }

    Map<String,Integer> wordId = new HashMap<>();
    List<List<Integer>> edge = new ArrayList<>();
    int nodeNums = 0;

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        for (int i = 0; i < wordList.size(); i++) {
            addEdge(wordList.get(i));
        }
        addEdge(beginWord);
        int[] dis = new int[nodeNums];  //边的长度
        Arrays.fill(dis,Integer.MAX_VALUE);
        int beginId = wordId.get(beginWord);
        int endId = wordId.get(endWord);
        dis[beginId] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(beginId);

        while (!queue.isEmpty()){
            int x = queue.poll();
            if(x == wordId.get(endWord)){
                return dis[x]/2+1;
            }

            for (int i = 0; i < edge.get(x).size(); i++) {
                if(dis[edge.get(x).get(i)] == Integer.MAX_VALUE){
                    dis[edge.get(x).get(i)] = dis[x]+1;
                    queue.offer(edge.get(x).get(i));
                }
                
            }

        }
        return 0;

    }

    private void addEdge(String s) {

        addWord(s);
        int id1 = wordId.get(s);
        char[] chr = s.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            char temp = chr[i];
            chr[i] = '*';
            String newString = new String(chr);
            addWord(newString);
            int id2 = wordId.get(newString);
            //添加边
            edge.get(id1).add(id2);
            edge.get(id2).add(id1);
            //还原String
            chr[i] = temp;
        }

    }

    private void addWord(String s) {
        if(!wordId.containsKey(s)){
            wordId.put(s,nodeNums++);
            edge.add(new ArrayList<Integer>());
        }


    }

}
