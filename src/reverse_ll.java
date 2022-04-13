public class reverse_ll {
    public Node_3 reverse(Node_3 head){
        Node_3 next1;
        Node_3 curr=head;
        Node_3 prev=null;
        while(curr!=null){
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        return prev;
    }
    public void print(Node_3 head){
        Node_3 temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node_3 n1 = new Node_3(5);
        Node_3 n2 = new Node_3(6);
        Node_3 n3 = new Node_3(7);
        Node_3 n4 = new Node_3(8);        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        reverse_ll ob = new reverse_ll();

        ob.print(ob.reverse(n1));
    }

}
class Node_3 {
    Node_3 next;
    int data;
    Node_3(int value){
        this.data=value;
    }
}
