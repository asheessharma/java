import java.util.Scanner;
class sn{
    public static void slc(int n,int [] arr){
        int temp,min;
        for (int i = 0; i < n; i++) {
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.print("Sorted array using selection sort: ");
        for (int i=0;i<n;i++) {
            System.out.print(" "+arr[i]);
        }
    }

public static class selection_sort {
    public static void main(String[] args) {
       // sn s = new sn();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        slc(n, arr);
    }
    }
}
