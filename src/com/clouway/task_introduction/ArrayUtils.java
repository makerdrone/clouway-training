package task_introduction;

public class ArrayUtils {
    /**
     * Get minimal element in an integer array.
     * @param array
     * @return minimal array element
     */
    public static int getMinElement(int [] array) {
        int min = array[0]; // Container for the minimum element

        for(int item : array){
            if(min > item){
                min = item;
            }
        }

        return min;
    }

    /**
     * Get the sum of the elements in an integer array.
     * @param array
     * @return sum of array elements
     */
    public static int getSum(int [] array) {
        int sum = 0;

        for(int item : array){
            sum += item;
        }

        return sum;
    }

    /**
     * Print the elements of an array.
     * @param array
     */
    public static void printArray(int [] array) {
        System.out.print("[");
        for(int item : array){
            System.out.printf("%d, ", item);
        }
        System.out.print("]\n");
    }

    /**
     * In-place quicksort of an array.
     * @param array
     */
    public static void quicksort(int [] array) {
        quicksort(array, 0, array.length);
    }

    /**
     * Actual quicksort implementation.
     * @param array
     * @param startInd	starting index of array(inclusive)
     * @param endInd	end index of array(exclusive)
     */
    private static void quicksort(int [] array, int startInd, int endInd) {
        int len = endInd - startInd;
        if(len <= 1){
            return;
        }

        int centerInd = (startInd + endInd) / 2;
        int center = array[centerInd];
        int leftInd = startInd;
        int rightInd = endInd - 1;

        while(leftInd < rightInd){
            while(array[leftInd] < center) leftInd += 1;
            while(array[rightInd] > center) rightInd -= 1;

            if(leftInd <= rightInd){
                int tmp = array[leftInd];
                array[leftInd] = array[rightInd];
                array[rightInd] = tmp;

                leftInd ++;
                rightInd --;
            }
        }
        quicksort(array, startInd, rightInd+1);
        quicksort(array, leftInd, endInd);
    }

    /**
     * Reverse the elements of an array in-place.
     * @param array
     */
    public static void reverseArray(int [] array) {
        int left = 0;
        int right = array.length - 1;

        while(left < right){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;

            left ++;
            right --;
        }
    }
}
