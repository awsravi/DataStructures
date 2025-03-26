
package searching;
public class LinearSearch {
    //Internal working of Linear Search visit Notes.
    public static void main(String[] args) {
        int[]arr={5,8,3,20,15,25};    //---->O(1)
        int se=20;                    //---->O(1)
        
        System.out.println("After Linear Search");
        int result=linearSearch(arr,se);
        System.out.println("Element "+ se +" at index "+result);
    }
    
     public static int linearSearch(int[] arr,int se){
       
        for(int i=0;i<arr.length;i++){   //---> n+1  O(n)
            if(arr[i]==se){              //--->n
                System.out.println("Element found at index "+i);
                return i;         //--->1
            }
        }
        System.out.println("Element not found in the Array");
        return -1;             //--->1
     } 

}
