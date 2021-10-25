package search;

public class BinarySearchExample {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int[] arrayToSearch = generator.getNumbers();

        binarySearch(arrayToSearch, 4);
    }

    public static void binarySearch(int[] arrayToSearch, int numberToFind){
        //Implement binary search
        int low = 0;
        int high = arrayToSearch.length - 1;
        int mid = high/2;
        // 0  1  2  3  4  5  6  7  8  9   Index
        //[1][2][3][4][5][6][7][8][9][10] Values
        //number to find = 4
        //mid = 4
        //low = 0
        //high = lenght - 1 = 9

        while(true) {
            if (arrayToSearch[mid] == numberToFind) {
                //Success
                //return mid;
            }
            //ER tallet vi skal finde større eller mindre end mid værdien?
        }

        //return -1;
    }
}
