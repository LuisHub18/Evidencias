package ejercicio2;
	/*																		
	 Escribe un programa en java, en el cual construyes una cola, 
	 he inserta 5 elementos de tipo entero, y construye un m�todo 
	 que reciba la cola ya con la informaci�n y en el m�todo invierte 
	 el contenido de la cola, el m�todo debe de retornar la cola con 
	 la informaci�n invertida. Se puede utilizar estructuras de datos 
	 auxiliares si es necesario.
	*/
public class ImpCola {
	    public static void main(String[] args) {
	        int x;
	        Cola<Integer> c = new Cola<Integer>();
	        System.out.println("Bienvenido");
	        do{
	           System.out.println("�Que desea hacer?"
	                       +"\n1.- Ingresar datos en la cola"
	                       +"\n2.- Mostrar los resultados normales"
	                       +"\n3.- Mostrar resultados invertidos"
	                       +"\n4.- Finalizar");
	            x=Keyboard.readInt();
	            switch(x){
	                case 1:{
	                    Agregar(c);
	                    break;
	                }
	                case 2:{
	                    Mostrar(c);
	                    break;
	                }
	                case 3:{
	                	MostrarInverso(c);
	                	break;
	                }
	                case 4:{
	                	System.out.println("	     Proceso Finalizado"
	                	+"\n|-------------------------------------------|"
	                	+"\n|		Integrantes                 |"
                        +"\n|-------------------------------------------|"
                        +"\n|-Angulo Lopez Jose Alberto                 |"
                        +"\n|-------------------------------------------|"
                        +"\n|-Cristofer Jahir Bohorquez Espinoza        |"
                        +"\n|-------------------------------------------|"
                        +"\n|-Esmeralda Gadalupe Montoya Gastelum       |"
                        +"\n|-------------------------------------------|"
                        +"\n|-Eduardo Tellez Qui�onez                   |"                  
                        +"\n|-------------------------------------------|"
                        +"\n|-Jesus Elias Grande Orozco                 |"                   
                        +"\n|-------------------------------------------|");
	                	break;
	                }
	                default:{
	                    System.out.println("Entre 1 y 2");
	                }
	            } 
	        }while(x != 4);

	    }
	    public static void Agregar(Cola<Integer> c){
	        for(int i=0; i<5; i++){
	            int dato;
	            System.out.println("Ingrese dato:");
	            dato = Keyboard.readInt();
	            c.Inserta(dato);
	        }
	    }
	    public static void Mostrar(Cola<Integer> c){
	        c.mostrar();
	    }
	    
	    public static void MostrarInverso(Cola<Integer> c) {
	    	c.mostrarInverso();
	    }
	}
