package business;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class Order implements Serializable {
    private int orderID;
    private int clientID;
    private Date orderDate;
    private int total = 0;

    public Order(int orderID, Date orderDate, int clientID) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.clientID = clientID;
    }

    public int getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getClientID() {
        return clientID;
    }

    public int hashCode() {
        return (int) orderDate.hashCode() + orderID + parseInt(String.valueOf(clientID));
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderID == order.orderID &&
                clientID == order.clientID &&
                orderDate.equals(order.orderDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return "Order{" +
                "orderID=" + orderID +
                ", OrderDate=" + formatter.format(orderDate) +
                ", clientID=" + clientID +
                '}' + "\n";
    }
}
