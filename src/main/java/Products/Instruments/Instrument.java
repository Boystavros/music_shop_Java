package Products.Instruments;
import Products.Categories;
import Products.ISell;
import Products.Product;

public abstract class Instrument extends Product implements IPlay, ISell {

    private String model;
    private String colour;

    public Instrument(double bougthPrice, Categories category, String make, String model, String colour) {
        super(bougthPrice, category, make);
        this.model = model;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }
}
