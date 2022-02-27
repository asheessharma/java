import java.util.Scanner;
class node{
    int data;
    node next;
}
public class singlylinklist {
    node START;
    singlylinklist(){
        START=null;
    }
    void insert () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rollno :");
        int data = sc.nextInt();
        node nn = new node();
        nn.data = data;
        nn.next = null;

        if (START == null) {
            START = nn;
        } else {
            node current = START;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nn;
        }
        System.out.println("data inserted.....");
    }

    void delete(){
        if(START==null){
            System.out.println("list is empty ");
        }
        else{
            System.out.println("deleted..."+START.data);
            if(START.next==null){
                START=null;
            }
            else{
                START=START.next;
            }
        }
    }
    void deleteall(){
        if(START==null){
            System.out.println("list empty...");
        }
        else{
            System.out.println("ALL ELEMENTS DELETED....");
            START=null;
        }
    }
    void traverse(){
        if(START==null){
            System.out.println("LIST IS EMPTY..");
        }
        else{
            System.out.println("-------list elements-------");
            node current;
            for(current=START;current!=null;current=current.next){
                System.out.println(" "+current.data);
            }
        }
    }

    public static void main(String[] args) {
        singlylinklist obj=new singlylinklist();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");
            System.out.println("press 5 for DELETE ALL");


            System.out.println("enter your choice: ");
            int ch=sc.nextInt();

            switch(ch){
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    obj.deleteall();
                    break;
                default:
                    System.out.println("wrong choice ");
            }
        }
    }
}
