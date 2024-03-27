package orders;

import entities.Client;
import entities.OrderItem;
import instituition.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Pedido {

    private Date moment;
    private OrderStatus status;
    private Client client;
    private final List<OrderItem> itemList = new ArrayList<>();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //! ---------------------------------------    Constructor        --------------------------------------------------
    public Pedido(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
    }

    //! ----------------------------------       Getter and Setter      ------------------------------------------------
    public Pedido(Date moment2, statusService.OrderStatus status2, Client client2) {
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItens() {
        return itemList;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    //! -------------------------------------       METHODS       ------------------------------------------------------
    public void addItem(OrderItem item) {
        item.add(item);
    }

    public void removeItem(OrderItem item) {
        item.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : Objects.requireNonNull(Item())) {
            sum += item.subTotal();
        }
        return sum;
    }

    private OrderItem[] Item() {
        return null;
    }

    //! -------------------------------------       toString      ------------------------------------------------------
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client).append("\n");
        sb.append("Order items:\n");

        for (OrderItem item : itemList) {
            sb.append(item).append("\n");
        }

        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }


}