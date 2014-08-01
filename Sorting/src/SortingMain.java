/*
 * SortingMain.java
 * Driver de Sorting. Lee números de un documento de texto llamado "archivoRandom.txt" y
 * los guarda en un array. 
 */


/**
 *
 * @author Héctor
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SortingMain {

    public static void main(String[] args) {
        
        System.out.println("Reading File from Java code");
    //Name of the file
    String fileName="archivoRandom.txt";
    
    //Generando una nueva lista.
    List<String> list = new ArrayList<String>();
  
    
    try{

    //Create object of FileReader
    FileReader inputFile = new FileReader(fileName);

    //Instantiate the BufferedReader Class
    BufferedReader bufferReader = new BufferedReader(inputFile);

    //Variable to hold the one line data
    String line;

    // Read file line by line and print on the console
    while ((line = bufferReader.readLine()) != null)   {
            System.out.println(line);
            
    //Además, el valor leído es agregado al arrayList.       
            list.add(line);
    }
    
    //Close the buffer reader
    bufferReader.close();
    }
    catch(Exception e){
            System.out.println("Error while reading file line by line:" 
            + e.getMessage());                      
    }
    System.out.println("El arreglo es: "+list);
    
    //Aplicando el sorting para ordenar el arreglo:

    
    
    }
    
}
