import java.util.Scanner;
public class stackexample {
    int [] arr;
    int top;
    stackexample(){
        arr=new int[5];
        top=-1;
    }
    void push(){
        if(top==arr.length-1){
            System.out.println("****** Stack overflow ****");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.print("enter data :");
            int data=sc.nextInt();
            top=top+1;
            arr[top]=data;
            System.out.println("......data inserted.....");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty....");
        }
        else{
            System.out.println("Removing element "+ arr[top]);
            top=top-1;
        }
    }
    void traverse(){
        if(top==-1){
            System.out.println("empty stack...");
        }
        else{
            for (int i = 0; i < top+1; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        stackexample obj=new stackexample();
        Scanner sc=new Scanner(System.in);

        while(true){

            System.out.println("\n Press 1 for insertion");
            System.out.println("Press 2 for deletion ");
            System.out.println("Press 3 for traversing ");
            System.out.println("Press 4 for exit ");

            System.out.print("enter your choice...");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("**** Wrong choice ****");
            }

        }



    }
}
