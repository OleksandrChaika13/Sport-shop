package app.items;

import app.production.IProduction;

    public interface Item {

        String name();

        IProduction producer();

        float price();
    }
