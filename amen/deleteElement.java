package amen;


import java.util.Arrays;

public class deleteElement {
    public static void main(String[] args) {


    int[] array = {3, 7, 1, 9, 4};
    ;
    deleteIn(array,1);
        ;

    for (int j = 0; j<array.length;j++)
        System.out.println(array);
    }

      public static void deleteIn(int [] array,int indexToDelete){
          int[] newArray = new int[array.length - 1];
          for (int i = 0, j = 0; i < array.length; i++)
               if (i != indexToDelete) {
               newArray[j++] = array[i];

          }
 }
}
