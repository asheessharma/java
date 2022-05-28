import java.util.LinkedList;
import java.util.*;

public class GraphDFS {
     private int v;
     private LinkedList<Integer> []adj;
    GraphDFS(int v){
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;++i){
            adj[i]=new LinkedList();
        }
    }
    void add(int v,int w){
        adj[v].add(w);
    }
    void DFSUTIL(int v,boolean[] visited){
        visited[v]=true;
        System.out.print(v+" ");
        Iterator<Integer> i=adj[v].listIterator();
        while (i.hasNext()){
            int n=i.next();
            if(!visited[n])
                DFSUTIL(n,visited);
        }

    }
    void DFS(int s){
        boolean []visited=new boolean[v];
        DFSUTIL(s,visited);
    }

    public static void main(String[] args) {
        GraphDFS g=new GraphDFS(4);
        g.add(0,1);
        g.add(0,2);
        g.add(1,2);
        g.add(2,0);
        g.add(2,3);
        g.add(3,3);
        g.DFS(2);

    }


}
