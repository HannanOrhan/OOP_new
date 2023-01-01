package otherJavaTopics.collections;

import java.util.*;

public class SetTest {


    public static void main(String[] args) {

        Set<String> hasSet = new HashSet<>();
        System.out.println("HASHSET : Accepts null, NO duplicate, random order");
        hasSet.add(null);
        System.out.println("HashSet : " + hasSet);
        hasSet.addAll(Arrays.asList("f","c","d","b","b","a","f","c","d","b","a","a"));
        System.out.println("HashSet : " + hasSet);


        Set<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println("LINKEDHASHSET : Accepts null, NO duplicate, insertion order");
        linkedHashSet.add(null);
        System.out.println("linkedHashSet : " + linkedHashSet);
        linkedHashSet.addAll(Arrays.asList("f","c","d","b","d","a","f","a","d","b","b","a"));
        System.out.println("linkedHashSet : " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>(); //does not accept null
        System.out.println("TREESET : NO null, NO duplicate, sorted order(ascending)");
        //treeSet.add("null"); //runtime error
        System.out.println("treeSet : " + treeSet);
        treeSet.addAll(Arrays.asList("f","c","d","b","b","a","f","a","a","b","c","a"));
        System.out.println("treeSet : " + treeSet);



    }

}
