class nodd {
    noddle left,right;
    int key;
    public nodd(int item){
        key=item;
        left=right=null;
    }
}
public class bst {
    noddle root;
    bst(){
        root=null;
    }

    public noddle small(noddle n){
        if(n.left.left==null)
            return n;
       n= small(n.left);
        return n;
    }
    public static void main(String[] args) {
        bst tree=new bst();
        tree.root=new noddle(6);
        tree.root.left=new noddle(4);
        tree.root.right=new noddle(8);
        tree.root.left.left=new noddle(3);
        tree.root.left.right=new noddle(5);
        tree.root.right.left=new noddle(7);
        tree.root.right.right=new noddle(9);
        System.out.println(tree.small(tree.root).key);


    }
}
