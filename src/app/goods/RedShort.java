package app.goods;

import app.items.TShorts;

public class RedShort extends TShorts {

    @Override
    public float price() {
        return 13.55f;
    }

    @Override
    public String name() {
        return "Red T-Short";
    }
}
