import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (i==list.size()-1)
        {
            return true;
        }
        return(isSortedRec(list,i+1) && list.get(i)<= list.get(i+1));
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr,x,count,0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if(arr.length <= i && count == 0)
        {
            return true;
        }
        else if(arr.length <= i)
        {
            return false;
        }
        else if (arr[i] == x)
        {
            count--;
        }
        return (hasCountCopiesRec(arr,x,count,i+1));
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr,num,0,arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        int midPos = lowerBound +(upperBound-lowerBound)/2;
        if(upperBound<lowerBound)
        {
            return false;
        }
        if(num<arr[midPos])
        {
            return binarySearchRec(arr,num,lowerBound,midPos-1);
        }
        if(num>arr[midPos])
        {
            return binarySearchRec(arr,num,midPos+1, upperBound);
        }
        return true;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
