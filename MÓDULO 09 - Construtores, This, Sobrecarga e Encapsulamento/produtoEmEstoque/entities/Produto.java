package produtoEmEstoque.entities;

public class Produto {

    private String nameProduto;
    private double price;
    private int quantity;

    //! -----------------------------------------   CONSTRUCTORS    ----------------------------------------------------
    public Produto() {
    }

    public Produto(String nameProduto, double price, int quantity) {
        this.nameProduto = nameProduto;
        this.price       = price;
        this.quantity    = quantity;
    }

    public Produto(String nameProduto, double price) {
        this.nameProduto = nameProduto;
        this.price       = price;
        this.quantity    = 0;

    }

    //!-------------------------------- GETTERS and SETTERS     --------------------------------------------------------
    public String getNameProduto() {return nameProduto;}

    public double getPrice() {return price;}

    public int getQuantity() {return quantity;}

    public void setNameProduto(String nameProduto) {
        this.nameProduto = nameProduto;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //! -----------------------------------------    METHODS    --------------------------------------------------------
    //%% Valor total em estoque
    public double totalValueInStock() { // para criar o valor dos produtos em estoque 
        return price * quantity;
    }

    //%% Adicionar produtos em estoque
    public void addQuantity(int quantity) { // para adicionar produtos em Estoque 
        this.quantity += quantity;
    }

    //%% Remover produtos em estoque
    public void removeProducts(int quantity) { // para remover produtos em estoque 
        this.quantity -= quantity;
    }

    //%% Adicionar produtos em estoque
    public void addProduto(int newQuantity) {
    }

    //! -----------------------------------------    TOSTRING    -------------------------------------------------------
    public String toString() { // Para Retornar um Print na tela
        // o termo String.format e para formatar a String
        return nameProduto + ", R$ " + String.format("%.2f", price) + ", Quantidade: " + quantity + ", Valor Toral em" +
               " estoque (R$): "
               + String.format("%.2f", totalValueInStock());
    }
}
