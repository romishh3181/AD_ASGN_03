package ass3;

import java.util.Arrays;

public class assq4 {
    public static void main(String[] args) {
        int arr1[]={5,5,7,8,9};
        int arr2[]={0,1,4};
        int arr3[]=new int[arr1.length+arr2.length];
        merge(arr1,arr2,arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
    public static void merge(int arr1[],int arr2[],int arr3[]){
        int i=0;int j=0;int k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            k++;
            i++;
                   }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            k++;
            j++;

        }
    }

}
