package introducao.domain.entities;

import introducao.domain.enums.OrderStatus;

import java.util.Date;

public class Order {
    private int id;
    private Date moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer id, Date moment, OrderStatus stauts) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
