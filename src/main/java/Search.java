/**
 * Created by chamod on 7/22/17.
 */
public class Search {

    /**
     * Search a given number is present in an integer array by searching linearly
     * @param arr is the array of integers
     * @param number is the integer to be searched
     * @return {@code true} if the number is found, {@code false} if the number is not found
     */
    public boolean nonRecursiveSearch(int[] arr, int number){
        for(int n : arr){
            if(n == number){
                return true;
            }
        }
        return false;
    }


    /**
     * Search a given number is present in an integer array by searching recursively in the array by checking
     * the last element
     * @param arr is the array of integers
     * @param number is the integer to be searched
     * @return {@code true} if the number is found, {@code false} if the number is not found
     */
    public boolean recursiveSearch(int[] arr, int number){
        return recursiveSearch(arr, number, arr.length);
    }

    private boolean recursiveSearch(int[] arr, int number, int lengthOfArray){
        if(lengthOfArray == 0){
            return false;
        }
        else if(arr[lengthOfArray - 1] == number){
            return true;
        }
        else {
            return recursiveSearch(arr, number, lengthOfArray-1);
        }
    }
}
