package ModuleOne.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        // List is a order list, this mean that if we save an element in position 0 this element always be in this
        // position

        // Set is a disorder list

        // The hashset orders the item with the hash and doesn't allow duplicate items
        // Allow null values
        Set<String> example = new HashSet<>();
        // Lista ordenada
        Set<String> order = new TreeSet<>();
        Set<String> linked = new LinkedHashSet<>();
        String[] names = {"Juan Pablo", "Oscar", "Jorge", "Alejandro"};

        for(String name: Arrays.asList(names)){
            example.add(name);
            order.add(name);
            linked.add(name);
        }

        System.out.println(example);
        System.out.println(order);
        System.out.println(linked);


        System.out.println("***************** HashSet *****************");
        example.contains("Alejandro");

        System.out.println("***************** TreeSet *****************");
        // The TreeSet implements the NavigableInterface
        order.contains("Alejandro");

        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(10);
        integers.add(14);
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(7);
        System.out.println(integers);
        // Use the Navigable interface to interact with the items
        System.out.println("===== lower of 3 ====");
        System.out.println(integers.lower(3));
        System.out.println("===== floor of 3 ====");
        System.out.println(integers.floor(3));
        System.out.println("===== higher of 3 ====");
        System.out.println(integers.higher(3));
        System.out.println("===== ceiling of 3 ====");
        System.out.println(integers.ceiling(3));



        System.out.println("***************** LinkedHashSet *****************");
        linked.contains("Alejandro");

    }
}
