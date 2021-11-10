package arrayList;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
public @interface AnnotationEndereco {
	   String logradouro();
	   String numero() default "S/N";
       String bairro();
       String cidade();
       String estado();
}
