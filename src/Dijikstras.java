public class Dijikstras {
    static final int v=9;
    public static int minDistance(int []dist,boolean[]sptset){
        int m=Integer.MAX_VALUE,min_index=-1;
        for(int i=0;i<v;i++){
            if(sptset[i]==false&&dist[i]<=m){
                min_index=i;
                m=dist[i];
            }
        }
        return min_index;
    }
    public static void print_Diji(int[]dist,int v){
        for (int i=0;i<v;i++){
            System.out.println(i+" "+dist[i]);
        }
    }
    public static void diji(int graph[][],int s){
        int dist[]=new int[v];
        boolean sptset[]=new boolean[v];
        for(int i=0;i<v;i++){
            dist[i]=Integer.MAX_VALUE;
            sptset[i]=false;
        }
        dist[s]=0;
        for(int c=0;c<v-1;c++){
            int min=minDistance(dist,sptset);
            sptset[min]=true;
            for(int i=0;i<v;i++){
                if(!sptset[i]&&graph[min][i]!=0&&dist[min]+graph[min][i]<dist[i]){
                   dist[i]=dist[min]+graph[min][i];
                }
            }
        }
        print_Diji(dist,v);
    }

    public static void main(String[] args) {
        Dijikstras algo=new Dijikstras();
        int graph[][]=new int[][]{ { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        diji(graph,0);
    }
}
