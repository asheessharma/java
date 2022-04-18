class quick_sorting{
    public void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int partition(int [] arr,int beg,int end){
        int pivot=arr[end];
        int i=(beg-1);
        for(int j=beg;j<=end;j++){
            if(arr[j]<pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,end);
        return (i+1);
    }
    public void qck_sort(int[] arr, int beg, int end){
        if(beg<end){
            int split=partition(arr,beg,end);
            qck_sort(arr,beg,split-1);
            qck_sort(arr,split+1,end);
        }
    }
    public void printArray(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}

public class quick_sort {
    public static void main(String[] args) {
        quick_sorting q=new quick_sorting();
        int [] arr={44,22,33,66,77,-1,88,11,0};
        int size=arr.length;
        System.out.println("*********** TAKING RIGHTMOST ELEMENT AS PIVOT *********");
        q.qck_sort(arr,0,size-1);
        q.printArray(arr,size);
    }
}
