package maxim.patterns.behavioral.strategy.interface_strategy_design;

public class AppleHeavyAndRed implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("RED") &&
                apple.getWeight() > 25.00;
    }
}
