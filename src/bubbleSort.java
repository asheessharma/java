import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int [] arr;
        int n=sc.nextInt();
        arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("Enter elements to be searched : ");
        int ele=sc.nextInt();
        int li=0;
        int hi=n-1;
        int mi=(li+hi)/2;
        while(li<hi){
            if(arr[mi]==ele){
                System.out.print("Element is found at position: "+(mi+1));
                break;
            }
            else if(ele>arr[mi]){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
        if(li>hi){
            System.out.print("Element is not found in array :( ");
        }

    }
}
