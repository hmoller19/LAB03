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
    

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
      
        try {
            RandomGen miRandomGen = new RandomGen();
            BufferedWriter out = new BufferedWriter(new FileWriter("archivoRandom.txt"));
            
            
            for(int count=1; count <=5; ++count ){
                //System.out.println("NÚMERO ENTERO 0-100: "+ miRandomGen.generator());
                out.write("" +miRandomGen.generator()+"\n");
                out.newLine();
            }
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(RandomMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
