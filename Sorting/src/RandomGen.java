/*
 * RandomGen.java
 * Contiene el generador de números aleatorios.
 * 
 */

/**
 *
 * @author Héctor
 */
import java.util.*;

public class RandomGen {
    
    //Atributos.
    
    Random randomNo;
    private int value;

   //Constructor. 
    public RandomGen() {
        this.randomNo = new Random();
    }

    //Método generador de números aleatorios.
    public int generator(){
    value = randomNo.nextInt(100);
    return value;
    }
   
}
