import java.util.Scanner;
public class insertion_sort_1 {
    static void print(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void solution(int [] arr){
        int j,temp_1=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            temp_1=arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp_1){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp_1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter elements: ");
            arr[i]=sc.nextInt();
        }
        solution(arr);
        print(arr);
    }
}
