package sort;

public class BubleSort {
    public void BubleSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i ++) {
            for(int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
/**
 * for (int i = 0; i < arr.length - 1; i ++){
            for (int j = 0; j < arr.length - 1- i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
 * [3, 7 , 9, 5, 1, 6]
 * [3, 7 , 5, 1, 6, 9]
 * [3, 5, 7 , 1, 6, 9]
 * [3, 5, 1, 6, 7 , 9]
 * [3, 1, 5, 6, 7 , 9]
 * [1, 3, 5, 6, 7 , 9]
 *  
 * * Complexity
 * * * Time Complexity: O(n^2)
 * * * Space Complexity: O(1)
 * 
 */