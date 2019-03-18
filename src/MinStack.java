import java.util.Stack;

public class MinStack {
    public Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int num) {
        if (stackMin.isEmpty()) {
            stackMin.push(num);
        } else if (num <= stackMin.peek()){
            stackMin.push(num);
        }
        stackData.push(num);
    }

    public int pop(){
        if (stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty!");
        }
        int ret = stackData.pop();
        if(ret == stackMin.peek()){
            stackMin.pop();
        }
        return ret;
    }

    public int getMin(){
        return stackMin.peek();
    }

    public void printAll(){
        System.out.println(stackData);
    }
}
