package Products.Instruments;

import Products.Categories;

public class Piano extends Instrument {

    private PianoType pianoType;

    public Piano(double bougthPrice, Categories category, String make, String model, String colour, PianoType pianoType) {
        super(bougthPrice, category, make, model, colour);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    @Override
    public String play() {
        return "Plonk plonk";
    }
}
