package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("B");

//        for (String s : queue) {
//            System.out.println(s);
//        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // poll() = remove e apresenta
        // peak() = apresenta
    }
}
