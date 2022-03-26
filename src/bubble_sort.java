import java.util.Scanner;

public class bubble_sort {
    static void print(int [] arr){
        System.out.println("*************** APPLYING BUBBLE SORT LOGIC *****************");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void solution(int [] arr){
        int temp;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
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
