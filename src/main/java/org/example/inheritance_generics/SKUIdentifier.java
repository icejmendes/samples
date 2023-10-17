package org.example.inheritance_generics;

import java.util.Random;

public class SKUIdentifier extends ProductIdentifierTemplate<Integer> {
    @Override
    public Integer createIdentifier() {
        return new Random(100).nextInt();
    }
}
