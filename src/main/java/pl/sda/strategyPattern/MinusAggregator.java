package pl.sda.strategyPattern;

public class MinusAggregator implements Aggregator {

    @Override
    public int execute(int current, int number) {
        return current - number;
    }
}
