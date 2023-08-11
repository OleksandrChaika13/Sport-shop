package app.orders;

import app.goods.BlackCap;
import app.goods.BlueShort;
import app.goods.RedShort;
import app.goods.WhiteCap;

public class OrderBuilder {

    public Order prepareOrderA() {
        Order order = new Order();
        order.addItem(new RedShort());
        order.addItem(new WhiteCap());
        return order;
    }

    public Order prepareOrderB() {
        Order order = new Order();
        order.addItem(new BlueShort());
        order.addItem(new BlackCap());
        return order;
    }
}
