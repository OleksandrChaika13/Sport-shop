package app.items;

import app.production.ActiveSports;
import app.production.IProduction;

public abstract class TShorts implements Item {

    @Override
    public IProduction producer() {
        return new ActiveSports();
    }
}
