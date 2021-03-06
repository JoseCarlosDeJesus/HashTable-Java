package arrayList;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Reflexao {
	public static void exibirDadosDosAtributos(Class<?> c) {
		System.out.println("Exibindo lista de atributos, exceto os herdados");
		for(Field f : c.getDeclaredFields()){
		System.out.println(f.getName());
		}
		System.out.println("Exibindo lista de atributos, exceto os privados");
		for(Field f : c.getFields()){
		System.out.println(f.getName());
		}
	}
	
	public static void exibirDadosDosMetodos(Class<?> c) {
		System.out.println("Exibindo lista de m?todos , exceto os herdados");
		for(Method m : c.getDeclaredMethods()){
		System.out.println(m.getName());
		}
		System.out.println("Exibindo lista de m?todos, exceto os privados");
		for(Method m : c.getMethods()){
		System.out.println(m.getName());
		}
	}
	
	public static void capturaMembro(Class<?> classe, String tipoMembro){
		System.out.println("Classe: "+classe.getName());
		Package p = classe.getPackage();
		String pacote = p != null ? p.getName():"Classe n?o tem pacote";
		System.out.println("Pacote: "+pacote);
		
		switch (tipoMembro) {
		case "ATRIBUTO": exibirDadosDosAtributos(classe);
		break;
		case "METODO": exibirDadosDosMetodos(classe);
		break;
		default: System.out.println("Nada escolhido");
		}
		
	}
	


}
