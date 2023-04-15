import java.util.* ;
import java.io.*; 


public class stackarr {

    int a[];
    int top;
    int capacity;

    public MyStack(int capacity){
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }

    void push(int num) {
        // Write your code here.
        if(top==capacity-1){
            throw new Exception();
        }
        top++;
        a[top] = num;
    }
    int pop() {
        // Write your code here.
        if(top==-1){
            throw new Exception();
        }
        int res = a[top];
        pop--;
        return res;
    }
    int top() {
        // Write your code here.
        if(top==-1){
            return -1;
        }
        return a[top];
    }
    int isEmpty() {
        // Write your code here.
            return (top==-1)?(1):(0);
        
    }
    int isFull() {
        // Write your code here.
        return (top==(capacity-1))?(1):(0);
    }

    public static void main(String args[]){
        
    }
}


