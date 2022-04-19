class node_0 {
    nodd left,right;
    int key;
    public node_0(int item){
        key=item;
        left=right=null;
    }
}
public class Binarytree {
    nodd root;
    Binarytree(){
        root=null;
    }
    void preorder(nodd node){
        if(node==null){
            return;
        }
        System.out.print(node.key+" ");
        preorder(node.left);
        preorder(node.right);
    }
    void inorder(nodd node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.print(node.key+" ");
        inorder(node.right);
    }
    void postorder(nodd node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.key+" ");
    }

    public static void main(String[] args) {
        Binarytree tree= new Binarytree();
        tree.root=new nodd(1);
        tree.root.left=new nodd(2);
        tree.root.right=new nodd(3);
        tree.root.left.left=new nodd(4);
        tree.root.left.right=new nodd(5);
        System.out.println("**** PREORDER TRAVERSAL ****");
        tree.preorder(tree.root);
        System.out.println("\n**** INORDER TRAVERSAL ****");
        tree.inorder(tree.root);
        System.out.println("\n**** POSTORDER TRAVERSAL ****");
        tree.postorder(tree.root);


    }
}
