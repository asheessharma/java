class nood{
    int data,height;
    nood left,right;
    nood(int data){
        this.data=data;
        this.height=1;
    }
}
public class avl {
    nood root;
    int height(nood N){
        if(N==null)
            return 0;
        else
            return N.height;
    }
    int balanceFactor(nood n){
        if(n==null)
            return 0;
        else
            return height(n.left)-height(n.right);
    }
    int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
    nood leftRotate(nood a){
        nood b=a.right;
        nood c=a.left;
        b.left=a;
        a.right=c;
        a.height=max(height(a.left),height(a.right))+1;
        b.height=max(height(b.left),height(b.right))+1;

        return b;
    }
    nood rightRotate(nood b){
        nood a=b.left;
        nood c=b.right;
        a.right=b;
        b.left=c;
        b.height=max(height(b.left),height(b.right))+1;
        a.height=max(height(a.left),height(a.right))+1;
        return a;
    }
    nood insert(nood node,int value){
        if(node==null)
            return new nood(value);
        if(value<node.data)
            node.left=insert(node.left,value);
        else if (value>node.data)
            node.right=insert(node.right,value);
        else
            return node;
        node.height=max(height(node.left),height(node.right))+1;
        avl a=new avl();
        int balanceFactor=a.balanceFactor(node);
        if(balanceFactor>1){
            //RR
            if(value<node.left.data){
                return rightRotate(node);
            }
            //RL
            else if(value>node.left.data){

                node.left= leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(balanceFactor<-1){
            //LL
            if(value>node.right.data)
                return leftRotate(node);
            //LR=RR+LL
            else if(value<node.right.data)
                node.right=rightRotate(node.right);
            return leftRotate(node);

        }
        return node;
    }
    void printInorder(nood node){
        if(node!=null){
            printInorder(node.left);
            System.out.println(node.data+"\t");
            printInorder(node.right);

        }
    }
    public static void main(String[] args) {
        avl a =new avl();
        a.root=a.insert(a.root,33);
        a.root=a.insert(a.root,13);
        a.root=a.insert(a.root,53);
        a.root=a.insert(a.root,9);
        a.root=a.insert(a.root,21);
        a.root=a.insert(a.root,61);
        a.root=a.insert(a.root,8);
        a.root=a.insert(a.root,11);
        a.printInorder(a.root);

    }
}
