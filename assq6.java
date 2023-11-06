package ass3;

import java.util.Arrays;
import java.util.Scanner;

public class assq6 {
    public static void main(String[] args) {
        int arr[]={6,4,7,8,2,10};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int []arr){
        int s=0;
        int end= arr.length-1;
        while(s<=end){
            int temp=arr[end];
            arr[end]=arr[s];
            arr[s]=temp;
            s++;
            end--;
        }
    }
}
