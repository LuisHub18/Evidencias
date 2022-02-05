package lista_ordenada;
/*
                                                                                Implementacion de clase Lista Ordenada
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
public class ImplementacionListaO{
    static ListaOrdenada lista= new ListaOrdenada();
    public static void main(String[] args) {
        int seguir=0,opcion=0;
        lista.insertar((int)(Math.random()*100)+50, "Juan", 19, 'M', (int)(Math.random()*50)+50);
        lista.insertar((int)(Math.random()*100)+50, "Maria", 19, 'F', (int)(Math.random()*50)+50);
        System.out.println("-------------------IMPLEMENTACION DE LA CLASE LISTA ORDENADA-------------------");
        System.out.println("1.-Probar Insertar\n2.-Probar Buscar\n3.-Probar Remover\n4.-Probar Mostrar");
        do{
            do{
                System.out.print("¿Cuál desea probar?");
                opcion=Keyboard.readInt();
                if(!(opcion==1 || opcion==2 || opcion==3 ||opcion==4)) System.out.println("#ValorIncorrecto");
            }while(!(opcion==1 || opcion==2 || opcion==3 ||opcion==4));
            switch (opcion) {
                case 1:
                    probarInsertar();
                    break;
                case 2:
                    probarBuscar();
                    break;
                case 3:
                    probarRemover();
                    break;
                case 4:
                    probarMostrar();
                    break;
                default:
                    break;
            }
            System.out.print("Continuar.....(Cualquier numero excepto 0)=");
            seguir=Keyboard.readInt();
        }while(seguir!=0);
        System.out.println("-------------------------Fin del programa-------------------------");
    }
    //Prueba del método insertar de la clase lista ordenada
    public static void probarInsertar(){
        System.out.println("-------------------------Prueba del método insertar-------------------------");
        System.out.print("Cual sera la matricula del alumno?");
        int matricula=Keyboard.readInt();
        System.out.print("Cual es su nombre?");
        String nombre=Keyboard.readString();
        System.out.print("Cual es su edad?");
        int edad=Keyboard.readInt();
        System.out.print("Cual es su sexo?");
        char sexo=Keyboard.readChar();
        System.out.print("Cual es su calificacion?");
        int calificacion=Keyboard.readInt();
        lista.insertar(matricula, nombre, edad, sexo, calificacion);
        System.out.println();
    }
    //Prueba del metodo buscar de la clase lista ordenada
    public static void probarBuscar(){
        System.out.println("--------------------------Prueba del método buscar--------------------------");
        System.out.print("Cual es la matricula del alumno que desea buscar?");
        int matricula=Keyboard.readInt();
        lista.buscarPorMatricula(matricula);
        System.out.println();
    }
    //Prueba del metodo remover
    public static void probarRemover(){
        System.out.println("-------------------------Prueba del método remover-------------------------");
        System.out.print("Cual es la matricula del alumno que desea eliminar?");
        int matricula=Keyboard.readInt();
        lista.remover(matricula);
        lista.mostrar();
        System.out.println();
    }
    //Prueba del método mostrar
    public static void probarMostrar(){
        System.out.println("-------------------------Prueba del método mostrar-------------------------");
        lista.mostrar();
        System.out.println();
    }

}