package pl.sda.behavioral.decorator;

import pl.sda.creational.singleton.SingletonLogger;

public class ActionDecorator extends Calculator {

    private final   Calculator calculator;

    public ActionDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        SingletonLogger.getInstance().log("Start");
        int result = calculator.add (a,b);
        SingletonLogger.getInstance().log("End");
        return result;

    }
}
