import java.util.Stack;

public class ReverseStack {
    private static int getAndRemoveLast(Stack<Integer> stack){
        int result = stack.pop();

        if(stack.isEmpty()){
            return result;
        } else {
            int last = getAndRemoveLast(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }

        int i = getAndRemoveLast(stack);
        reverse(stack);
        stack.push(i);
    }
}
