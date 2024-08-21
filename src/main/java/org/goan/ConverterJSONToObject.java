package org.goan;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConverterJSONToObject {

    public void fillData(Data data){
        String jsonFilePath = "datos.json";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));
            data.setSeries(rootNode.get("serie").asText());
            data.setNumber(rootNode.get("numero").asInt());
            data.setClientDocumentNumber(rootNode.get("cliente_numero_de_documento").asText());
            data.setClientDenomination(rootNode.get("cliente_denominacion").asText());
            data.setClientAddress(rootNode.get("cliente_direccion").asText());
            data.setIssueDate(rootNode.get("fecha_de_emision").asText());
            data.setExpiredDate(rootNode.get("fecha_de_vencimiento").asText());
            data.setCurrency(rootNode.get("moneda").asInt());
            data.setTotal(rootNode.get("total").asDouble());
            data.setTotalIgv(rootNode.get("total_igv").asDouble());
            data.setTotalGrav(rootNode.get("total_gravada").asDouble());

            List<Item> itemList = new ArrayList<>();
            JsonNode itemsNode = rootNode.get("items");
            if (itemsNode != null && itemsNode.isArray()) {
                for (JsonNode itemNode : itemsNode) {
                    Item item = new Item();
                    item.setMeasure(itemNode.get("unidad_de_medida").asText());
                    item.setCode(itemNode.get("codigo").asText());
                    item.setDescription(itemNode.get("descripcion").asText());
                    item.setQuantity(itemNode.get("cantidad").asDouble());
                    item.setUnitPrice(itemNode.get("precio_unitario").asDouble());
                    item.setUnitValue(itemNode.get("valor_unitario").asDouble());
                    item.setTotal(itemNode.get("total").asDouble());
                    itemList.add(item);
                }
                data.setItemList(itemList);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        }
    }

}
