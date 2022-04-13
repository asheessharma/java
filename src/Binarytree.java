class Node{
    Node left,right;
    int key;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
public class Binarytree {
    Node root;
    Binarytree(){
        root=null;
    }
    void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.key);
        preorder(node.left);
        preorder(node.right);
    }
    void inorder(Node node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.println(node.key);
        inorder(node.right);
    }
    void postorder(Node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.println(node.key);
    }

    public static void main(String[] args) {
        Binarytree tree= new Binarytree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        System.out.println("**** PREORDER TRAVERSAL ****");
        tree.preorder(tree.root);
        System.out.println("**** INORDER TRAVERSAL ****");
        tree.inorder(tree.root);
        System.out.println("**** POSTORDER TRAVERSAL ****");
        tree.postorder(tree.root);


    }
}
