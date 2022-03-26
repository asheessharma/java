import java.util.Scanner;
class Node1{
    int data;
    Node1 next;
}
public class stackimp_ll {
    Node1 top;
    stackimp_ll(){
        top=null;
    }
    void push(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data=sc.nextInt();
        Node1 node=new Node1();
        node.data=data;
        node.next=top;
        top=node;
    }
    void display(){
        Node1 temp=top;
        if(top==null){
            System.out.println("****UNDERFLOW*****");
        }
        else{
            while(temp!=null){
                System.out.println(" "+temp.data);
                temp=temp.next;
            }
        }
    }
    void peek(){
        if(top==null){
            System.out.println("**** UNDERFLOW ****");
        }
        else{
            System.out.println(top.data);
        }
    }
    void pop(){

        if(top==null){
            System.out.println("Underflow condition");
        }
        else{
            System.out.println("popped element : "+ top.data);
            top=top.next;
        }
    }
    public static void main(String[] args) {
        stackimp_ll obj=new stackimp_ll();
        while(true){
            System.out.println();
            System.out.println(" press 1 for push ");
            System.out.println(" press 2 for display");
            System.out.println(" Press 3 for peek ");
            System.out.println(" press 4 for pop ");
            System.out.println(" press 5 for exit ");
            System.out.print("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.pop();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice .........");
            }
        }
    }

}
