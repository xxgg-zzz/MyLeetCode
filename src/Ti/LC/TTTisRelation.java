package Ti.LC;


public class TTTisRelation{

    public static void main(String[] args) {

        int n = 9;
        int[][] rela = {{1,2},{2,3},{4,5},{6,5},{7,8},{2,9},{1,6}};
        int[][] tttest = {{4,5},{3,6},{1,4},{3,7},{5,8},{1,3},{3,6},{7,6}};
        UnionFind unionFind = new UnionFind(n);

        for (int[] ints : rela) {
            unionFind.union(ints);
        }
        for (int[] ints : tttest) {
            System.out.println(unionFind.isUnion(ints));
        }



    }

}

class UnionFind {


    int[] parent;
    int[] size;
    int n;

    public UnionFind(int n){
        this.n = n;
        this.parent = new int[n];
        this.size = new int[n];

    }

    private void init(){

        for(int i = 0; i < n; i++){
            this.parent[i] = i;
            this.size[i] = 1;
        }

    }

    public int findParent(int k){
        while(parent[k]!=k){
            k = findParent(parent[k]);
        }
        return k;
    }

    public boolean union(int[] key){
        if(findParent(key[0]-1) == findParent(key[1]-1)){
            return false;
        }
        if(size[key[0]] > size[key[1]]){
            size[key[1]]+=size[key[0]];
            parent[findParent(key[0]-1)] = parent[findParent(key[1]-1)];
        }else{
            size[key[0]]+=size[key[1]];
            parent[findParent(key[1]-1)] = parent[findParent(key[0]-1)];
        }
        return true;
    }

    public boolean isUnion(int[] key){
        return findParent(key[0]-1) == findParent(key[1]-1);
    }


}
