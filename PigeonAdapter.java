public class PigeonAdapter implements Quackable{

    private Pigeon pigeon;

    public PigeonAdapter(Pigeon p){
        this.pigeon = p;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
