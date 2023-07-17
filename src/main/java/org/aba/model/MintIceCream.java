package org.aba.model;

import org.aba.interfaces.IceCream;
import org.aba.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice-cream");
        return super.cost();
    }
}
