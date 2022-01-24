import java.util.ArrayList;
import java.util.Scanner;
public class lec2_22 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           int arr[]={1,2,3,4,5};
            System.out.println("enter index value:");
          try {
              int index = sc.nextInt();
              int i = 0;
              for (i = index; i < arr.length - 1; i++) {
                  arr[i] = arr[i + 1];
              }
              arr[index] = 0;
              for (int i1 = 0; i1 < arr.length; i1++) {
                  System.out.println(arr[i1]);
              }
          }catch (ArrayIndexOutOfBoundsException e){
              System.out.println("index out of range");
          }
        }
        }
