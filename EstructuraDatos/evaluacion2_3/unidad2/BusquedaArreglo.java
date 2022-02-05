package unidad2;
public class BusquedaArreglo{
    public static void main(String[] args) {
        //Arreglo
        int[] arreglo = {1,2,3,4,5,6,7,8,9};


        
        //Variables
        int elementoBuscado;
        int posicionElemento;
        
        //Entrada
        System.out.println("Arreglo = {1,2,3,4,5,6,7,8,9}" + "\n" +
                           "Ingresa el elemento que desea buscar:");
        elementoBuscado = Keyboard.readInt();

        //Se llama el metodo de busqueda
        posicionElemento = buscarElemento(arreglo, elementoBuscado, 0);

        //Salida
        if(posicionElemento != -1){
            System.out.println("Se encontro el elemento " + elementoBuscado + " en la posicion " + posicionElemento);
        }
        else{
            System.out.println("No se encontro el elemento " + elementoBuscado);
        }
    }

    //Recorrera el arreglo buscando elemento 
    public static int buscarElemento(int[] arreglo, int elementoBuscado, int posicion) {
        if(posicion == arreglo.length){ //Regresara un -1 si el elemento no se encuentra en el arreglo
            return -1;
        }
        else if(arreglo[posicion] == elementoBuscado){ //Regresara la posicion del elemento encontrado
            return posicion;
        }
        else{
            return buscarElemento(arreglo, elementoBuscado, posicion + 1); //Llamara al metodo de busqueda y aumentara el indice
        }
    }
}