import java.util.Stack;

public class SQueue {

    Stack <Integer> input = new Stack<>();
    Stack <Integer> output = new Stack<>();

    public SQueue(){

    }

    public void push(int x){
        input.push(x);
    }

    public int pop(){
        if(output.empty())
            while(input.empty()==false){
                output.push(input.peek());
                input.pop();
            }

        int x = output.peek();
        output.pop();
        return x;
        
    }

    public int peek(){
        if(output.empty())
            while(input.empty()==false){
                output.push(input.peek());
                input.pop();
            }

        return output.peek();
        
    }

    public int size(){
        return (output.size() + input.size());
    }
    public static void main(String[] args) {
        SQueue q = new SQueue();
        q.push(3);
        q.push(4);
        System.out.println("Element popped is"+q.pop());
        q.push(5);
        System.out.println("Top element is"+q.peek());
        System.out.println("Size of queue is"+q.size());
    }
}
