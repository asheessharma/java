import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class noddle {
    noddle left,right;
    int key;
    public noddle(int item){
        key=item;
        left=right=null;
    }
}
public class level_traversal {
    noddle root;

    public void level(noddle root){
        Queue<noddle> q=new LinkedList<>();
        q.offer(root);
        while(q.isEmpty()==false){
            noddle temp=q.poll();
            System.out.println(temp.key);
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }

        }
    public static void main(String[] args) {
        level_traversal ob = new level_traversal();

        noddle n1 = new noddle(1);
        noddle n2 = new noddle(2);
        noddle n3 = new noddle(3);
        noddle n4 = new noddle(4);
        noddle n5 = new noddle(5);
        noddle n6 = new noddle(6);

        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        ob.root=n1;
        ob.level(ob.root);

    }

}




