package bubblesort;

import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] arr={12,8,16,5,2};
        System.out.println(Arrays.toString(arr));
        MyBubbleSort obj=new MyBubbleSort();
         obj.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){
        //step 1
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                //step 3
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
    }
}
