package ass3;

import java.util.Arrays;

public class assq3 {
    public static void main(String[] args) {
        int arr[]={1,3,9,5,2};
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxind=getmax(arr,0,last);
            swap(arr,maxind,last);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int getmax(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int []arr,int w,int z){
        int temp=arr[w];
        arr[w]=arr[z];
        arr[z]=temp;
    }
}
