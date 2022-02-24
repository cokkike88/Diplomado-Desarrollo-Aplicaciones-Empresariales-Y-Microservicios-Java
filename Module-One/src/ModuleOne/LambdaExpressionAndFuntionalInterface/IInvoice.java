package ModuleOne.LambdaExpressionAndFuntionalInterface;

public interface IInvoice {
    double price (int quantity, double unitPrice);

    default void printInvoiceName(String name){
        System.out.println("Invoice name is: " + name);
    }

    static void printAddress(String address){
        System.out.println(address);
    }
}
