import java.util.Scanner;
public class recursion {
    static void  recursion(int n){
        if(n>0){
            recursion(n-1);
            System.out.print(n+" ");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value :");
        int n=sc.nextInt();
        recursion(n);
    }

}
