import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue2.offer(x); // add to queue2
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll()); // transfer all elements
        }
        // swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    
    public int pop() {
        return queue1.poll(); // front element is top
    }
    
    public int top() {
        return queue1.peek(); // front element is top
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}
