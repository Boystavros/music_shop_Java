import Products.Categories;
import Products.Instruments.*;
import org.junit.Before;
import org.junit.Test;

public class InstrumentTest {

    private Guitar guitar;
    private Piano piano;
    private Saxophone saxophone;

    @Before
    public void before(){
        this.guitar = new Guitar(100.00, Categories.STRING, "Gibson", "Les Paul", "Bone", 6, GuitarType.ELECTRIC);
        this.piano = new Piano(1000.00, Categories.STRING, "Yamaha", "BG1", "Black", PianoType.BABYGRAND);
        this.saxophone = new Saxophone(500.00, Categories.BRASS, "Yamaha", "YAS20", "Brass", SaxType.TENOR);
    }

    @Test

}
