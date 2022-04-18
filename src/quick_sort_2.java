import java.util.*;
public class quick_sort_2 {
    public void swp(int [] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int prtitn(int [] arr, int beg, int end){
        int pivot=arr[end];
        int i=(beg-1);
        for(int j=beg;j<=end;j++){
            if(arr[j]<pivot){
                i++;
                swp(arr,i,j);
            }
        }
        swp(arr,i+1,end);
        return (i+1);

    }
    public void quick_1(int [] arr, int beg, int end){
        if(beg<end){
            int p= prtitn(arr,beg,end);
            quick_1(arr,beg,p-1);
            quick_1(arr,p+1,end);
        }
    }
    public void print(int [] arr,int size){
            System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        quick_sort_2 qck=new quick_sort_2();
        int [] arr={44,22,33,66,77,-1,88,11,0};
        int size=arr.length;
        qck.quick_1(arr,0,size-1);
        qck.print(arr,size);
    }
}
