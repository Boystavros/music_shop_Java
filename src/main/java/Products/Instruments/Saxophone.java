package Products.Instruments;

import Products.Categories;

public class Saxophone extends Instrument{

    private SaxType saxType;

    public Saxophone(double bougthPrice, Categories category, String make, String model, String colour, SaxType saxType) {
        super(bougthPrice, category, make, model, colour);
        this.saxType = saxType;
    }

    public SaxType getSaxType() {
        return saxType;
    }

    @Override
    public String play() {
        return "Toot toot";
    }
}
