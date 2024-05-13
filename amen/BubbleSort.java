package amen;

public class BubbleSort {
    public static void main(String[] args) {
        char [] bubble = {'a','b','f'};
        System.out.println(bubble);
    }
    void bubblesort(int[] bubble) {
        for(int i = bubble.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {

                if(bubble[j] > bubble[j + 1])
                { int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                } }
        } }
}
