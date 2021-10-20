package search;

public class BinarySearchExample {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int[] arrayToSearch = generator.getNumbers();

        binarySearch(arrayToSearch, 4);
    }

    public static int binarySearch(int[] arrayToSearch, int numberToFind){
        //Implement binary search
        int low = 0;
        int high = arrayToSearch.length - 1; // 10 - 1 = 9
        int mid = high/2;                   // 9 / 2 = 4

        if(arrayToSearch[mid] == numberToFind){
            return mid;
        }

        return -1;
    }
}
