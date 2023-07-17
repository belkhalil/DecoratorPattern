package org.aba.model;

import org.aba.interfaces.IceCream;
import org.aba.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Chocolate Ice-cream");
        return 1.5 + super.cost();
    }
}
