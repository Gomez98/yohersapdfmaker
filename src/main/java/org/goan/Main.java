package org.goan;

public class Main {

    public static void main(String[] args) throws Exception {
        Data data = new Data();
        ConverterJSONToObject converterJSONToPDF = new ConverterJSONToObject();
        converterJSONToPDF.fillData(data);

        ConverterObjectToPdf converterObjectToPdf = new ConverterObjectToPdf();
        converterObjectToPdf.createReport(data);
        System.out.println(data.getItemList().get(0).getDescription());
    }
}