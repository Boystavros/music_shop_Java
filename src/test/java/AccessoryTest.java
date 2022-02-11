import Products.Accessories.Drumsticks;
import Products.Accessories.GuitarStrings;
import Products.Accessories.SheetMusic;
import Products.Categories;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class AccessoryTest {

    private Drumsticks drumsticks;
    private SheetMusic sheetMusic;
    private GuitarStrings guitarStrings;

    @Before
    public void before(){
        this.drumsticks = new Drumsticks(10.00, Categories.PERCUSSION, "Drummy", "Snare sticks");
        this.sheetMusic = new SheetMusic(2.00, Categories.STRING, "Yonex", "Beethoven's 5th");
        this.guitarStrings = new GuitarStrings(5.00, Categories.STRING, "Fender", "Steel Strings");
    }

    @Test
    public void HasBoughtPrice() {
        assertEquals(5.00, guitarStrings.getBougthPrice(), 0.01);
    }

    @Test
    public void HasDescription() {
        assertEquals("Snare sticks", drumsticks.getDescription());
    }

    @Test
    public void HasMake() {
        assertEquals("Drummy", drumsticks.getMake());
    }

    @Test
    public void HasCategory() {
        assertEquals(Categories.STRING, sheetMusic.getCategory());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(3.00, drumsticks.calculateMarkup(), 0.01);
    }
}
