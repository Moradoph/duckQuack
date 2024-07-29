/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

public class CountingPoliteDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new PolitelyQuack(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new PolitelyQuack(new QuackCounter(new RedHeadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new PolitelyQuack(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PolitelyQuack(new QuackCounter(new RubberDuck()));
    }
}
