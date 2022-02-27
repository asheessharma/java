
class queue{
    int [] queue=new int[5];
    int front;
    int rear;
    int size;
    public void enqueue(int data){
        if(size==queue.length){
            System.out.println("OVERFLOW  :(" );

        }
        else{
            queue[rear]=data;
            rear+=1;
            size+=1;
        }

    }
    public void show(){
        if(size==0){
            System.out.println("QUEUE IS EMPTY-----(UNDERFLOW) :(");
        }
        else{
            for(int i=front;i<rear;i++){
                System.out.print(queue[i]+" ");
            }
        }

    }
    public void dequeue(){
        if(size==0){
            System.out.println("QUEUE IS EMPTY");
        }
        else{
            System.out.println("deleted: "+ queue[front]);
            front++;
            size--;
        }


    }

}

public class queuearray {
    public static void main(String[] args) {
        queue q=new queue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(12);
        q.enqueue(55);
       // q.show();
    }
}
