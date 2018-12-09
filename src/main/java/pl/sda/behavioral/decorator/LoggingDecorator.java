package pl.sda.behavioral.decorator;

import pl.sda.creational.singleton.SingletonLogger;

public class LoggingDecorator extends Calculator {

    private final Calculator calculator;
    public LoggingDecorator (Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        int result = calculator.add(a,b);
        SingletonLogger.getInstance().log(String.format("%d + %d = %d", a, b, a+b));
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        return super.subtract(a, b);
    }
}
