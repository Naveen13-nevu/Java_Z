
import java.util.Stack;

public class MinStacks {
    
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int n){
        stack.push(n);
        if(minStack.isEmpty() || n <= minStack.peek()){
            minStack.push(n);
        }
    }

    public void pop(){
        int top = stack.peek();
        if(top == minStack.peek()){
            minStack.pop();
        }
        stack.pop();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        
        MinStacks min = new MinStacks();

        min.push(5);
        min.push(1);
        min.push(3);
        min.push(4);

        System.out.println(min.getMin());
    

    }
}
