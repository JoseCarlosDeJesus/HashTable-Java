package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCores {
     public static void main(String []args) {
    	    ArrayList<String> cores= new ArrayList();
    	    
    	    cores.add("Amarelo");
    	    cores.add("Vermelho");
    	    cores.add("Preto");
    	    cores.add("Azul");
    	    
    	    int i;
    	    int n=cores.size();
    	    for(i=0;i<n;i++) {
    	    	System.out.println(cores.get(i));
    	    }
    	    cores.add(0, "Verde");//adiciona no primeiro indice a cor verde
    	    cores.remove(2);//remove o terceiro elemento do ArrayList de Cores.
    	    
    	    ArrayList<String> coresCopia=new ArrayList();
    	    coresCopia.addAll(0, cores);
    	    
    	    System.out.println("ArrayList de Cores depois de adicionar e remover:");
    	    for(i=0;i<n;i++) {
    	    	System.out.println(cores.get(i));
    	    }
    	    
    	    System.out.println("Cores Copia:");
    	    for(i=0;i<n;i++) {
    	    	System.out.println(coresCopia.get(i));
    	    }
    	    
    	    System.out.println("Cores ordenadas: ");
    	    Collections.sort(cores);
    	    for(String s : cores) {
    			System.out.println(s);
    		}
    	   
     }
}
