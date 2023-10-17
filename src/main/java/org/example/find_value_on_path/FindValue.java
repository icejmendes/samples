package org.example.find_value_on_path;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class FindValue {
    private static final String DOT_DELIMITER_REGEX = "\\.";
    private static final String DOT_DELIMITER = ".";
    private static final String PATH = "some.json.path";

    private static Integer retrieveValueFromPath(final Map<String, Object> data, final String key) {
        if (key.contains(DOT_DELIMITER)) {
            var actualKey = key.split(DOT_DELIMITER_REGEX, 2);
            var value = data.get(actualKey[0]);
            if (value instanceof Map) {
                return retrieveValueFromPath((Map) value, actualKey[1]);
            }
        }
        final Integer escrowValue = (Integer) data.get(key);

        return Objects.isNull(escrowValue) ? 0 : escrowValue;
    }

    public static void main(String[] args) {
        String first_key = "SYSTEM_A:rule_for_system_B;SYSTEM_B:rule_for_system_B";
        String step = "SYSTEM_A";
        var actualKey = first_key.split(";");

        var retrievedRule = Arrays.stream(actualKey)
                .filter(keys -> keys.contains(step)).findFirst()
                .map(splitter -> splitter.split(":")[1]);

        System.out.println(retrievedRule);
    }
}
