package ModuleOne.AnonymousClasses;

public class Main {

    public static void main(String[] args) {

        // AnonymousClass -> we can defined its function in this moment without create a specific class to implements
        // this function.
        Transport car = new Transport() {
            @Override
            public void move() {
                System.out.println("Begin to move the car");
            }

            @Override
            public void stop() {
                System.out.println("Stop car");
            }
        };

        Transport airplane = new Transport() {
            @Override
            public void move() {
                System.out.println("Took off");
            }

            @Override
            public void stop() {
                System.out.println("Landed");
            }
        };

        car.move();
        airplane.move();
    }

}
