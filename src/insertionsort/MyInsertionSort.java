package insertionsort;

import selectionsort.MySelectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        int[] arr={12,8,5,16,2};
        System.out.println("unsorted array--> "+ Arrays.toString(arr));
        MySelectionSort obj=new MySelectionSort();
        obj.selectionSort(arr);
        System.out.println("sorted array--> "+Arrays.toString(arr));
    }
    public void insertionSort(int[] arr){
        //step 1
        int sortedIndex=0;
        //int unsortedIndex=1;
        //step 2
        for (int unsortedIndex = 1; unsortedIndex<arr.length ; unsortedIndex++) {
            int nextElement=arr[unsortedIndex];
            //step 4
            for (int j = unsortedIndex; j >0; j--) {
                //step 5
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
