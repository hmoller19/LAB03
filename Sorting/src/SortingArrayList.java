
import java.util.ArrayList;
import java.util.Vector;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor
 */
public class SortingArrayList implements Comparable<Object> {

    protected ArrayList<Object> organizedList;
    private String value; 
    
    //Constructor
    public SortingArrayList(String val1){
    //organizedList = new ArrayList<Object>(0);
    value=val1; 
    }
    
    public boolean equals (Object o){
        return (value.equals(((SortingArrayList)o).getValue()));
        
    }
    
    //No logro que funcione el compareTo
      @Override
    public int compareTo(Object o) {
       int result;
       
       String otherValue = ((SortingArrayList)o).getValue();
       
           result = value.compareTo(otherValue); 
       return result;
    }
  


    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    private void setValue(String value) {
        this.value = value;
    }
    
    
    
}
