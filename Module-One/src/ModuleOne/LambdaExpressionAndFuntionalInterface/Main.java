package ModuleOne.LambdaExpressionAndFuntionalInterface;

public class Main {
    public static void main(String[] args) {
        ICalculate iCalculate = amount -> amount * 0.12;
        System.out.println(iCalculate.taxCalculate(100));

        System.out.println("===========================");
        IInvoice iInvoice = (quantity, unitPrice) -> quantity * unitPrice;
        System.out.println(iInvoice.price(2, 15.5));
        iInvoice.printInvoiceName("Oscar");
        IInvoice.printAddress("Invoice address");

    }
}
