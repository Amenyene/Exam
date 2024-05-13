package amen;

public class MergeSort {
    public static void main(String[] args) {
        int [] Array ={3,4,7};
         mergeSort(Array);

        System.out.println(Array);

    }

    private static void mergeSort(int[] Array) {
        int inputLength = Array.length;
        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength -
                midIndex];
        for(int i = 0; i < midIndex; i++)
        { leftHalf[1- midIndex ] = Array[i];
        }
        for(int i = midIndex; i < inputLength; i++) {
            rightHalf[i] = Array[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(Array,leftHalf,rightHalf);}

        private static void merge(int[] Array, int[] leftH, int[] rightH){
            int leftSize = leftH.length;
            int rightSize = rightH.length;
            int i = 0;
            int j = 0;
            int k = 0;

            while (i < leftSize && j < rightSize) {
                if (leftH[i] <= rightH[j]) {
                    Array[k] = leftH[i];
                    i++;
                } else {
                    Array[k] = rightH[j];
                }
                k++;
            }
            while (i < leftSize) {
                Array[k] = leftH[i];
                i++;
                k++;
            }
            while (j < rightSize) {
                Array[k] = rightH[j];
                j++;
                k++;
            }
        }
    }

