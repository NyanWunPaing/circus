package circus.stuff;

<<<<<<< HEAD:src/main/java/circus/stuff/Ladder.java
import circus.Asset;

public class Ladder extends Equipment implements Asset {
=======
public class Ladder extends Equipment {
>>>>>>> in-lecture:src/main/java/circus/stuff/Ladder.java

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
