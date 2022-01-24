import java.util.Scanner;
public class dup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++){
            System.out.print("enter "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate value is found at position : "+(j+1));
                }
            }
        }

    }
}
