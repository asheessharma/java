import java.util.Scanner;
class smen{
    int item1;
    int item2;
    int item3;
    public smen(int i1,int i2,int i3){
        this.item1=i1;
        this.item2=i2;
        this.item3=i3;
    }
}
public class sam_que1 {
    public static void main(String[] args) {
        smen arr[]=new smen[5];
        Scanner s=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.print("enter the sales of 3 items sold by salesmen "+(i+1)+":");
            arr[i]=new smen(s.nextInt(),s.nextInt(),s.nextInt());
        }
        int sum=0;
        int s1=0;
        int s2=0;
        int s3=0;
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i].item1+"\t"+arr[i].item2+"\t"+arr[i].item3);

            sum=arr[i].item1+arr[i].item2+arr[i].item3;
            System.out.println("Total sales by salesmen "+(i+1)+":"+sum);
        }
        for(int i=0; i<arr.length;i++){
            s1+=arr[i].item1;
            s2+=arr[i].item2;
            s3+=arr[i].item3;
        }
        System.out.println("Total sales of item 1:"+s1);
        System.out.println("Total sales of item 2:"+s2);
        System.out.println("Total sales of item 3:"+s3);
    }
}
