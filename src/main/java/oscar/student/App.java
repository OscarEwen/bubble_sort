package oscar.student;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] testOne = {70, 61, 72, 83, 38};
        int[] testTwo = {7, 2, 76, 4, 99};
        int[] testThree = {28, 9, 13, 78, 19};
        int[] testFour = {68, 84, 41, 62, 18};
        int[] testFive = {37, 57, 30, 13, 50};

        System.out.println("Unsorted test:");
        System.out.println(Arrays.toString(testOne));
        System.out.println("Sorted test:");
        System.out.println(Arrays.toString(bubbleSort.sort(testOne)));
        System.out.println("Unsorted test:");
        System.out.println(Arrays.toString(testTwo));
        System.out.println("Sorted test:");
        System.out.println(Arrays.toString(bubbleSort.sort(testTwo)));
        System.out.println("Unsorted test:");
        System.out.println(Arrays.toString(testThree));
        System.out.println("Sorted test:");
        System.out.println(Arrays.toString(bubbleSort.sort(testThree)));
        System.out.println("Unsorted test:");
        System.out.println(Arrays.toString(testFour));
        System.out.println("Sorted test:");
        System.out.println(Arrays.toString(bubbleSort.sort(testFour)));
        System.out.println("Unsorted test:");
        System.out.println(Arrays.toString(testFive));
        System.out.println("Sorted test:");
        System.out.println(Arrays.toString(bubbleSort.sort(testFive)));
    }
}
