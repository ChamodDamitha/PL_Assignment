/**
 * Created by chamod on 7/22/17.
 */
public class Main {
    public static void main(String[] args) {
//      Show searching in arrays
        searchResults();


    }


    private static void searchResults(){
        int[] numbers = {1, 4, 7, 3, 34, 4, 45, 10};

        Search search = new Search();

        long time1 = System.currentTimeMillis();
        boolean found1 = search.nonRecursiveSearch(numbers, 45);
        long time2 = System.currentTimeMillis();

        System.out.println("Linear search..............");
        System.out.println("number 45 found : " + found1);
        System.out.println("Time elapsed : " + (time2 - time1));

        long time3 = System.currentTimeMillis();
        boolean found2 = search.recursiveSearch(numbers, 45);
        long time4 = System.currentTimeMillis();

        System.out.println("Recursive search..............");
        System.out.println("number 45 found : " + found2);
        System.out.println("Time elapsed : " + (time4 - time3));

        System.out.println("..............................");
        System.out.println("..............................");



    }
}
