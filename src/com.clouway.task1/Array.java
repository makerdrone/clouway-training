package com.clouway.task1;


public class Array {

    public Array(){
    }

    /**
     * Returns the minimal element of an array
     * @param array the target array
     * @return minimal element
     */
    public static int getMinElement(int [] array){
        int arrLen = java.lang.reflect.Array.getLength(array);

        if(arrLen == 1){
            return array[0];
        }

        int minElem = array[0];

        for(int i=1; i<arrLen; i++){
            if(minElem > array[i]){
                minElem = array[i];
            }
        }

        return minElem;
    }

    /**
     * Returns the sum of the elements of an array
     * @param array the target array
     * @return sum of elements
     */
    public int getSum(int[] array){
        int arrLen = java.lang.reflect.Array.getLength(array);

        if(arrLen == 1){
            return array[0];
        }

        int elemSum = 0;

        for(int i=0; i<arrLen; i++){
            elemSum += array[i];
        }

        return elemSum;
    }

    /**
     * Prints the elements of an array on one line
     * @param array the target array
     */
    public void printArray(int[] array){
        int arrLen = java.lang.reflect.Array.getLength(array);
        int lastInd = arrLen - 1;

        System.out.print("[");

        for(int i=0; i<arrLen; i++){
            System.out.print(array[i]);
            if(i != lastInd)
                System.out.print(", ");
        }

        System.out.print("]");
    }

    public void qicksort(int [] array){
        int arrLen = array.length;

        if(arrLen == 1){
            return;
        }

        quicksort(array, 0, arrLen);
    }

    private void quicksort(int [] array, int begin, int end){
        if(end - begin <= 1){
            return;
        }

        int middleInd = (begin + end) / 2;
        int middleElem = array[middleInd];

        int i = begin, j = end - 1;

        while(i < j){
            while(array[i] < middleElem) i++;
            while(array[j] > middleElem) j--;

            if(i <= j){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        quicksort(array, begin, j + 1);
        quicksort(array, i, end);
    }

    public void reverseArray(int [] array){
        int arrLen = java.lang.reflect.Array.getLength(array);

        if(arrLen <= 1){
            return;
        }

        int tmp;
        int i = 0;
        int j = arrLen - 1;

        while(i < j){
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

            i++;
            j--;
        }
    }
}
