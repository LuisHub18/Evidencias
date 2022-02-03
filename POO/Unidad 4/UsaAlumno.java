//Autor: Eduardo Téllez.
import java.util.*;
public class UsaAlumno {
    public static void main(String [] args){
        ArrayList<PersonaEjercicios>  listaPersona = new ArrayList<PersonaEjercicios>();
        ArrayList<Alumno>   listaAlumno = new ArrayList<Alumno>();  
        System.out.println("------MENU------\n a)Persona\n b)Alumno\n----------------");
        boolean ejecutar=true;
        String nombres,apellidos,nacimiento;
        int dia,mes,año,numeroControl;
        char respuesta,sexo,grupo;
        //Probando para demostrar usos
        do{
            System.out.println("Que desea probar?");
            respuesta=Keyboard.readChar();
            respuesta=Character.toLowerCase(respuesta);
              //Leer nombre
              System.out.print("Nombre: ");
              nombres=Keyboard.readString().toUpperCase();
              //Leer el apellido
              System.out.print("Apellido: ");
              apellidos=Keyboard.readString().toUpperCase();
              //Leer el sexo
              do{
              System.out.print("Sexo:");
              sexo=Keyboard.readChar();
              sexo=Character.toUpperCase(sexo);
                          switch (sexo){
                          case 'M':break;
                          case 'F':break;
                          default:
                                  System.out.println("Respuesta Incorrecta!!Solo M,F");
                          }
              }while(!(sexo=='M'|| sexo=='F'));
              //Leer el nacimiento
              System.out.println("<------Fecha de Nacimiento------>");
              do{
                  System.out.print("Dia: ");
                  dia=Keyboard.readInt();
                  if(dia<0 || dia>31)System.out.println("Valor Incorrecto!");
              }while(dia<0 || dia>31);
              do{
                  System.out.print("Mes: ");
                  mes=Keyboard.readInt();
                  if(mes<0 || mes>12)System.out.println("Valor Incorrecto!");
              }while(mes<0 || mes>12);
              do{
                  System.out.print("Año: ");
                  año=Keyboard.readInt();
                  if(año<1900 || año>2021)System.out.println("Valor Incorrecto!");
              }while(año<1900 || año>2021);
              nacimiento=dia+"/"+mes+"/"+año;
            switch(respuesta){
                case 'a':
                         //Probando atributos y metodos de persona
                            System.out.println("---------------------------------AÑADIENDO LOS OBJETOS--------------------------------");
                            listaPersona.add(new PersonaEjercicios(nombres,apellidos,sexo,nacimiento));//Uso de constructor con parametros
                            System.out.println("<---------->");
                            listaPersona.add(new PersonaEjercicios());//Uso de constructor sin parametros
                            System.out.println("----------------------------LISTA DE AÑADIDOS POR SEPARADO----------------------------");
                            for(int i=0;i<listaPersona.size();i++){
                                System.out.println(listaPersona.get(i));
                            }
                            System.out.println("---------------------------------LISTA DE AÑADIDOS------------------------------------");
                            System.out.println(listaPersona);//Metodo toString()
                            //Accediendo a los datos de las personas mediante sus variables
                            System.out.println("------------------------------ACCEDIENDO A SUS DATOS----------------------------------");
                            System.out.println(listaPersona.get(0).nombre);
                            System.out.println(listaPersona.get(0).apellido);
                            System.out.println(listaPersona.get(0).sexo);
                            //System.out.println(listaPersona.get(0).nacimiento); 
                            //Como nacimiento es privado solamente se puede acceder mediante su metodo getNacimiento()
                            System.out.println(listaPersona.get(0).getNacimiento());
                            System.out.println("Cantidad de objetos: "+listaPersona.size());
                    break; 
                case 'b':
                            System.out.print("Numero de control:");
                            numeroControl=Keyboard.readInt();
                            System.out.print("Grupo:");
                            grupo=Keyboard.readChar();
                            System.out.println("---------------------------------AÑADIENDO LOS OBJETOS--------------------------------");
                            listaAlumno.add(new Alumno(nombres,apellidos,sexo,nacimiento,numeroControl,grupo));//Uso de constructor con parametros
                            System.out.println("<---------->");
                            listaAlumno.add(new Alumno());//Uso de constructor sin parametros
                            System.out.println("----------------------------LISTA DE AÑADIDOS POR SEPARADO----------------------------");
                            for(int i=0;i<listaAlumno.size();i++){
                                System.out.println(listaAlumno.get(i));
                            }
                            System.out.println("---------------------------------LISTA DE AÑADIDOS------------------------------------");
                            System.out.println(listaAlumno);//Metodo toString()
                            //Accediendo a los datos de los alumnos mediante sus variables y metodos
                            System.out.println("------------------------------ACCEDIENDO A SUS DATOS----------------------------------");
                            System.out.println(listaAlumno.get(0).nombre);
                            System.out.println(listaAlumno.get(0).apellido);
                            System.out.println(listaAlumno.get(0).sexo);
                            System.out.println(listaAlumno.get(0).grupo);
                            //System.out.println(listaAlumno.get(0).numeroControl)
                            //Como numero de control es privado solo se puede acceder mediante su metodo getNumeroControl()
                            System.out.println(listaAlumno.get(0).getNumeroControl());
                            //System.out.println(listaAlumno.get(0).nacimiento); 
                            //Como nacimiento es privado solamente se puede acceder mediante su metodo getNacimiento()
                            System.out.println(listaAlumno.get(0).getNacimiento());
                            System.out.println("Cantidad de objetos: "+listaAlumno.size());
                            listaAlumno.add(new Alumno());
                            System.out.println(listaAlumno.get(0).getNombre());
                            System.out.println(listaAlumno);    
                            System.out.println("Cantidad de objetos: "+listaAlumno.size());
                    break;
                default:
                        System.out.println("Hasta luego!");
                        ejecutar=false;
        }
        }while(ejecutar);
        
    }
    

}
