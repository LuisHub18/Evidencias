//Autor: Eduardo Téllez.
import java.util.*;
public class UseAnimal {
    public static void main(String [] args){
        ArrayList<Animal> lista = new ArrayList<Animal>();
        String especie,nombre,raza,color;
        //Leer el numero de animales
        System.out.print("Cuantos animales seran?");
        int numero=Keyboard.readInt();
        //Leer animales
        for(int i=0;i<numero;i++){
        //Leemos especie para saber como lo añadiremos al ArrayList
            System.out.print("De que especie es el animal?");
            especie=Keyboard.readString();
            System.out.print("Cual es su nombre?");
            nombre=Keyboard.readString();
            //Leemos el nombre del perro
            if (especie.equalsIgnoreCase("PERRO")){
                System.out.print("De que color es?");
                color=Keyboard.readString();
                lista.add(new Perro(nombre,color));
                lista.get(i).printMensaje();
                /*
                lista.get(i).printSonido();
                No permite utilizar el metodo print sonido ya que en la lista hay objetos que son
                animales y printSonido() es para los perros, no para todos los animales.
                */
            //Leemos el nombre y raza del gato
            }else if(especie.equalsIgnoreCase("GATO")){
                System.out.print("Cual es su raza?");
                raza=Keyboard.readString();
                lista.add(new Gato(nombre,raza));
                lista.get(i).printMensaje();
            }else{
                lista.add(new Animal(especie,nombre));
            }
            System.out.println("---------------------------");
        }
        System.out.println(lista);
        //Permite utilizar los metodos toString de las diferentes animales ya que si existe en la clase animal
        //y le heredo a sus clases derivadas, a diferencia con el metodo printSonido() de la clase Perro.
    }
}
