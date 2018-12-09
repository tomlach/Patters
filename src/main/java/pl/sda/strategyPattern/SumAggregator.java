package pl.sda.strategyPattern;

public class SumAggregator implements Aggregator{


    @Override
    public int execute(int current, int number) {
        return current + number;
    }
}

