import Products.Product;

import java.util.ArrayList;

public class shop {

    private ArrayList<Product> stock;

    public shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void addItem(Product product){
        this.stock.add(product);
    }

    public Product removeItem(Product product){
        return this.stock.remove(stock.indexOf(product));
    }


}
