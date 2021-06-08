package quicksort;
import  java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] arr={25,2,8,16,3};
        int lower=0;
        int upper=arr.length-1;
        System.out.println("unsorted--> "+Arrays.toString(arr));
        MyQuickSort obj= new MyQuickSort();
        obj.quickSort(arr,lower,upper);
        System.out.println("sorted--> "+Arrays.toString(arr));
    }
    public void quickSort(int[] arr,int lower,int upper){
        //step 1
        if(lower>=upper){
            return;
        }
        //step 2
        int pivotIndex=partition(arr,lower,upper);
        //step 3
        quickSort(arr,pivotIndex+1,upper);
    }
    private  int partition(int[] arr, int lower ,int upper){
        //step 1
        int pivot =arr[lower];
        //step 2
        int down =lower ;
        //step 3
        int up =upper;
        //step 4
        while(down<up){
            //step 4a
            while(down<=upper && arr[down]<=pivot){
                up=up-1;
            }
            if(down<up){
                int temp=arr[down];
                arr[down]=arr[up];
                arr[up]=temp;
            }
        }
        //step 5
        arr[lower]=arr[up];
        arr[up]=pivot;
        //step 6
        return up;
    }
}
