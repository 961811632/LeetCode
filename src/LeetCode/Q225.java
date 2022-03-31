package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/25 10:58
 */
public class Q225 {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public void MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        q2.offer(x);
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

}
