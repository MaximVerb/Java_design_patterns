package maxim.patterns.behavioral.strategy.interface_strategy_design;

public class AppleOnlyHeavy implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 200.0;
    }
}
