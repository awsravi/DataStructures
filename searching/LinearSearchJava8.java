package searching;

import java.util.Arrays;

public class LinearSearchJava8 {
    public static void main(String[] args) {
    int[]arr={5,8,3,20,15,25};    //---->O(1)
    int se=202;                    //---->O(1)

    Arrays.stream(arr).filter(i -> i==se).findFirst().ifPresentOrElse(  //O(n)
        index -> System.out.println("Element "+ se +" at index "+index),
        () -> System.out.println("Element "+ se +" not found")      //O(1)
    );

}
}
