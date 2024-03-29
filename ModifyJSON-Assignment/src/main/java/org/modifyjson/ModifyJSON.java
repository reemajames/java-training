package org.modifyjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.*;

public class ModifyJSON {
    public static void main(String[] args) {
        try {
            File inputFile = new File(System.getProperty("user.home") + "/input.json");
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(inputFile);

            ((ObjectNode) rootNode).put("key1", "new_value1");
            ((ObjectNode) rootNode).put("key2", "new_value2");

            ((ObjectNode) rootNode).put("new_key1", "value1");
            ((ObjectNode) rootNode).put("new_key2", "value2");

            File outputFile = new File("output.json");
            objectMapper.writeValue(outputFile, rootNode);
            System.out.println("Modified JSON saved to: " + outputFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
