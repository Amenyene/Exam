package amen;

import java.util.Scanner;
public class searchNum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int []numbers;
        numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter number " + (i+1));
            numbers[i] = keyboard.nextInt();}

            System.out.println("Enter the number you want to search");
            int key = keyboard.nextInt();


            for (int j = 0; j <numbers.length; j++) {
                if (numbers[j] == key) {
                    System.out.println("Element found at index: " + j);
                    break;
                }


            }
        }
    }
