package arrayList;

public class Teste {
     public static void main(String []args) throws ClassNotFoundException{
    	 Reflexao.capturaMembro(Class.forName("arrayList.Pessoa"),"ATRIBUTO");
    	 Reflexao.capturaMembro(Class.forName("arrayList.Pessoa"),"METODO");
     }
}
