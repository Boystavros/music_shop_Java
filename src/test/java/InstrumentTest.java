import Products.Categories;
import Products.Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void IntsrumentHasABoughtPrice(){
        assertEquals(100.00, guitar.getBougthPrice(), 0.01);
    }

    @Test
    public void InstrumentHasCategory() {
        assertEquals(Categories.STRING, piano.getCategory());
    }

    @Test
    public void InstrumentHasMake() {
        assertEquals("Yamaha", saxophone.getMake());
    }

    @Test
    public void InstrumentHasModel() {
        assertEquals("Les Paul", guitar.getModel());
    }

    @Test
    public void InstrumentHasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void InstrumentHasSubType() {
        assertEquals(SaxType.TENOR, saxophone.getSaxType());
    }

    @Test
    public void GuitarHasStringNum() {
        assertEquals(6, guitar.getStringNum());
    }

    @Test
    public void CanCalculateMarkUp() {
        assertEquals(30.0, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void CanPlay() {
        assertEquals("Toot toot", saxophone.play());
    }
}
