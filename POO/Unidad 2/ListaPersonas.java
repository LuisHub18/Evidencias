/*
    • Escribe un programa que lea de teclado
      los datos de 10 personas, crea objetos de
      tipo Persona y almacénalos en una lista
      (ArrayList).
    • Procesa los datos para obtener:
    – Total de mujeres
    – Total de adultos (mayores de 18 años)
    – Promedio de edad de todas las personas
    – Nombre de la persona mas joven
    – Total de adultos mayores (de 60 o mas años)
      Autor: Eduardo Téllez.
*/
import java.util.ArrayList;

public class ListaPersonas{
    public static void main (String[] args) {
        ArrayList<Persona> lista = new ArrayList<Persona>();
        Persona persona;
        String nombrePersona;
        int edadPersona,cantidadMujer=0, cantidadMayores=0,edadesP=0, personaJoven=200,posicionJoven=0,cantidadAdum=0;
        int numPersonas=0;
        double promedioEdad=0;     
        char sexoPersona;
        System.out.println("PERSONAS");     
        System.out.print("Cuantas personas seran?");
        numPersonas=Keyboard.readInt();
        for (int i=0;i<numPersonas;i++){
            //Validar el nombre de la persona
            System.out.println("PERSONA "+(i+1));
            System.out.print("Cual es su nombre?");
            nombrePersona=Keyboard.readString();
            //Validar el sexo de la persona
            do{
				System.out.print("Cual es su sexo?");
				sexoPersona=Keyboard.readChar();
				sexoPersona=Character.toUpperCase(sexoPersona);
				switch (sexoPersona){
				case 'M':break;
				case 'F':break;
				default:
						System.out.println("Respuesta Incorrecta!!Solo M,F");
				}
			}while(!(sexoPersona=='M'|| sexoPersona=='F'));
            //Validar la edad de la persona
            do{
				System.out.print("Cual es su edad?");
				edadPersona=Keyboard.readInt();
				if (edadPersona<0){
					System.out.println("Valor Incorrecto#");
				}
			}while(edadPersona<0);  
			persona =new Persona(nombrePersona,sexoPersona,edadPersona);
            lista.add(persona);
		}//cierre de lectura de datos
        //Imprimir la lista
        System.out.println(lista);
        //Total de mujeres
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getSexo()=='F')cantidadMujer++;
        }
        System.out.println("Total de mujeres: "+cantidadMujer);
        //Total de adultos 
        for(int i=0;i<lista.size();i++){
            if (lista.get(i).getEdad()>=18) cantidadMayores++;
        }
        System.out.println("Total de adultos: "+ cantidadMayores);
        //Total de adultos mayores
        for(int i=0;i<lista.size();i++){
            if (lista.get(i).getEdad()>=60) cantidadAdum++;
        }
        System.out.println("Total de adultos mayores: " +cantidadAdum);
        //Promedio de edad de las personas
        for(int i=0;i<lista.size();i++){
            edadesP+=lista.get(i).getEdad();
        }
        promedioEdad=edadesP/lista.size();
        System.out.println("Promedio de edades: "+ promedioEdad);
        //Nombre de la persona mas joven
        for(int i=0;i<lista.size();i++){
            if (personaJoven>lista.get(i).getEdad()) {
                personaJoven=lista.get(i).getEdad();
                posicionJoven=i;
            }
        }
        System.out.println("La persona mas joven es: "+lista.get(posicionJoven).getNombre());
        
        }//cierre de main
    }//class


