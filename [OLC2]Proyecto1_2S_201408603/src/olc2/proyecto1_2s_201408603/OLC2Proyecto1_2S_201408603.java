/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc2.proyecto1_2s_201408603;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Cardona
 */
public class OLC2Proyecto1_2S_201408603 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InvalidFormatException {
        // TODO code application logic here

        String pregunta = "pregunta1";
        String cadenaConCodigoEmbebido1 = "Se va a imprimir la pregunta1"; //"Se va a imprimir la" + pregunta1
        String cadenaConCodigoEmbebido2 = "Se va a imprimir la pregunta1 con algo a la derecha";
        String cadenaConCodigoEmbebido3 = "pregunta1 es una pregunta";
        String cadenaConCodigoEmbebido4 = "pregunta1";

        try {
            String[] arreglo = cadenaConCodigoEmbebido1.split(pregunta);
             if (!arreglo[0].equalsIgnoreCase("")) {
                System.out.println("\"" + arreglo[0] + "\" " + " + " + pregunta);
             }
             if (!arreglo[1].equalsIgnoreCase("")) {
                System.out.println(pregunta + "\" " + arreglo[1] + "\"");
            }
            if (arreglo[0].equalsIgnoreCase("") && arreglo[1].equalsIgnoreCase("")) {
                System.out.println(pregunta);
            } 
            if (!arreglo[0].equalsIgnoreCase("") && !arreglo[1].equalsIgnoreCase("")) {
                System.out.println("\"" + arreglo[0] + "\" " + " + " + pregunta + " + \"" + arreglo[1] + "\"");
            } 
             
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        Interfaz nuevo = new Interfaz();
        nuevo.show();
    }

}
