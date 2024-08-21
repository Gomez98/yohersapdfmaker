package org.goan;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ConverterObjectToPdf {

    public void createReport(Data data){

        try {
            InputStream inputStream = new FileInputStream(new File("Boleta_A4.jasper"));
            File imageFile = new File("BOLETA.jpeg");
            Image image = ImageIO.read(imageFile);
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("DYNAMIC_IMAGE", image);
            parameters.put("RUC", data.getClientDocumentNumber());
            parameters.put("SERIES", data.getSeries());
            parameters.put("NUMBER", data.getNumber());

            JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, parameters, new JREmptyDataSource());

            JasperExportManager.exportReportToPdfFile(jasperPrint, "Boleta_A4.pdf");

            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
