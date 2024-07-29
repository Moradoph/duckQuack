public class PolitelyQuack implements Quackable{
    Quackable quackable;

    public PolitelyQuack(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.println("KrubJa");
    }
}
