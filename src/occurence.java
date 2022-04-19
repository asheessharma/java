public class occurence {
    int arr[]={10,20,30,20,40};
    public int first(int i,int num){
        if (arr[i]==num){
            return i;
        }
        if(arr.length<=i){
            return -1;
        }
        i=first(i+1,num);
        return i;
    }
    public int last(int i,int num){
        if (arr[i]==num){
            return i;
        }
        if(i<0){
            return -1;
        }
        i=last(i-1,num);
        return i;
    }

    public static void main(String[] args) {
        occurence obj=new occurence();
        int o= obj.first(0,20);
        int l=obj.last(obj.arr.length-1,20);
        System.out.println(o+"\n"+l);
    }
}
