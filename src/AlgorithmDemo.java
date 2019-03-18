import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AlgorithmDemo {
    public static void main(String[] args){
        /*
        MinStack stack = new MinStack();


        stack.push(1);
        stack.push(2);
        stack.push(-1);
        System.out.println(stack.stackData);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());

        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.itrQueue());

        //ReverseStack stack1 = new ReverseStack();
        Stack<Integer> RStack = new Stack<>();
        RStack.push(1);
        RStack.push(2);
        RStack.push(3);
        System.out.println(RStack.peek());
        ReverseStack.reverse(RStack);
        System.out.println(RStack.pop());
        System.out.println(RStack.pop());

        //MaximalSquare
        int[][] matrix = {
                {1,0,1,1,0,1,1,1,1},
                {1,1,1,1,1,1,1,1,0},
                {1,1,1,0,1,0,1,1,1},
                {1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,0},
                {1,1,1,1,1,1,1,1,0},
                {1,1,1,0,1,0,1,1,1},
                {1,0,1,1,0,1,1,1,1},
                {1,1,1,0,1,0,1,1,1},
                {1,1,1,1,1,1,1,1,0}
                         };
        MaximalSquare ms = new MaximalSquare();
        System.out.println(ms.maxSquare(matrix));
        System.out.println(ms.maxSqaure2(matrix));

        //Russian Envelop
        int[][] envelopes = {
                {5,4},{6,4},{6,7},{2,3}
        };
        MaxEnvelops me = new MaxEnvelops();
        System.out.println("Maximal envelopes is " + me.maxEnvelop(envelopes));
        */

        int[] nums = {5,4,3,2,1};
        new SortAlgorithms().insertSort(nums);
        for(int num: nums){
            System.out.println(num);
        }
    }
}
