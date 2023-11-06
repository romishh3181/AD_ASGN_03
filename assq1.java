package ass3;

import java.util.Arrays;

public class assq1 {



        public static void main(String[] args) {
            int [] arr={17,5,6,2,3};
            bubble(arr);
            System.out.println(Arrays.toString(arr));
        }
        public static void bubble(int [] arr){
            for(int i=0;i< arr.length;i++){
                for(int j=1;j<=arr.length-i-1;j++){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                }
            }
        }
    }


