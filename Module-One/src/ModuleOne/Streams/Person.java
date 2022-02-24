package ModuleOne.Streams;

public record Person(String name, String lastName) {

    public void completeName (){
        System.out.println( name + " " + lastName);
    }

}
