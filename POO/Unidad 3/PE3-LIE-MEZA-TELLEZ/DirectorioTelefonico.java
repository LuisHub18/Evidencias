/*
                                                                    Programación Orientada a Objetos
                                                                            Unidad 3 HERENCIA
                                                                        Proyecto Agenda Telefónica
                                                                Maestro: Dra. María Lucía Barrón Estrada

                                                                        Integrantes Del Equipo:
                                                                -Lie Norzagaray Luis Carlos.
                                                                -Meza Rivera Pedro Luis.
                                                                -Téllez Quiñónez Luis Eduardo.

El proyecto consiste en crear un directorio telefónico utilizando un ArrayList para manipular objetos de tipo Contacto (hereda de Persona y contiene lista de Teléfono).
El directorio telefónico debe tener la información de tres o mas contactos inicialmente almacenados en un ArrayList.
La clase Persona tiene al menos los siguientes atributos:
– nombre (String)
– apellido (String)
– alias (String)
– sexo
– fecha nacimiento
La clase Telefono tiene al menos los siguientes atributos:
– tipo de teléfono [oficina, casa, celular] (char)
– clave país (2 dígitos)
– número telefónico (10 dígitos)
La clase Contacto debe heredar de Persona e incluir un ArrayList de Telefono, además de un atributo para correo electrónico.El DirectorioTelefónico, debe contener los 
atributos y métodos necesarios para manipular a los registros del directorio.

1. Imprimir todo el directorio (método toString() )
2. Imprimir listado (por tipo de teléfono)
3. Agregar un Contacto
4. Buscar un Contacto (nombre o alias)
5. Eliminar un Contacto (nombre y apellido)
6. Consultar (por nombre o apellido o alias o teléfono)
7. Ordenar el directorio (puntos extras usando comparador)
8. Finalizar el programa

*/
package Proyecto;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class DirectorioTelefonico {
    static ArrayList<Contacto> directorio= new ArrayList<Contacto>();
    static ArrayList<Telefono> telefonos= new ArrayList<Telefono>();
    public static void main(String [] args){
		String [] nombre={"LUIS","LUIS","LUIS"};
		String [] apellido={"TELLEZ","LIE","MEZA"};
		String [] alias={"SPIDERMAN","FLASH   ","DEADPOOL"};
        char [] sexo={'M','M','M'};
        String [] nacimiento={"28/07/2002","27/02/2002","04/12/2001"};
        String [] emails={"luistellez18@gmail.com","luislie18@gmail.com","luismeza19@gmail.com"};
        //Datos seran utilizados para el telefono
        char [] tipoTelefono={'C','I','C'};
        byte  [] clavePais={52,52,52};
        String [] numeroTelefono={"6671216676","6674962892","6675225769"};
        int menu;
		String reg="";
        //Añadir 3 contactos
        for(int i=0;i<nombre.length;i++){
            telefonos.add( new Telefono(tipoTelefono[i],clavePais[i],numeroTelefono[i]));
            directorio.add(new Contacto(nombre[i],apellido[i],alias[i],sexo[i],nacimiento[i],emails[i],telefonos));
        }
        //System.out.println(directorio);
        do {
			System.out.println("--------------MENU----------------");
			System.out.println("1.- Imprimir todo el directorio.");
			System.out.println("2.- Imprimir listado (por tipo de telefono)");
			System.out.println("3.- Agregar contacto.");
			System.out.println("4.- Buscar contacto por nombre o alias.");
			System.out.println("5.- Eliminar contacto (nombre y apellido)");
			System.out.println("6.- Consultar por nombre, apellido, alias o telefono.");
			System.out.println("7.- Ordenar el directorio.");
			System.out.println("8.- Salir");
			System.out.print(">>>>>");
			menu=Keyboard.readInt();
			switch (menu){
			case 1:
				imprimirDirectorio(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
				break;
			case 2:
				imprimirPorTelefono(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
				break;
			case 3:
				agregarContacto(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
	            break;
			case 4:
				buscarContacto(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
				break;
			case 5:
				eliminarContacto(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
				break;
			case 6:
				consultarContacto(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
				break;
			case 7:
				ordenarComparador(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
				break;
			default:
				reg="NO";
			}
		} while (!reg.equalsIgnoreCase("No"));
		System.out.println("----------------------------------------------------------------FIN DEL PROGRAMA----------------------------------------------------------------");
	}
    //Metodo que usaremos para validar el email del contacto TELLEZ
    public static boolean validarEmail(String a){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(a);
        return mather.find();
    }
    //Metodo para Imprimir el directorio PEDRO
 	public static void imprimirDirectorio( ArrayList<Contacto> a){
        System.out.println("-------------------------------------------------------------------------IMPRIMIR TODO EL DIRECTORIO-------------------------------------------------------------------------");
        System.out.println("NOMBRE\t\tAPELLIDO\t\tSEXO\tFECHA DE NACIMIENTO\tALIAS\t\tEMAIL\t\t\tTELEFONOS");
        for(int i=0;i<a.size();i++) System.out.println(a.get(i).toString());
    }
    //Metodo para Imprimir listado por tipo de telefono TELLEZ
    public static void imprimirPorTelefono(ArrayList<Contacto> a){
       char c;
       System.out.println("--------------------------------------------------------------------IMPRIMIR LISTADO POR TIPO DE TELEFONO-------------------------------------------------------------------");
       System.out.print("Tipo de Telefono(O,C,I)>>");
       c=Keyboard.readChar();
       c=Character.toUpperCase(c);
       System.out.println("NOMBRE\t\tAPELLIDO\t\tSEXO\tFECHA DE NACIMIENTO\tALIAS\t\tEMAIL\t\t\tTELEFONOS");
       for(int i=0;i<a.size();i++)for(int j=0;j<a.get(i).telefonos.size();j++){  
            if(a.get(i).telefonos.get(j).getTipoTelefono()==c)System.out.println(a.get(i).toString(j));
       }
    }
    //Metodo para agregar un contacto LIE
    public static void agregarContacto(ArrayList<Contacto> a){
       String nombres, apellidos, alias, numTel,nacimiento,email;
       int clave,digitos=0,dia,mes,año,cantidadNumero;
       boolean ejecutar=false;
       ArrayList<Telefono> susTelefonos=new ArrayList<Telefono>();
       char tipo,sexo;
       System.out.println("-----------------------------------------------------------------------------AGREGAR UN CONTACTO-------------------------------------------------------------------------");
       //Leer nombre
       System.out.print("Nombre: ");
       nombres=Keyboard.readString();
       nombres=nombres.toUpperCase();
       //Leer el apellido
       System.out.print("Apellido: ");
       apellidos=Keyboard.readString();
       apellidos=apellidos.toUpperCase();
       //Leer el alias
       System.out.print("Alias: ");
       alias=Keyboard.readString();
       alias=alias.toUpperCase();
       //Validar el sexo del contacto
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
        //Leer la fecha de nacimiento
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
        //Añadir email de contacto TELLEZ
        do{
            System.out.print("Cual es el email del contacto?");
            email=Keyboard.readString();
            if(validarEmail(email)==false){ 
                System.out.println("Email invalido!");
            }
        }while(validarEmail(email)==false);
       //Añadir el numero o los numeros que tiene el contacto
       //Validar tipo de telefono
       System.out.println("<------DATOS DE TELEFONO------>");
       System.out.print("Cuantos telefonos tiene el contacto?");
       cantidadNumero=Keyboard.readInt();
       for(int i=0;i<cantidadNumero;i++){
            do{
                System.out.print("Tipo de telefono: ");
                tipo=Keyboard.readChar();
                tipo=Character.toUpperCase(tipo);
                if(!(tipo=='O'||tipo=='C'||tipo=='I'))System.out.println("Valor Incorrecto!!O/C/I");
            }while(!(tipo=='O'||tipo=='C'||tipo=='I'));
            //Validar que la clave del pais solo tenga 2 digitos
            do{
                System.out.print("Clave del pais: ");
                clave=Keyboard.readInt();
                if(clave>99 || clave<0) System.out.println("Valor incorrecto");
            }while(clave>99 || clave<0);    
            //Validar numero de telefono solo tenga 10 digitos y que sean numeros
            do{
                digitos=0;
                System.out.print("Numero de telefono: ");
                numTel=Keyboard.readString();
                for(int j=0;j<numTel.length();j++){
                    if(Character.isDigit(numTel.charAt(i)))digitos++;
                    if((numTel.charAt(i) >= 'a' && numTel.charAt(i) <= 'z') || (numTel.charAt(i) >= 'A' && numTel.charAt(i) <= 'Z'))ejecutar=true;
                }
                if(digitos!=10 ||ejecutar)System.out.println("Valor incorrecto!!!");
            }while(digitos!=10|| ejecutar);
            susTelefonos.add(new Telefono(tipo,clave,numTel));
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
       }
            a.add(new Contacto(nombres, apellidos, alias,sexo,nacimiento,email,susTelefonos));
     }
    //Metodo para buscar un contacto por nombre o alias LIE
    public static void buscarContacto(ArrayList<Contacto> a){
        char respuesta;
        String nombre="", alias="";
        System.out.println("--------------------------------------------------------------------BUSCAR CONTACTO POR NOMBRE O ALIAS---------------------------------------------------------------------");
        do{
           //Preguntar tipo de busqueda
           System.out.print("La busqueda sera por Nombre o Alias (N o A)>>");
           respuesta=Keyboard.readChar();
           respuesta=Character.toUpperCase(respuesta);
           switch(respuesta){
               case 'N':
                   System.out.print("Cual es el nombre del contacto?");
                   nombre=Keyboard.readString().toUpperCase();
                   System.out.println("NOMBRE\t\tAPELLIDO\t\tSEXO\tFECHA DE NACIMIENTO\tALIAS\t\tEMAIL\t\t\tTELEFONOS");
                   for(int i=0; i<a.size();i++){    
                       if(nombre.equalsIgnoreCase(a.get(i).getNombre()))System.out.println(a.get(i).toString());	
                   }
                   break;
               case 'A':
                   System.out.print("Cual es el alias del contacto?");
                   alias=Keyboard.readString().toUpperCase();
                   System.out.println("NOMBRE\t\tAPELLIDO\t\tSEXO\tFECHA DE NACIMIENTO\tALIAS\t\tEMAIL\t\t\tTELEFONOS");
                   for(int i=0; i<a.size();i++){
                       if(alias.equalsIgnoreCase(a.get(i).getAlias())) System.out.println(a.get(i).toString());
                   }
                   break;
               default:
                   System.out.println("Valor Incorrecto!!Solo N/A");
           }	
        }while(!(respuesta=='N' || respuesta=='A'));
    }
    //Metodo para eliminar una persona PEDRO
    public static void eliminarContacto(ArrayList<Contacto> a){
       String nombre,apellido,alias;
       int encontrados=0;
       System.out.println("--------------------------------ELIMINAR CONTACTO POR NOMBRE Y APELLIDO--------------------------------");
       System.out.print("Cual es el nombre del contacto?");
       nombre=Keyboard.readString();
       System.out.print("Cual es el apellido del contacto?");
       apellido=Keyboard.readString();
       //Ciclo for para contar personas repetidas
       for(int i=0;i<a.size();i++){
            if(nombre.equalsIgnoreCase(a.get(i).getNombre()) && apellido.equalsIgnoreCase(a.get(i).getApellido())){
                encontrados++;
                System.out.println("NOMBRE\t\tAPELLIDO\t\tSEXO\tFECHA DE NACIMIENTO\tALIAS\t\tEMAIL\t\t\tTELEFONOS");
                System.out.println(a.get(i).toString());
            }
        }
       //Eliminar dependiendo de si hay repetidos o no
        for(int i=0;i<a.size();i++){
           if(encontrados==1){
                if(nombre.equalsIgnoreCase(a.get(i).getNombre()) && apellido.equalsIgnoreCase(a.get(i).getApellido())){
                    System.out.println("Se elimino a: "+ a.get(i).getNombre()+" "+a.get(i).getApellido());
                    a.remove(i);
                }
           }else if(encontrados>1){
                if(nombre.equalsIgnoreCase(a.get(i).getNombre()) && apellido.equalsIgnoreCase(a.get(i).getApellido())){
                    System.out.println("Se encontraron "+encontrados+" contactos\nCual es el alias del contacto que desea eliminar?");
                    alias=Keyboard.readString();
                    if(alias.equalsIgnoreCase(a.get(i).getAlias())){
                        System.out.println("Se elimino a: "+ a.get(i).getNombre()+" "+a.get(i).getApellido()+" "+a.get(i).getAlias());
                        a.remove(i);
                    }
                }
           }

        } 
   }
   //Metodo para ordenar a las personas por nombre con un comparador TELLEZ
    public static void ordenarComparador(ArrayList<Contacto> a) {
       System.out.println("-------------------------------------------------------------------------ORDENAR EL DIRECTORIO-------------------------------------------------------------------------");
       Collections.sort(a);
       System.out.println("NOMBRE\t\tAPELLIDO\t\tSEXO\tFECHA DE NACIMIENTO\tALIAS\t\tEMAIL\t\t\tTELEFONOS");
       for (int i = 0; i < a.size(); i++) {
           System.out.println(a.get(i).toString());
       }
   }
   //Metodo para consultar personas por nombre, apellido, alias o telefono PEDRO
    public static void consultarContacto(ArrayList<Contacto> a){
       String resultado="";
       System.out.println("----------------------------------------------------------------CONSULTAR POR NOMBRE, APELLIDO, ALIAS O TELEFONO----------------------------------------------------------------");
       System.out.print("Dame un dato del contacto: ");
       resultado=Keyboard.readString().toUpperCase();
       for(int i=0;i<a.size();i++){
           if(resultado.equals(a.get(i).getApellido()))System.out.println("Se encontro en Apellido\n"+a.get(i).toString());
           if(resultado.equals(a.get(i).getAlias()))System.out.println("Se encontro en Alias\n"+a.get(i).toString());
           if(resultado.equals(a.get(i).getNombre()))System.out.println("Se encontro en Nombre\n"+a.get(i).toString());
        }
       for(int i=0;i<a.size();i++)for(int j=0;j<a.get(i).telefonos.size();j++){  
            if(resultado.equals(a.get(i).telefonos.get(j).getNumeroTelefono()))System.out.println("Se encontro en numero de telefono\n"+a.get(i).toString(j));
       }
  }
}
