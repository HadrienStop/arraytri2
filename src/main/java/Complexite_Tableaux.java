
/**
 *  Complexite_Tableaux.java
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;



public class Complexite_Tableaux
{
    public static void main(String[] args) throws IOException {
 
     SelectionSortedArrayWithCounting tab = new SelectionSortedArrayWithCounting();
     
     tab.fillwithRandom(40,20);

     Writer file = new FileWriter("triInsertion.dat");

     tab.SelectionSorting();

     for(int i = 0 ; i < tab.length() ; i++) {
       file.write("" + String.valueOf(tab.getreadCount()) + " " + String.valueOf(tab.getwriteCount()) + " " + String.valueOf(tab.getlessCount()) + "\n");
     }
     file.close();

     System.out.println(tab.toString());
     
     System.out.println("nombre de lectures : "
           +String.valueOf(tab.getreadCount()));
     
     System.out.println("nombre d'écritures : "
           +String.valueOf(tab.getwriteCount()));
           
     System.out.println("nombre de comparaisons : "
           +String.valueOf(tab.getlessCount()));         
    }
}
    
    
    
   
