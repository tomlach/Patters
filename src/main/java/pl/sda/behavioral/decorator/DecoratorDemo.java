package pl.sda.behavioral.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(3, 8);

        calculator = new LoggingDecorator(calculator);
        calculator.add (2, 2);
        calculator.add (2, 3);
        calculator.add (2, 5);
        calculator.add (2, 7);

        calculator = new ActionDecorator(calculator);
        calculator.add(7,3);

    }
}
