/*
                   Integrantes Del Equipo:
	-Lie Norzagaray Luis Carlos.
                     -Meza Rivera Pedro Luis.
                     -Téllez Quiñónez Luis Eduardo
	El proyecto consiste en crear un directorio telefónico utilizando un ArrayList para manipular objetos de
	tipo Persona.
	Los datos iniciales del directorio telefónico estarán almacenados en un arreglo, de donde se crearan los
	objetos para guardarlos en el ArrayList.
	La clase Persona tiene los siguientes atributos:
	– nombre (String)
	– apellido (String)
	– alias (String)
	– tipo de teléfono [oficina, casa, celular] (char)
	– clave país (2 dígitos)
	– número telefónico (10 dígitos)
	La clase DirectorioTelefónico, debe contener los atributos y métodos necesarios para manipular a los registros
	del directorio.
	El programa principal presentara un menú con operaciones para:
		a) imprimir todo el directorio (método toString() )
		b) imprimir (por tipo de teléfono)
		c) agregar una Persona
		d) buscar una Persona (nombre o alias)
		e) eliminar una Persona (nombre y apellido)
		f) consultar (por nombre o apellido o alias o teléfono)
		g) ordenar el directorio (puntos extras usando comparador)
		h) finalizar el programa
	
*/
import java.util.ArrayList;
import java.util.Collections; 
public class DirectorioTelefonicoP{
		public static void main(String[] args) {
		ArrayList<PersonaDi> directorio= new ArrayList<PersonaDi>();
		String [] nombre={"LUCIA","BERTHA","GUILLERMO","JOSE LUIS"};
		String [] apellido={"AVILA", "LOYA","SOTO","RICO"};
		String [] alias={"GORDA", "NINA", "MEMO", "PEPE"};
		char [] tipoTelefono={'O','C','I','I'};
		int  [] ladaPais={52,1,23,10};
		String [] numeroTelefono={"299 1235141","667 7131245","555 5123492","734 2349876"};
	    PersonaDi aux;
		int menu;
		String reg="";
		//Añadir los datos de las personas por default
		for(int i=0; i<nombre.length;i++){
			aux=new PersonaDi(nombre[i],apellido[i],alias[i],tipoTelefono[i],ladaPais[i],numeroTelefono[i]);
			directorio.add(aux);
		}
		do {
			System.out.println("--------------MENU----------------");
			System.out.println("1.- Imprimir todo el directorio.");
			System.out.println("2.- Imprimir por tipo de telefono.");
			System.out.println("3.- Agregar persona.");
			System.out.println("4.- Buscar persona por nombre o alias.");
			System.out.println("5.- Eliminar persona nombre y apellido.");
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
				agregarPersona(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
	            break;
			case 4:
				buscarPersona(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
				break;
			case 5:
				eliminarPersona(directorio);
				System.out.print("Desea regresar al menu?(Si/No)");
				reg=Keyboard.readString();
				break;
			case 6:
				consultarPersona(directorio);
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
		System.out.println("---------------------------------FIN DEL PROGRAMA-------------------------------------------");
	}
	//Metodo para Imprimir el directorio
 	public static void imprimirDirectorio( ArrayList<PersonaDi> a){
		 System.out.println("--------------------------------IMPRIMIR TODO EL DIRECTORIO--------------------------------");
		 System.out.println("NOMBRE\t\tAPELLIDO\t\tALIAS\t\tTIPO DE TELEFONO \tCLAVE PAIS\t\tNUMERO TELEFONICO");
		 for(int i=0;i<a.size();i++) System.out.println(a.get(i).toString());
		
	 }
	 //Metodo para Imprimir listado por tipo de telefono
	 public static void imprimirPorTelefono(ArrayList<PersonaDi> a){
		char c;
		System.out.println("-------------------------------IMPRIMIR POR TIPO DE TELEFONO-------------------------------");
		System.out.print("Tipo de Telefono(O,C,I)>>");
		c=Keyboard.readChar();
		c=Character.toUpperCase(c);
		System.out.println("NOMBRE\t\tAPELLIDO\t\tALIAS\t\tTIPO DE TELEFONO \tCLAVE PAIS\t\tNUMERO TELEFONICO");
		for(int i=0;i<a.size();i++)if(a.get(i).getTipoTel()==c) System.out.println(a.get(i).toString());
	 }
	 //Metodo para agregar una persona
	 public static void agregarPersona(ArrayList<PersonaDi> a){
		PersonaDi persona;
		String nombres, apellidos, aliasDir, numTel;
		int clave,digitos=0;
		boolean ejecutar=false;
		char tipo;
		System.out.println("---------------------------------AGREGAR UNA PERSONA------------------------------------------");
		System.out.print("Nombre: ");
		nombres=Keyboard.readString();
		System.out.print("Apellido: ");
		apellidos=Keyboard.readString();
		System.out.print("Alias: ");
		aliasDir=Keyboard.readString();
		//Validar tipo de telefono
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
			System.out.print("Numero de telefono: ");
			numTel=Keyboard.readString();
			for(int i=0;i<numTel.length();i++){
				if(Character.isDigit(numTel.charAt(i)))digitos++;
				if((numTel.charAt(i) >= 'a' && numTel.charAt(i) <= 'z') || (numTel.charAt(i) >= 'A' && numTel.charAt(i) <= 'Z'))ejecutar=true;
			}
			if(digitos>10 || ejecutar)System.out.println("Valor incorrecto!!!");
		}while(digitos>10 || ejecutar);
	    persona = new PersonaDi(nombres.toUpperCase(), apellidos.toUpperCase(), aliasDir.toUpperCase(),tipo,clave,numTel); 
		a.add(persona);
	 }
	 //Metodo para buscar una persona por nombre o alias
	 public static void buscarPersona(ArrayList<PersonaDi> a){
		 char respuesta;
		 String nombre="", alias="";
		 System.out.println("-----------------------------BUSCAR PERSONA POR NOMBRE O ALIAS-----------------------------");
		 do{
			//Preguntar tipo de busqueda
			System.out.print("La busqueda sera por Nombre o Alias (N o A)>>");
		    respuesta=Keyboard.readChar();
			respuesta=Character.toUpperCase(respuesta);
			switch(respuesta){
				case 'N':
					System.out.print("Cual es el nombre de la persona?");
					nombre=Keyboard.readString();
					nombre=nombre.toUpperCase();
					for(int i=0; i<a.size();i++){
						if(nombre.equals(a.get(i).getNombre()))System.out.println(a.get(i).toString());	
						else System.out.print(".");
					}
					break;
				case 'A':
					System.out.print("Cual es el alias de la persona?");
					alias=Keyboard.readString();
					alias=alias.toUpperCase();
					for(int i=0; i<a.size();i++){
						if(alias.equals(a.get(i).getAlias()))System.out.println(a.get(i).toString());
						else System.out.print(".");
					}
					break;
				default:
					System.out.println("Valor Incorrecto!!Solo N/A");
			}	
		 }while(!(respuesta=='N' || respuesta=='A'));
	 }
	 //Metodo para eliminar una persona
	 public static void eliminarPersona(ArrayList<PersonaDi> a){
		char respuesta;
		String nombre, alias;
		int numero;
		 System.out.println("-----------------------------ELIMINAR PERSONA POR NOMBRE O ALIAS-----------------------------");
		 do{
			System.out.print("La busqueda sera por Nombre o Alias (N o A)>>");
		    respuesta=Keyboard.readChar();
			respuesta=Character.toUpperCase(respuesta);
			switch(respuesta){
				case 'N':
					System.out.print("Cual es el nombre de la persona?");
					nombre=Keyboard.readString().toUpperCase();
					for(int i=0; i<a.size();i++){
						if(nombre.equals(a.get(i).getNombre())) {
							numero  = i;
							System.out.println("Se elimino a: "+ a.get(i).getNombre());
							a.remove(numero);
						}
						else System.out.print(".");
					}
					break;
				case 'A':
					System.out.print("Cual es el alias de la persona?");
					alias=Keyboard.readString().toUpperCase();
					for(int i=0; i<a.size();i++){
						if(alias.equals(a.get(i).getAlias())) {
							numero = i;
							System.out.println("Se elimino a: "+ a.get(i).getNombre());
							a.remove(numero);
						}
						else System.out.print(".");
					}
					break;
				
				default:
					System.out.println("Valor Incorrecto!!Solo N/A");
			}	
		 }while(!(respuesta == 'N' || respuesta == 'A'));
			
	}
	//Metodo para ordenar a las personas por nombre con un comparador
	 public static void ordenarComparador(ArrayList<PersonaDi> a) {
		System.out.println("--------------------------------ORDENAR EL DIRECTORIO--------------------------------------");
		Collections.sort(a);
		System.out.println("NOMBRE\t\tAPELLIDO\t\tALIAS\t\tTIPO DE TELEFONO \tCLAVE PAIS\t\tNUMERO TELEFONICO");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).toString());
		}
	}
	//Metodo para consultar personas por nombre, apellido, alias o telefono
	 public static void consultarPersona(ArrayList<PersonaDi> a){
		String resultado="";
		System.out.println("----------------------CONSULTAR POR NOMBRE, APELLIDO, ALIAS O TELEFONO----------------------");
		System.out.print("Dame una dato de la persona: ");
		resultado=Keyboard.readString();
		resultado=resultado.toUpperCase();
		for(int i=0;i<a.size();i++){
			if(resultado.equals(a.get(i).getApellido()))System.out.println("Se encontro en Apellido\n"+a.get(i).toString());
		}
		for(int i=0;i<a.size();i++){
			if(resultado.equals(a.get(i).getAlias()))System.out.println("Se encontro en Alias\n"+a.get(i).toString());
		}
		for(int i=0;i<a.size();i++){
			if(resultado.equals(a.get(i).getNumeroTel()))System.out.println("Se encontro en Numero de Telefono\n"+a.get(i).toString());
		}
		for(int i=0;i<a.size();i++){
			if(resultado.equals(a.get(i).getNombre()))System.out.println("Se encontro en \n"+a.get(i).toString());
		}
	}

}

