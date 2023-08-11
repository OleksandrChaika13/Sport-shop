package app.goods;

import app.items.Caps;

public class WhiteCap extends Caps {

    @Override
    public float price() {
        return 10.49f;
    }

    @Override
    public String name() {
        return "White Cap";
    }
}
