import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class recursion_fibo {
    int n1=0;
    int n2=1;
    int sum=0;

    public void recursion(int data){
        if(data>0){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(" "+sum);
            recursion(data-1);
        }
    }

    public static void main(String[] args) {
        recursion_fibo obj=new recursion_fibo();
        System.out.print(obj.n1+" "+obj.n2);
        obj.recursion(5);
    }
}
