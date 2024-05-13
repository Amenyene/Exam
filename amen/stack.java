package amen;

import java.util.*;

public class stack {
    int [] numArray;
    int top;
    int size;
    public stack(int capacity){
        numArray = new int[capacity];
        top = -1;
        size = 0;
    }
    public int size(){
        return size;
    }
    void push(int value){
        if(!isFull()){
            numArray[++top] = value;
            size++;
        }
        else{
            System.out.println("Full");
        }
    }
    public int pop(){
        if(!isFull()){
            int data = numArray[top--];
            size--;
            return data;
        }
        return -1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == numArray.length;
    }
    public int peek(){
        if(top >=0){
            return numArray[top];
        }
        return -1;
    }

    public static void main(String[] args) {
        stack numStack = new stack(5);
        numStack.push(11);
        numStack.push(22);
        numStack.push(33);
        numStack.push(44);

        numStack.pop();
        numStack.pop();

        for(int i = 0;i<numStack.size;i++){
            System.out.println(numStack.numArray[i]);
        }
    }
}


