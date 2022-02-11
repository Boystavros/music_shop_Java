package Products.Accessories;

import Products.Categories;
import Products.Product;

public abstract class Accessory extends Product {

    private String description;

    public Accessory(double bougthPrice, Categories category, String make, String description) {
        super(bougthPrice, category, make);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
