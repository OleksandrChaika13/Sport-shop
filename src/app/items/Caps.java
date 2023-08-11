package app.items;

import app.production.IProduction;
import app.production.SmartCaps;

public abstract class Caps implements Item {

    @Override
    public IProduction producer() {
        return new SmartCaps();
    }
}
