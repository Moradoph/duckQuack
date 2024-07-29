/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingPoliteDuckFactory();

        simulator.simulate();
        System.out.println();
        simulator.simulate(duckFactory);
    }

    void simulate() {
        Quackable mallardDuck = new PolitelyQuack(new QuackCounter(new MallardDuck()));
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        // Goose goose = new Goose();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(redHeadDuck);

        Flock flock2 = new Flock();
        flock2.add(duckCall);
        flock2.add(rubberDuck);
        flock2.add(goose);
        flock2.add(pigeon);

        System.out.println("\nDuck Simulator");

//        simulate(mallardDuck);
//        simulate(redHeadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);

        // adapter pattern implementation needed
//        simulate(goose);
//        simulate(pigeon);

        simulate(flock1);
        simulate(flock2);

        System.out.println("Number of Quacks = " + QuackCounter.getNumOfQuacks());
    }

    public void simulate(Quackable duck) {
        duck.quack();
    }

    public void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        // Goose goose = new Goose();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Goose and Pigeon Adapter");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        // adapter pattern implementation needed
        simulate(goose);
        simulate(pigeon);

        System.out.println("Number of Quacks = " + QuackCounter.getNumOfQuacks());
    }
}
