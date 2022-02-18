package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        int[] resultArray = new int[input.length];
        int index = resultArray.length - 1;
        int leftPointer = 0;
        int rightPointer = input.length - 1;
        while (leftPointer <= rightPointer) {
            if(Math.abs(input[leftPointer]) > Math.abs(input[rightPointer])) {
                resultArray[index] = input[leftPointer] * input[leftPointer];
                leftPointer++;
            } else {
                resultArray[index] = input[rightPointer] * input[rightPointer];
                rightPointer--;
            }
            index--;
        }
        return resultArray;
    }
}
