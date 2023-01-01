package otherJavaTopics.collections;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("ARRAYLIST : Accepts null, retrieving the element-FAST, Array based, multi thread");
        list.add(null);
        System.out.println("ArrayList : "+list);
        list.addAll(Arrays.asList("a","a","b","c",null,"b","b","a",null));
        System.out.println("ArrayList : "+list);

        List<String> list1 = new LinkedList<>();
        System.out.println("LINKEDLIST : Accepts null, retrieving the element-SLOW, insertion & deletion-FAST, Node based,FIFO order because implements Queue");
        list1.add(null);
        System.out.println("LinkedList : "+list1);
        list1.addAll(Arrays.asList("a","a","b","c",null,"b","b","a",null));
        System.out.println("ArrayList : "+list1);


        List<String> list2 = new Vector<>();
        System.out.println("VECTOR : Accepts null, Same as arrayList, synchronized = 1 thread at a time = SLOW");
        list2.add(null);
        System.out.println("Vector : "+list2);
        list2.addAll(Arrays.asList("a","a","b","c",null,"b","b","a",null));
        System.out.println("ArrayList : "+list2);

        Vector<String> list3 = new Stack<>();
        System.out.println("STACK : Accepts null, Array based, LIFO order");
        list3.add(null);
        System.out.println("Stack : "+list3);
        list3.addAll(Arrays.asList("a","a","b","c",null,"b","b","a",null));
        System.out.println("ArrayList : "+list3);

        String[] a = {null};
        System.out.println("Array : " + Arrays.toString(a));

    }

}
