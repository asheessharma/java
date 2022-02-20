import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n=sc.nextInt();
        int [] arr1=new int[n];
        int [] arr2=new int[n];
        int [] arr3=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter arr1 "+(i+1)+" elements: ");
            arr1[i]=sc.nextInt();
            System.out.print("enter arr2 "+(i+1)+" element : ");
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr1[i]<arr2[j]){
                    c=c+1;
                }
                else{
                    continue;
                }
            }
            arr3[i]=c;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i]+" ");
        }

    }
}
