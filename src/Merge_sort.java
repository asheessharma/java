public class Merge_sort {
    int []arr;
    int [] temp;
    int len;
    public static void main(String[] args) {
        int [] input={48,36,13,52,19,94,21};
        Merge_sort ms=new Merge_sort();
        ms.sort(input);
        ms.print(input);
    }
    public void sort(int [] input){
        this.arr=input;
        this.len=input.length;
        this.temp=new int[len];
        devide(0,len-1);
    }
    public void devide(int l,int h){
        if(l<h){
            int mid=l+(h-l)/2;
            devide(l,mid);
            devide(mid+1,h);
            merge(l,mid,h);
        }

    }
    public void merge(int l,int mid,int h){
        for(int i=l;i<=h;i++){
            temp[i]=arr[i];
        }
        int i=l;
        int j=mid+1;
        int k =l;
        while(i<=mid && j<=h){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }
            else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k]=temp[i];
            k++;
            i++;
        }
    }
    public void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
