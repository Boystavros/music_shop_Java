package Products;

public abstract class Product implements ISell {

    private double bougthPrice;
    private double rrp;
    private Categories category;
    private String make;

    public Product(double bougthPrice, Categories category, String make) {
        this.bougthPrice = bougthPrice;
        this.category = category;
        this.make = make;
        this.rrp = this.bougthPrice * 1.3;
    }

    public double getBougthPrice() {
        return bougthPrice;
    }

    public double getRrp() {
        return rrp;
    }

    public Categories getCategory() {
        return category;
    }

    public String getMake() {
        return make;
    }

    @Override
    public double calculateMarkup() {
        return this.getRrp() - this.getBougthPrice();
    }
}
