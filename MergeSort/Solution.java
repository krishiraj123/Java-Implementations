package MergeSort;

import java.util.Arrays;

class Solution {
    public static int[] mergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            k++;
            i++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[] { 5, 4, 3, 2, 1 })));
    }
}
