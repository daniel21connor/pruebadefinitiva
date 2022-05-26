
package solesunaprueba;


public class NewClass1 extends NewClass2{
     protected String [] vectorNombreCurso;
    protected String [] vectorCodigoCurso; 
    private int indiceVector;
    
    NewClass1(){
    
    vectorNombreCurso=new String [100];
    vectorCodigoCurso=new String[100];
    indiceVector=0;
    }
    
    
     public void registroCurso(String tipo ){
        indiceVector= indiceVector+1;
        vectorNombreCurso[indiceVector]=     " * " +" curso-> "+ tipo;
        
     }
     
     public void registroCodigoCurso(String tipo ){
        indiceVector= indiceVector+1;
        vectorCodigoCurso[indiceVector]=     " * " +" Codigo del Curso--> "+ tipo;
     }
}
