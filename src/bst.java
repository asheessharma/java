class nodd {
    nodd left,right;
    int key;
    public nodd(int item){
        key=item;
        left=right=null;
    }
}
public class bst {
    nodd root;
    bst(){
        root=null;
    }

    public nodd small(nodd n){
        if(n.left.left==null)
            return n;
       n= small(n.left);
        return n;
    }
    public static void main(String[] args) {
        bst tree=new bst();
        tree.root=new nodd(6);
        tree.root.left=new nodd(4);
        tree.root.right=new nodd(8);
        tree.root.left.left=new nodd(3);
        tree.root.left.right=new nodd(5);
        tree.root.right.left=new nodd(7);
        tree.root.right.right=new nodd(9);
        System.out.println(tree.small(tree.root).key);


    }
}
