class node_0 {
    noddle left,right;
    int key;
    public node_0(int item){
        key=item;
        left=right=null;
    }
}
public class Binarytree {
    noddle root;
    Binarytree(){
        root=null;
    }
    void preorder(noddle node){
        if(node==null){
            return;
        }
        System.out.print(node.key+" ");
        preorder(node.left);
        preorder(node.right);
    }
    void inorder(noddle node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.print(node.key+" ");
        inorder(node.right);
    }
    void postorder(noddle node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.key+" ");
    }

    public static void main(String[] args) {
        Binarytree tree= new Binarytree();
        tree.root=new noddle(1);
        tree.root.left=new noddle(2);
        tree.root.right=new noddle(3);
        tree.root.left.left=new noddle(4);
        tree.root.left.right=new noddle(5);
        System.out.println("**** PREORDER TRAVERSAL ****");
        tree.preorder(tree.root);
        System.out.println("\n**** INORDER TRAVERSAL ****");
        tree.inorder(tree.root);
        System.out.println("\n**** POSTORDER TRAVERSAL ****");
        tree.postorder(tree.root);


    }
}
