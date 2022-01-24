import java.util.Scanner;
public class lec_2 {
    int arr[];
    public lec_2(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int l=s.nextInt();
        arr=new int[l];
        System.out.println("Enter values of array: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }
    // traversing means to access each and every element of array
    public void traverse(){//method to traverse the array
        for(int res:arr){
            System.out.println(res);
        }
    }
    public void insert(int index,int value){
        try{
            System.out.println("Values of arrays before insertion: ");
            for(int v:arr){
                System.out.println(v);
            }
            arr[index]=value;
            System.out.println("-: * Values of arrays after insertion * :-");
            for(int val:arr){
                System.out.println(val);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }
    }

    public void deletearr(){
        arr=null;
    }
    public void delete(int index){
        try{
            arr[index]=0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("***invalid index***");
        }
    }

}

class ef{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        lec_2 obj=new lec_2();
        System.out.println("-:***choose from the following***:- \n" +
                "\t 1:Traversing \n" +
                "\t 2:Inserting \n" +
                "\t 3:Deleting particular element \n" +
                "\t 4:Deleting array ");
        System.out.println("enter your choice : ");
        int n= sc.nextInt();
        if(n==1){
            obj.traverse();
        }
        else if(n==2){
            System.out.println("Enter index value: ");
            int indexv=sc.nextInt();
            System.out.println("Enter value for index: ");
            int val=sc.nextInt();
            obj.insert(indexv,val);
        }
        else if(n==3){
            System.out.println("Enter the index value:");
            int ind=sc.nextInt();
            obj.delete(ind);
            for(int r: obj.arr){
                System.out.println(r);
            }
        }
        else if(n==4){
            obj.deletearr();
        }
        else{
            System.out.println("****wrong choice****");
        }


    }
}
