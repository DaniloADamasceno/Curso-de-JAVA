package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    //!         ----------------------------------       Constructor        --------------------------------------------
    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    //! ----------------------------------       Getter and Setter      ------------------------------------------------
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    //! -------------------------------------       toString      ------------------------------------------------------
    @Override
    public String toString() {
        return product.getName()
               + ", $"
               + String.format("%.2f", price)
               + ", Quantity: "
               + quantity +
               ", Subtotal: $"
               + String.format("%.2f", subTotal());
    }

    //! -------------------------------------       METHODS       ------------------------------------------------------
    //%% REMOVER
    public void remove(OrderItem item) {
    }

    //%% ADICIONAR
    public void add(OrderItem item) {
    }

    //%% SUBTOTAL
    public double subTotal() {
        return price * quantity;
    }
}