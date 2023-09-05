package org.example.strategy_json_serializable.sample_1;

import org.example.strategy_json_serializable.sample_1.PojoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        System.out.println("\n######GSON######");

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        PojoDTO pojoDTO = new PojoDTO();
        pojoDTO.setSomeDataX("ABC");
        pojoDTO.setSomeDataY("XYZ");
        pojoDTO.setTransactionCode("123456789");

        String gsonResultWithTransaction = gson.toJson(pojoDTO);
        System.out.println(gsonResultWithTransaction);

        PojoDTO pojoDTO2 = new PojoDTO();
        pojoDTO2.setSomeDataX("ABC");
        pojoDTO2.setSomeDataY("XYZ");

        String gsonResultWithoutTransaction = gson.toJson(pojoDTO2);
        System.out.println(gsonResultWithoutTransaction);

        System.out.println("\n######OBJECT_MAPPER######");
        ObjectMapper objectMapper = new ObjectMapper();

        String mapperResultWithTransaction = objectMapper.writeValueAsString(pojoDTO);
        System.out.println(mapperResultWithTransaction);

        String mapperResultWithoutTransaction = objectMapper.writeValueAsString(pojoDTO2);
        System.out.println(mapperResultWithoutTransaction);

        System.out.println("\n\n\n\n\n################");

    }

    private static void clear() {
        try {
            Runtime.getRuntime().exec("cls");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
