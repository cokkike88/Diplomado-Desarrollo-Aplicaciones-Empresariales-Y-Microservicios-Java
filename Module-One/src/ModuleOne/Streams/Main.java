package ModuleOne.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vanessa", "Perez"));
        people.add(new Person("Andrea", "Lopez"));
        people.add(new Person("Maria", "Ramirez"));


        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(1);
        integerList.add(8);

        List<String> names = new ArrayList<>();
        names.add("name4");
        names.add("name1");
        names.add("name3");

        // Foreach
        System.out.println("==== Foreach ====");
        people.stream().forEach(person -> System.out.println(person.name()));
        // Filter
        System.out.println("==== Filter ====");
        people.stream().filter(person -> person.lastName().equalsIgnoreCase("ramirez"))
                .forEach(Person::completeName);
        // Order
        System.out.println("==== Order ====");
        var orderList = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(orderList);

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i=1; i < 100; i++){
            integers.add(random.nextInt(100));
        }

        System.out.println("Odd list");
        integers.stream().filter(x -> x%2 != 0).forEach(x -> System.out.println(x));
        System.out.println("Odd list 2");
        Integer[] integersArray = integers.stream().filter(x -> x%2 != 0).toArray(Integer[]::new);
        for (int i: integersArray){
            System.out.println(i);
        }

        System.out.println("==== Count ====");
        var oddCount = integers.stream().filter(x -> x%2 != 0).count();
        System.out.println(oddCount);

        System.out.println("==== Map ====");
        var upperCaseNames = names.stream().map(x -> x.toUpperCase()).sorted().toList();
        System.out.println(upperCaseNames);

        System.out.println("==== AnyMatch ====");
        System.out.println("are there someone that contains 1? " + names.stream().anyMatch(x -> x.contains("1")));
        System.out.println("are there someone that star with o? " + names.stream().anyMatch(x -> x.startsWith("o")));

        System.out.println("==== AllMatch ====");
        System.out.println("all of the lis contains 1? " + names.stream().allMatch(x -> x.contains("1")));
        System.out.println("all of the lis start with n? " + names.stream().allMatch(x -> x.startsWith("n")));

        System.out.println("==== NoneMatch ====");
        System.out.println("any of the lis contains 1? " + names.stream().noneMatch(x -> x.contains("1")));
        System.out.println("any of the lis start with o? " + names.stream().noneMatch(x -> x.startsWith("o")));

        System.out.println("==== FindFirst ====");
        String s = names.stream().filter(x -> x.endsWith("4") || x.endsWith("1"))
                .map(x -> x.toUpperCase()).sorted().findFirst().get();
        System.out.println(s);
    }
}
