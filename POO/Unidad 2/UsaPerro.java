/*
    Programa que permite registrar y ver los datos que requiera el usuario.
    Autor: Eduardo Téllez.
*/
import java.util.ArrayList;
public class UsaPerro {
    public static void main(String [] args){
            Perro perro;
            ArrayList<Perro> listaPerros = new ArrayList<Perro>();
            String nombre, raza, color;
            int cuentaBasset=0,cuentaBull=0,cuentaGolden=0,cuentaLabrador=0,cuentaPitbull=0,cuentaPastor=0;
            int edad, n,accion, perroMayor=0,posicionMayor=0;  
            double peso,perroPesado=0.0;
            char sexo, v;
            System.out.println("REGISTRAR PERROS DE UNA VETERINARIA");
            System.out.println("Razas disponibles: Pastor Aleman, Golden Retriever, Labrador, Pitbull, Basset Hound, Bulldog");
            System.out.println("Colores validos: Gris, Cafe, Blanco, Negro");
            System.out.println();
            do{ 
            System.out.println("------------------------------------------------------------------------");
            System.out.print("Cuantos perros seran registrados en el sistema?");
            n=Keyboard.readInt();
            //Comenzar a leer datos
            for(int i=0;i<n;i++){
                System.out.println("------------------------------------------------------------------------");
                System.out.println("PERRO #"+(i+1));
                //Leer nombre
                System.out.print("Cual es su nombre?");
                nombre=Keyboard.readString();
                nombre=nombre.toUpperCase();
                //Leer y validar sexo
                do{
                    System.out.print("Cual es su sexo?");
                    sexo=Keyboard.readChar();
                    sexo=Character.toUpperCase(sexo);
                    switch (sexo){
                    case 'M':break;
                    case 'H':break;
                    default:
                            System.out.println("Valor Incorrecto!!Solo M,H");
                    }
                }while(!(sexo=='M'|| sexo=='H'));
                //Leer y validar raza
                do{
                    System.out.print("Cual es su raza?");
                    raza=Keyboard.readString();
                    raza=raza.toUpperCase();
                    switch (raza){
                        case "PASTOR ALEMAN":break;
                        case "GOLDEN RETRIEVER":break;
                        case "LABRADOR":break;
                        case "PITBULL":break;
                        case "BASSET HOUND":break;
                        case "BULLDOG":break;
                        default:
                                System.out.println("Valor Incorrecto!!Solo razas disponibles");
                        }
                }while(!(raza.equals("PASTOR ALEMAN") || raza.equals("GOLDEN RETRIEVER")|| raza.equals("LABRADOR")|| raza.equals("PITBULL")|| raza.equals("BASSET HOUND")|| raza.equals("BULLDOG")));
                perro=new Perro(nombre,sexo,raza);
                listaPerros.add(perro);
            }//cierre del for

            //Añadir sexo, edad y peso con metodos set
            System.out.println("----------AÑADIR DATOS SEXO, EDAD, PESO------");
            for(int i=0;i<listaPerros.size();i++){
                //Leer y validar la edad del perro
               System.out.println( "------"+listaPerros.get(i).getNombre()+"-----");
                do{
                    System.out.print("Cual es su edad?");
                    edad=Keyboard.readInt();
                    if (edad<0 || edad>30){
                        System.out.println("Valor Incorrecto!! Solo edades reales");
                    }
                }while(edad<0 || edad>30);
                listaPerros.get(i).setEdad(edad);
                //Leer y validar color del perro
                do{
                    System.out.print("De que color es?");
                    color=Keyboard.readString();
                    color=color.toUpperCase();
                    switch (color){
                        case "GRIS":break;
                        case "NEGRO":break;
                        case "BLANCO":break;
                        case "CAFE":break;
                        default:
                                System.out.println("Valor Incorrecto!!Solo colores disponibles");
                        }
                }while(!(color.equals("GRIS")|| color.equals("NEGRO") || color.equals("BLANCO") ||color.equals("CAFE")));
                listaPerros.get(i).setColor(color);
                //Leer y validar el peso del perro
                do{
                        System.out.print("Cuanto pesa en Kilogramos? ");
                        peso=Keyboard.readDouble();
                        if(peso<0)System.out.println("Valor incorrecto!! Solo pesos reales");
                }while(peso<0);
                listaPerros.get(i).setPeso(peso);
            }//cierre ciclo for de metodos set
            System.out.print("Desea continuar añadir mas perros?(V o F)");
            v=Keyboard.readChar();
            v=Character.toUpperCase(v);
        }while(v=='V');
        //Mostrar los perros
        System.out.println("Lista De Perros \n" +listaPerros.toString());
        //Mostrar elementos que el usuario pida
        System.out.println("Fueron registrados #"+Perro.totalPerros+ " perros: \n Acciones Disponibles");
        System.out.println("1.-Ver perro con mayor edad");
        System.out.println("2.-Ver perro con mayor peso");
        System.out.println("3.-Ver cuantos perros hay de cada raza");
        System.out.println("4.-Ninguno");
        do{
            System.out.print("Cual dato desea ver?");
            accion=Keyboard.readInt();
            //Ver acciones por hacer
            if(accion<1 || accion>4) System.out.println("Valor incorrecto!! Solo acciones disponibles");
            else if(accion==1){
                for(int i=0;i<listaPerros.size();i++){
                    if (perroMayor<listaPerros.get(i).getEdad()) {
                        perroMayor=listaPerros.get(i).getEdad();
                        posicionMayor=i;
                    }
                }
                System.out.println("El perro de mayor edad es: "+listaPerros.get(posicionMayor).getNombre());
                System.out.println("--------------------------------------------");
            }
            else if(accion==2){
                for(int i=0;i<listaPerros.size();i++){
                    if (perroPesado<listaPerros.get(i).getPeso()) {
                        perroPesado=listaPerros.get(i).getPeso();
                        posicionMayor=i;
                    }
                }
                System.out.println("El perro de mayor peso es: "+listaPerros.get(posicionMayor).getNombre());
                System.out.println("--------------------------------------------");
            }
            else if(accion==3){
                for(int i=0;i<listaPerros.size();i++){
                    switch (listaPerros.get(i).getRaza()){
                        case "PASTOR ALEMAN": cuentaPastor++; break;
                        case "GOLDEN RETRIEVER": cuentaGolden++;break;
                        case "LABRADOR": cuentaLabrador++; break;
                        case "PITBULL":cuentaPitbull++; break;
                        case "BASSET HOUND":cuentaBasset++;break;
                        case "BULLDOG":cuentaBull++; break;
                    }
                }
                System.out.println("CANTIDAD DE PERROS DE CADA RAZA");
                System.out.println("Pastor aleman: "+ cuentaPastor+ "\nGolden Retriever: "+ cuentaGolden+"\nLabrador: "+
                cuentaLabrador+ "\nPitbull: "+cuentaPitbull+ "\nBasset Hound: "+cuentaBasset+ "\nBulldog "+cuentaBull);
                System.out.println("--------------------------------------------");
            }
        }while(accion!=4);
    }
}
