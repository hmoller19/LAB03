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
    
    //Cambie el valor dentro de nextInt para establecer el rango de los números generados.
    //Por ejemplo si se desea un número de 0 a 10, value = randomNo.nextInt(10);
    value = randomNo.nextInt(1999);
    return value;
    }
   
}
