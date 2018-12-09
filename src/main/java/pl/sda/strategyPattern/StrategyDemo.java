package pl.sda.strategyPattern;

import java.util.Random;

public class StrategyDemo {
    public static void main (String[] args) {
        Calculus calculus = new Calculus(new SumAggregator());
        System.out.println("Using Sumaggregator: ");
        doIt(calculus);

        System.out.println("Change to minusCalculator");
        calculus.setAggregator(new MinusAggregator());
        doIt(calculus);

    }

    private static void doIt(Calculus calculus){
        Random random = new Random();

        for (int i = 0; i<10; i++){
            calculus.execute(random.nextInt(20));
            System.out.println("Current: " + calculus.getCurrentNumber());
        }
    }
}
