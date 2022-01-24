import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        int arr[];//local array , declaration statement
        arr=new int[5];//creation statement ; it will reserve space
        Scanner s=new Scanner(System.in);
        //initializing the array
        for(int i=0;i<arr.length;i++){
            System.out.println("enter some values: ");
            arr[i]=s.nextInt();
        }
        // for each loop is used only for read only purpose
        for(int r:arr){
            System.out.println(r);
        }
    }
}

