class node_1{
    int data;
    node_1 next;
    node_1 previous;
}
public class trash_2 {
    node_1 head;
    trash_2(){
        head=null;
    }
    int c=0;
    public void insert(int data){
        node_1 node=new node_1();
        node.data=data;
        node.next=null;
        node.previous=null;
        if(head==null){
            head=node;
        }
        else{
            node_1 temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.previous=temp;
        }
        c++;
    }
    public void show(){
        if(head==null){
            System.out.println("Empty list");

        }
        else{
            node_1 temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public void delete_mid(){
        node_1 temp=head;
        if(temp==null){
            System.out.println("Empty list" );
        }
        else{
            int mid=c/2;
            for(int i=0;i<mid;i++){
                temp=temp.next;
            }
            if(temp==head){
                head=null;
            }
            else{
                temp.previous.next=temp.next;
                temp.next.previous=temp.previous;
            }
           temp=null;

        }
    }

    public static void main(String[] args) {
        trash_2 n=new trash_2();
        n.insert(5);
        n.insert(8);
        n.insert(2);
        n.insert(9);
        n.insert(25);
        n.show();
        n.delete_mid();
        System.out.println("*************************************");
        n.show();
    }
}
