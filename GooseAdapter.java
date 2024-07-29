/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

public class GooseAdapter implements Quackable{

    private Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quack() {
      goose.honk();
    }
}
