/*
 * RandomMain.java
 * Driver de RandomGen. Genera números aleatorios enteros en el rango [0-2000]
 * y los imprime en un archivo de texto llamado "archivoRandom.txt".
 */

/**
 *
 * @author Héctor
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RandomMain {
    
    public static void main(String[] args) {
        
      
        try {
            RandomGen miRandomGen = new RandomGen();
            //Escribe todo en un archivo llamado "archivoRandom.txt". 
            BufferedWriter out = new BufferedWriter(new FileWriter("archivoRandom.txt"));
            
            
            //Cambiar condición del for para escoger la cantidad de números generados. 
            //Por ejemplo, si se desea generar 20 números, 
            // se usa for(int count=1; count <=20; ++count) <=
            for(int count = 1; count <= 10; ++count ){
                //System.out.println("NÚMERO ENTERO 0-100: "+ miRandomGen.generator());
                out.write(miRandomGen.generator()+"\n");
                out.newLine();
            }
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(RandomMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
