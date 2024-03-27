package entities;

import instituition.OrderStatus;

import java.util.Date;

public class Pedidos {
    private Integer idPedidos;
    private Date moment;
    private OrderStatus status;         // ---> Declarando o tipo de enumeração

    //!         ----------------------------------       Constructor        --------------------------------------------
    public Pedidos() {
    }

    public Pedidos(Integer id, Date moment, OrderStatus status) {
        this.idPedidos = id;
        this.moment = moment;
        this.status = status;
    }

    //! ----------------------------------       Getter and Setter      ------------------------------------------------
    public Integer getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(Integer idPedidos) {
        this.idPedidos = idPedidos;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    //! -------------------------------------       toString      ------------------------------------------------------
    @Override
    public String toString() {
        return "Pedidos" + "\n" +
               "Id= " + idPedidos + "\n" +
               "Moment= " + moment + "\n" +
               "Status= " + status + "]";
    }


}