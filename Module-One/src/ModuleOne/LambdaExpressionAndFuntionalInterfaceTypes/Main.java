package ModuleOne.LambdaExpressionAndFuntionalInterfaceTypes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("**************** Consumer ****************");
        // We have to specify what kind of variable it receives.
        Consumer<String> stringConsumer = (name) -> System.out.println("consumer parameter: " + name);
        // To execute the consumer we have to call the accept method.
        stringConsumer.accept("Paolo");

        System.out.println("============ Consumer with then =================");
        Consumer<Integer> consumerA = (value) -> System.out.println(value * 10);
        Consumer<Integer> consumerB = (value) -> System.out.println(value);
        // First execute the consumerA and next execute the consumerB
        consumerA.andThen(consumerB).accept(10);

        System.out.println("============ BiConsumer =================");
        BiConsumer<String, Double> biConsumer = (name, cost) -> {
            Main main = new Main();
            main.addDataFile(name, cost);
        };
        biConsumer.accept("Bryan", 40.0);
        biConsumer.accept("Oscar", 45.00);
        biConsumer.accept("Jorge", 30.0);

        System.out.println("**************** Function ****************");
        // We have to specify what kind of parameter and what kind of return
        Function<String, Integer> function = (name) -> name.length();
        System.out.println(function.apply("Oscar"));
        
        Function<Integer, Double> circleArea = (radio) -> Math.PI * Math.pow(radio, 2);
        System.out.println("The circle area is: " + circleArea.apply(2));

        Function<Point, Integer> multiplication = point -> point.value1() * point.value2();
        System.out.println("The multiplication result is: " + multiplication.apply(new Point(5,4)));

        System.out.println("**************** Supplier ****************");
        // This doesn't receive parameter but has to return something
        Supplier<Double> provider = () -> Math.random() * 10;
        System.out.println(provider.get());

        System.out.println("**************** Predicate ****************");
        // This does boolean operators
        Predicate<String> login = (user) -> {
            if(user.equalsIgnoreCase("admin")) return true;
            return false;
        };

        Predicate<String> authorize = (user) -> {
            if(user.equalsIgnoreCase("admin")) return true;
            return false;
        };

        System.out.println(login.and(authorize).test("admin"));

        System.out.println("**************** Comparator ****************");

        Comparator<Integer> integerComparator = (number_1, number_2) -> {
            if(number_1 > number_2) return 1;
            else if (number_1 == number_2) return 0;
            else return -1;
        };

        System.out.println(integerComparator.compare(5, 4));

    }

    public void addDataFile(String name, Double cost){
        try{
            FileWriter pw = new FileWriter("example.txt", true);
            pw.write(name + " " + cost);
            pw.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
