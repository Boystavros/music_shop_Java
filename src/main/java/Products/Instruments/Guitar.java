package Products.Instruments;

import Products.Categories;

public class Guitar extends Instrument {

    private int stringNum;
    private GuitarType guitarType;

    public Guitar(double bougthPrice, Categories category, String make, String model, String colour, int stringNum, GuitarType guitarType) {
        super(bougthPrice, category, make, model, colour);
        this.stringNum = stringNum;
        this.guitarType = guitarType;
    }

    public int getStringNum() {
        return stringNum;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    @Override
    public String play() {
        return "Strum strum";
    }
}
