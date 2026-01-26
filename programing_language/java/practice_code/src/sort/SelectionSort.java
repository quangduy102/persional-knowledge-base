package sort;

public class SelectionSort {
    public void SelectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i ++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[j] < arr[minValue])
                    minValue = j;
            }
            int temp = arr[i];
            arr[i] = arr[minValue];
            arr[minValue] = temp;
        }
    }
    public static void main(String[] args) {
        
    }
}
/**
 * public int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i ++) {
            int minIndex = findMinIndex(arr, i);
            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
    public int findMinIndex(int[] arr, int startIndex) {
        int min = startIndex;
        for(int i = startIndex + 1; i < arr.length; i++) {
            if(arr[i] < arr[startIndex]) {
                min = i;
            }
        }
        return min;
    }
 * Complexity 
 * * Time Complexity: O(n^2)
 * * Space Complexity: O(1)
 * 
 */
