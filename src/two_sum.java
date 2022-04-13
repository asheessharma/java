class solution{
    static int[] sum(int []arr,int aim){
        int l=0,r=arr.length-1,s=0;
        while(l<r){
            s=arr[l]+arr[r];
            if(s==aim){
                return new int[]{l+1,r+1};
            }
            if(s>aim){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}
public class two_sum {
    public static void main(String[] args) {
        solution sol=new solution();
        int [] arr={1,4,5,6,7};
        int aim=13;
        System.out.print("[ ");
        for(int x: solution.sum(arr,aim)){
            System.out.print(x+" ");
        }
        System.out.print("]");
    }
}
