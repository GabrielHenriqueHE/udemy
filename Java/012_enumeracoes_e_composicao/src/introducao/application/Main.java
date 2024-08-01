package introducao.application;

import introducao.domain.entities.Order;
import introducao.domain.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(10, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order.toString());

    }
}
