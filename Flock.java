/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Flock implements Quackable{
    List<Quackable> quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        System.out.println("\n----- Flock -----");
        for (Quackable q : quackers){
            if (q == quackers.get(0)) {
                q.quack();
                q.quack();
            }
            q.quack();
        }
    }
}
