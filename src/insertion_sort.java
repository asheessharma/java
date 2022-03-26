import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class insertion{
    public void in_sort(int [] arr){
        int temp,j;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array:  ");
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            System.out.print("Enter "+(i+1)+" element of array: ");
            arr[i]=sc.nextInt();
        }
        insertion ins=new insertion();
        ins.in_sort(arr);

    }

}
