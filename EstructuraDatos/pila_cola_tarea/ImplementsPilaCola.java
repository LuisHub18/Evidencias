package pila_cola_tarea;
/*
                                                                               IMPLEMENTACION DE LA CLASE PILA Y COLA
                                                                            |-------------------------------------------|
                                                                            |				Integrantes			        |
                                                                            |-------------------------------------------|
                                                                            |-Angulo Lopez Jose Alberto                 |
                                                                            |-------------------------------------------|
                                                                            |-Cristofer Jahir Bohorquez Espinoza        |
                                                                            |-------------------------------------------|
                                                                            |-Esmeralda Gadalupe Montoya Gastelum       |
                                                                            |-------------------------------------------|
                                                                            |-Eduardo Tellez Quiñonez                   |                   
                                                                            |-------------------------------------------|
                                                                            |-Jesus Elias Grande Orozco                 |                   
                                                                            |-------------------------------------------|
*/
public class ImplementsPilaCola {
    public static void main(String[] args) {
        int opcion=0,seguir=1;
        System.out.println("-------------------Implementacion de Pila Y Cola-------------------\n1.-Probar Pila\n2.-Probar Cola");
        do{
            do{
                System.out.print("¿Cuál desea probar?");
                opcion=Keyboard.readInt();
                if(!(opcion==1 || opcion==2)) System.out.println("#ValorIncorrecto");
            }while(!(opcion==1 || opcion==2));
            switch (opcion) {
                case 1:
                    usarPila();
                    break;
                case 2:
                    usarCola();
                    break;  
                default:     
            }
            System.out.print("Continuar.....(Cualquier numero excepto 0)=");
            seguir=Keyboard.readInt();
        }while(seguir!=0);
        System.out.println("-------------------------Fin del programa-------------------------");
    }
    //Implementando la clase Pila
    public static void usarPila(){
        Pila<Integer> datos=new Pila<Integer>();
        int eleccion=0;
        System.out.println("------------------------USO DE LA CLASE PILA------------------------");
        do{
			System.out.println("Opciones: " + "\n" +
							   "1.- Insertar elemento" + "\n" +
							   "2.- Retirar elemento" + "\n" +
							   "3.- Mostrar Pila" + "\n" +
							   "4.- Finalizar ");
			eleccion = Keyboard.readInt();
			System.out.println();
			switch(eleccion){
				case 1:
                    System.out.println("---------------------Añadir elementos a la Pila---------------------");
                    System.out.println("Pila llena= "+ datos.llena());
                    System.out.println("Pila vacia= "+ datos.vacia());
                    System.out.print("Ingrese el dato:");
                    int dato=Keyboard.readInt();
                    datos.add(dato);
					System.out.println();
					break;
				case 2:
                    System.out.println("-------------------------Retirar Elementos-------------------------");
                    datos.remove();
                    datos.mostrar();  
					break;
				case 3:
                    System.out.println("--------------------Mostrar elementos de la Pila--------------------");
                    System.out.println("Pila llena= "+ datos.llena());
                    System.out.println("Pila vacia= "+ datos.vacia());
                    datos.mostrar();
					System.out.println();
					break;
				case 4:
					System.out.println();
					break;
				default:
					System.out.println("Valor invalido");
					System.out.println();
			}
		}while(eleccion != 4);       
    }
    //Permite ingresar datos en la cola
	public static void insertarDato(Cola<Integer> c){
		int dato;
		System.out.print("Ingrese el dato:");
		dato = Keyboard.readInt();
		c.insertar(dato);
	}
    //Implementando la clase Cola
    public static void usarCola(){
        Cola<Integer> c=new Cola<Integer>();
        int eleccion;
                    System.out.println("------------------------USO DE LA CLASE COLA------------------------");
		do{
			System.out.println("Opciones: " + "\n" +
							   "1.- Insertar elemento" + "\n" +
							   "2.- Retirar elemento" + "\n" +
							   "3.- Mostrar cola" + "\n" +
							   "4.- Finalizar ");
			eleccion = Keyboard.readInt();
			System.out.println();
			switch(eleccion){
				case 1:
                    System.out.println("---------------------Añadir elementos a la Cola---------------------");
                    System.out.println("Cola llena= "+ c.Llena());
                    System.out.println("Cola vacia= "+ c.Vacia());
					insertarDato(c);
					System.out.println();
					break;
				case 2:
                    System.out.println("-------------------------Retirar Elementos-------------------------");
					c.retirar();
					break;
				case 3:
                    System.out.println("--------------------Mostrar elementos de la Cola--------------------");
					c.mostrar();
					System.out.println();
					break;
				case 4:
					System.out.println();
					break;
				default:
					System.out.println("Valor invalido");
					System.out.println();
			}
		}while(eleccion != 4);
    }
}
