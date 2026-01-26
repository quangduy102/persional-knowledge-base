package sort;

public class InsertionSort {
    public int[] insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            //arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {5,2,9,1,7,6 , 8};
        InsertionSort sorter = new InsertionSort();
        int sortedArr[] = sorter.insertionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");    
        }
    }
}
/*example:
// Input: arr = [5, 2, 9, 1, 5, 6]
5 , 2 , 9 , 1 , 5 , 6
2  , 5 , 9 , 1 , 5 , 6
2 , 5 , 9 , 1 , 5 , 6
i = 3, key = 1
9 > 1 => arr[3] = 9;
5 > 1 => arr[2] = 5;
2 > 1 => arr[1] = 2;
break; 

*/