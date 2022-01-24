import java.util.Scanner;

class student1{
    private int rollno;
    private int marks;
    private String name;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno,int marks) {
        this.rollno = rollno;
        this.marks=marks;
    }
    public int getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public student1(int marks,int rollno,String name){
        this.marks=marks;
        this.rollno=rollno;
        this.name=name;
    }
}

public class student {
    public static void main(String[] args) {
        student1 arr[]=new student1[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter marks,rollno,name of student "+(i+1)+": ");
            arr[i]=new student1(sc.nextInt(),sc.nextInt(),sc.next());
        }
         int temp1=arr[0].getMarks();
         int t2=arr[0].getMarks();
        for(int i=1;i<(arr.length);i++){
            if (temp1<arr[i].getMarks()){
                temp1=arr[i].getMarks();
            }
            else if(t2>arr[i].getMarks()){
                t2=arr[i].getMarks();
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].getMarks()==temp1){
                System.out.println("Maximum marks in the class: "+arr[i].getMarks()+" "+arr[i].getRollno()+" "+arr[i].getName());
            }
        }
        for (int s = 0; s < arr.length; s++) {
            if(arr[s].getMarks()==t2){
                System.out.println("Minimum marks in the class: "+arr[s].getMarks()+" "+arr[s].getRollno()+" "+arr[s].getName());
            }
        }
    }
}
