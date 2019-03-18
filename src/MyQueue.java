import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public MyQueue(){
        this.stackPush = new Stack<>();
        this.stackPop = new Stack<>();
    }

    public void add(int num){
        stackPush.push(num);
    }

    public int poll(){
        if(stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is Empty!");
        } else if (stackPop.isEmpty()){
            while (!stackPush.isEmpty())
                stackPop.push(stackPush.pop());
        }

        return stackPop.pop();
    }

    public int peek(){
        if(stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is Empty!");
        } else if (stackPop.isEmpty()){
            while (!stackPush.isEmpty())
                stackPop.push(stackPush.pop());
        }

        return stackPop.peek();
    }

    public List<Integer> itrQueue() {
        if(stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is Empty!");
        } else if (stackPop.isEmpty()){
            while (!stackPush.isEmpty())
                stackPop.push(stackPush.pop());
        }

        List<Integer> list = new ArrayList<>();
        for(int i : stackPop)
            list.add(i);

        return list;
    }
}
