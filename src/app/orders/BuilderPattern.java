package app.orders;

public class BuilderPattern {

    public static void bPattern() {

        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.prepareOrderA();
        System.out.println("Order A");
        orderA.showItems();
        System.out.println("Total Cost: USD " + orderA.getCost());

        Order orderB = orderBuilder.prepareOrderB();
        System.out.println("\nOrder B");
        orderB.showItems();
        System.out.println("Total Cost: USD " + orderB.getCost());
    }
}
