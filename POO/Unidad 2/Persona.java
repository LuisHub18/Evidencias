//Clase Persona
//Autor: Eduardo Tellez
public class Persona{
	private String nombre;
	private char sexo;
	private int edad;
  public Persona(){
    this("sin nombre",'v',0);
  }
  
  public Persona (String n, char s, int e){
	  nombre=n;
	  sexo=s;
	  edad=e;
   }
   
   //Metodo toString
   public String toString(){
   	return nombre+", "+sexo+", "+edad;

   }
   public String getNombre(){
     return nombre;
   }
   public int getEdad (){
   	return edad;
   }
   public char getSexo(){
    return sexo;
   }

}