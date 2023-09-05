package org.example.strategy_json_serializable.sample_2;

import com.google.gson.JsonParseException;

import java.util.Optional;

public class Main {

    public static void main(String[] args) throws JsonParseException{
        PojoResponseNEW agt = new PojoResponseNEW();
        agt.setSomeDataX("someData");
        agt.setSomeDataY("someData");
        agt.setTransactionCode("123456789");

        PojoResponseOLD srf = new PojoResponseOLD();
        srf.setSomeDataX("someData");
        srf.setSomeDataY("someData");

        try {
            var pojoDTO = Optional.ofNullable(agt).map(PojoResponseNEW::execute).get();
            var pojoDTO2 = Optional.ofNullable(srf).map(PojoResponseOLD::execute).get();

            System.out.println(pojoDTO);
            System.out.println(pojoDTO2);

        } catch (JsonParseException e) {

        }



    }
}
