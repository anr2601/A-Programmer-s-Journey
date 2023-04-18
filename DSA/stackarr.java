import java.util.* ;
import java.io.*; 


public class stackarr {

    int top=-1;
    int capacity=10000;
    int a[] = new int[capacity];
    
    void push(int num) {
        // Write your code here.
        if(top==capacity-1){
            return;
        }
        top++;
        a[top] = num;
    }
    int pop() {
        // Write your code here.
        if(top==-1){
            return -1;
        }
        int res = a[top];
        top--;
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


