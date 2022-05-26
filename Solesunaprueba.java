
package solesunaprueba;
import java.util.Scanner;

public class Solesunaprueba {
 static  Scanner scanner=new Scanner (System.in);
    public static void main(String[] args) {
        NewClass hola=new NewClass();
    int opcion  = 0;
  do{
        System.out.print("\n Bienvenidos a las calculadoras:");
           System.out.println();
           System.out.println("1" + " metodo vectores y matriz");
            System.out.println("2" + " metodo tabla");
                 opcion = scanner.nextInt();
       switch(opcion){
               
         case 1 -> { 
            System.out.println("ingrese el codigo");
           String codigo=scanner.next();
           System.out.println("-----------------");
           System.out.println("ingrese el nombre");
           String nombre=scanner.next();
           System.out.println("-----------------");
           System.out.println("ingrese el alias");
           String alias=scanner.next();
           System.out.println("-----------------");
           System.out.println("ingrese el correo");
            String correo=scanner.next();
            System.out.println("-----------------");
            System.out.println("ingrese el telfono");
            int telfono=scanner.nextInt();
            System.out.println("-----------------");
            System.out.println("ingrese el nombre del curso");
            String curso=scanner.next();
            System.out.println("-----------------");
            System.out.println("ingrese el codigo del Curso");
            String codigoCurso=scanner.next();
            System.out.println("-----------------");
             System.out.println("ingrese el codigo del grado");
            String codigoGrado=scanner.next();
            System.out.println("-----------------");
             System.out.println("descrpcion del grado");
            String grado=scanner.next();
            System.out.println("-----------------");
           hola.registrocodigo(codigo);
           hola.registrarnombre(nombre);
           hola.registraralias(alias);
           hola.registrocorreo(correo);
           hola.registrotelefono(telfono);
           hola.registroCurso(curso);
           hola.registroCodigoCurso(codigoCurso);
            hola.registrogradoo(codigoGrado);
            hola.registro(grado);
               }
          
         case 2 -> {
             System.out.println("lista de alumnos ");
          hola.mostrarcodigo();   
          hola.mostrarnombre();
          hola.mostraralias();
          hola.mostrarcorreo();
         hola.mostrarTransacciones();
         hola.mostrarcurso();
         hola.mostrarcursocodigo();
         hola.mostrarCodigoGrado();
         hola.mostrarDes();
          
               }
            
            
            
            
    }
    
}while (opcion !=2);
  }
}
