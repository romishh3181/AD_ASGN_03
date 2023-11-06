package ass3;

import java.util.Arrays;

public class assq5 {
    public static void main(String[] args) {
        int arr[]={6,7,1,2,4};
       // reduce(arr);
        System.out.println(Arrays.toString(reduce(arr)));
    }
    public static int[] reduce(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int arr2[]=new int[1];
        arr2[0]=sum;
       // return new int[]arr2={sum};
        return arr2;
    }
}
