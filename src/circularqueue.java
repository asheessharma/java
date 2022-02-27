class queue1{
    int [] queue;
    int rear;
    int front;
    int size;
    public queue1(int size){
        queue=new int[size];
        rear=-1;
        front=-1;
        this.size=size;
    }
    public boolean isempty(){
        if(rear==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isfull(){
        if((rear+1==size)&&(front==0)){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(int data){
        if(isfull()){
            System.out.println("OVERFLOW :(");
        }
        else if(isempty()){
            rear++;
            front++;
            queue[front]=data;
           // size++;
        }
        else{
            if(rear+1==size){
                rear=0;
            }
            else{
                rear++;
            }
            queue[rear]=data;
        }

    }
    public void dequeue(){
        if(isempty()){
            System.out.println("UNDERFLOW :(");
        }
        else{
            System.out.println("Removed "+ queue[front]);
            if(front==rear){
                front=rear=-1;
            }
            else if(front+1==size){
                front=0;
            }
            else{
                front++;
            }
        }
    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.println(queue[i]);
        }
    }
}
public class circularqueue {
    public static void main(String[] args) {
        queue1 obj=new queue1(5);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.show();
        System.out.println("================");
        obj.dequeue();
        obj.dequeue();
        obj.show();
        System.out.println("****************");
        obj.enqueue(100);
        obj.enqueue(121);
        obj.show();


    }


}
