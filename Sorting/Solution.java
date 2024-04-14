import javax.swing.plaf.synth.SynthRootPaneUI;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Sort s = new Sort();
        int[] arr = { 4, 1, 5, 12, 3, 11 };
        s.BubbleSort(arr);
        System.out.println(s.BubbleSortWithRecursion(arr, arr.length - 1));
        s.SelectionSort(arr);
        System.out.println(s.SelectionSortUsingRecursion(arr, 0));
        s.insertionSort(arr);

        // using the method null
        s.insertionSortUsingRecursion(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}

class Sort {
    public static void BubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static String BubbleSortWithRecursion(int[] arr, int index) {
        if (index <= 0) {
            return "";
        }

        int j = 0;
        for (; j < arr.length - 1; j++) {
            int temp = 0;
            if (arr[j] > arr[j + 1]) {
                temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
        BubbleSortWithRecursion(arr, index - 1);
        return Arrays.toString(arr);
    }

    public void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (minIndex > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public String SelectionSortUsingRecursion(int[] arr, int index) {
        if (index > arr.length - 1) {
            return "";
        }
        int minIndex = index;
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[j] < minIndex) {
                minIndex = j;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[index];
        arr[index] = temp;
        SelectionSortUsingRecursion(arr, index + 1);
        return Arrays.toString(arr);
    }

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void insertionSortUsingRecursion(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return;
        }
        int key = arr[index];
        int j = index - 1;
        while (arr[j] > arr[index] && j >= 0) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = arr[index];
        insertionSortUsingRecursion(arr, index + 1);
    }
}
