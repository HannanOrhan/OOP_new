package otherJavaTopics.collections;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        System.out.println("PRIORITY-QUEUE : random order, no null, duplicates are allowed");
        //queue.add(null);
        queue.addAll(Arrays.asList("4","1","2","3","1","2","2","3"));
        System.out.println(queue);


        Queue<String> queue1 = new ArrayDeque<>();
        System.out.println("ARRAY-DEQUE : insertion order, no null, duplicates are allowed");
        //queue1.add(null);
        queue1.addAll(Arrays.asList("4","1","2","3","1","2","2","3"));
        System.out.println(queue1);

        Queue<String> queue2 = new LinkedList<>();
        System.out.println("LINKED-LIST : both interface(Queue and List) implemented ,random order, accepts null, duplicates are allowed");
        queue2.add(null);
        queue2.addAll(Arrays.asList("4","1","2","3",null,"1","2","2","3"));
        System.out.println(queue2);


    }
}
