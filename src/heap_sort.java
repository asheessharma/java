public class heap_sort {
     public static void main(String[] args) {
          int []arr={22,13,17,11,10,14,12};
          heap_sort hs=new heap_sort();
          hs.sort(arr);
          hs.print(arr);
     }
     void sort(int []arr){
          int len=arr.length;
          //building heap
          for(int i=(len/2)-1; i>=0;i--){
               heapfy(arr,len,i);
          }
          //swap the elements and heapfy again
          for (int i = len-1; i >=0 ; i--) {
               // swapping current node with last element
               int t=arr[0];
               arr[0]=arr[i];
               arr[i]=t;
               heapfy(arr,i,0);
          }
     }
     void heapfy(int []arr,int n,int i){     //n is taking length as parameter and i is giving parent node index
          int lar=i;                         //parent node index position
          int li=2*i+1;                      //left child index position
          int ri=2*i+2;                      //right child index position
          if(li<n && arr[li]>arr[lar]){
               lar=li;                       //this is to find larger value among left and right child and assign it to  parent node index
          }
          if(ri<n && arr[ri]>arr[lar]){
               lar=ri;
          }
          if(lar!=i){                        //if child node value is greater then parent node value then swap it i.e, largest is not root
               int t=arr[i];
               arr[i]=arr[lar];
               arr[lar]=t;
               heapfy(arr,n,lar);
          }
     }
     void print(int []arr){
          for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
          }
     }
     }


