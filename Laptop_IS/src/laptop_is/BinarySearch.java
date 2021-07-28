package laptop_is;

public class BinarySearch {
    
    /*
    A Method to search a certain number from the given Array that must be sorted in Ascending Order.
    Returns the position of the number in that array.
    */
    public static int search(int[] array, int number){
        
        //Sorting Using Merge Sort Algorithm
        MergeSort.sort(array);
        
        int left = 0;
        int right =  array.length-1;
        
        while (left <= right){
            int mid = (left+right) /2;
            
            if (array[mid] == number){
                return mid;
            }else if(array[mid] < number){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
