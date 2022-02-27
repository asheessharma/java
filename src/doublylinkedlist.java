import java.util.Scanner;
class node2{
    int data;
    node2 next;
    node2 previous;
}
public class doublylinkedlist {
    node2 head;
    doublylinkedlist(){
        head=null;
    }
    void insert(){
        Scanner sc=new Scanner(System.in);
        node2 node=new node2();
        System.out.print("enter the data:");
        int data=sc.nextInt();
        node.data=data;
        node.next=null;
        node.previous=null;


        if(head==null){
            head=node;
        }
        else{
            node2 current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
            node.previous=current;
        }
        System.out.println("data inserted...");
    }
    void show(){
        if(head==null){
            System.out.println("list is empty...");
        }
        else{
            node2 current;
            for(current=head;current!=null;current=current.next){
                System.out.print(" "+ current.data);
            }
        }

    }
    void delete(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            System.out.println("deleted "+ head.data);
            if(head.next==null){
                head=null;
            }
            else{
                head=head.next;
            }

        }
    }

    public static void main(String[] args) {
        doublylinkedlist obj=new doublylinkedlist();
        while(true){
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");


            System.out.println("enter your choice ");
            Scanner sc= new Scanner(System.in);
            int ch=sc.nextInt();


            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.show();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice....");
            }
        }
    }

}

