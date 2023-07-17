package org.aba.model;

import org.aba.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating Basic Ice Cream");
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
