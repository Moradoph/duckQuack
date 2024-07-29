public class QuackCounter implements Quackable{

    Quackable quackable;
    private static int numOfQuacks = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numOfQuacks++;
    }

    public static int getNumOfQuacks() {
        return numOfQuacks;
    }
}
