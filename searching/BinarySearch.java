package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int searchElement = 10;
        binarySearch(arr, searchElement);
    }
    
        public static int binarySearch(int[] arr, int se) {
            int low = 0;
            int high = arr.length - 1;
            
            while (low <= high) {
                int mid = low + (high - low) / 2; 
                System.out.println("low : " + low + " mid : " + mid + " high : " + high);
                
                if (arr[mid] == se) {
                    System.out.println("Element " + se + " found at index " + mid);
                    return mid;
                } else if (se < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            
            System.out.println("Element " + se + " not found in the array");
            return -1;
        }
    
    }
    