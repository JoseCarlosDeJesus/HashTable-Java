package arrayList;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashMap {
       public static void main(String[]args) {
    	      String hash=new String();
    	      Map<Integer, String> Hashmap = new Hashtable<>();
    	      Scanner escreveHash= new Scanner(System.in);
    	      System.out.println("Escreva algo: ");
    	      hash=escreveHash.next();
    	      Integer i;
    	      for(i=0;i<20;i++) {
    	    	  Hashmap.put(i, hash);
    	    	  System.out.println("Escreva algo: ");
        	      hash=escreveHash.next();
    	      }
    	      
    	      for(Integer cod : Hashmap.keySet()) {
    	    	  System.out.println("A chave "+cod +" "+ "Valor "+Hashmap.get(cod));
    		  }
    	      escreveHash.close();
    	      
    	      
       }
}
