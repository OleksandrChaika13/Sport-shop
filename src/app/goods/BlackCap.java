package app.goods;

import app.items.Caps;

public class BlackCap extends Caps {

    @Override
    public float price() {
        return 10.51f;
    }

    @Override
    public String name() {
        return "Black Cap";
    }
}
