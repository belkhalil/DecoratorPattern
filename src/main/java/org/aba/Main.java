package org.aba;

import org.aba.interfaces.IceCream;
import org.aba.interfaces.IceCreamDecorator;
import org.aba.model.BasicIceCream;
import org.aba.model.ChocolateIceCream;
import org.aba.model.MintIceCream;
import org.aba.model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice Cream cost " + basicIceCream.cost());

        //ADD Vanilla to order
        IceCream vanilla = new VanillaIceCream(basicIceCream);
        System.out.println("Adding Vanilla - cost is " + vanilla.cost());

        // Add Chocolate to order
        IceCream chocolate = new ChocolateIceCream(vanilla);
        System.out.println("Adding chocolate - cost is " + chocolate.cost());

        // Add Mint to order

        IceCream mint = new MintIceCream(chocolate);
        System.out.println("Adding mint - cost is " + mint.cost());

    }
}