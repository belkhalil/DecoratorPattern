package org.aba.model;

import org.aba.interfaces.IceCream;
import org.aba.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding vanilla Ice-cream");
        return 1.0 + super.cost();
    }
}
