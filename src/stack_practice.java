import java.util.Scanner;

class node3{
    int  data;
    node3 next;
}
public class stack_practice {
    node3 top;
    stack_practice(){
        top=null;
    }
    public void push(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element: ");
        int data=sc.nextInt();
        node3 n=new node3();
        n.data=data;
        n.next=top;
        top=n;
    }
    public void pop(){
        if(top==null){
            System.out.print("** Stack is empty ** ");
        }
        else{
            System.out.print("Popped element "+top.data);
            top=top.next;
        }
    }
    public void display(){
        if(top==null){
            System.out.print("** Stack is empty **");
        }
        else{
            node3 temp=top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("");
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }


}
