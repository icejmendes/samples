package org.example.inheritance_generics;

import java.util.UUID;

public class UPCIdentifier extends ProductIdentifierTemplate<String> {
    @Override
    public String createIdentifier() {
        return UUID.randomUUID().toString();
    }
}
