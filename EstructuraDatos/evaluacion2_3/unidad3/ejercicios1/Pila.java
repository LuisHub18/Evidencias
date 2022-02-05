package ejercicios1;
public class Pila {
    private Nodo inicio;
    private int tamaño;
 
    public Pila(){
        inicio = null;
        tamaño = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTamaño(){
        return tamaño;
    }
   
    public void apilar(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamaño++;
    } 
   
    public void retirar(){
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            tamaño--;
        }
    }

    public int cima() throws Exception{
        if(!esVacia()){
            return inicio.getValor();
        }else{
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    
    public boolean buscar(int referencia){
        Nodo aux = inicio;
        boolean existe = false;
        while(existe != true && aux != null){
            if (referencia == aux.getValor()) {
                existe = true;
            }else{
                aux = aux.getSiguiente();
            }
        }
        return existe;
    }

    public void remover(int referencia){
        if (buscar(referencia)) {
            Nodo pilaAux = null;
            while(referencia != inicio.getValor()){
                Nodo temp = new Nodo();
                temp.setValor(inicio.getValor());
                if(pilaAux == null){
                    pilaAux = temp;
                }else{
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                retirar();
            }
            retirar();
            while(pilaAux != null){
                apilar(pilaAux.getValor());
                pilaAux = pilaAux.getSiguiente();
            }
            pilaAux = null;
        }
    }    
 
    public void editar(int referencia, int valor){
        while (buscar(referencia)) {
            Nodo pilaAux = null;
            while(referencia != inicio.getValor()){
                Nodo temp = new Nodo();
                temp.setValor(inicio.getValor());
                if(pilaAux == null){
                    pilaAux = temp;
                }else{
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                retirar();
            }
     
            inicio.setValor(valor);

            while(pilaAux != null){
                apilar(pilaAux.getValor());
                pilaAux = pilaAux.getSiguiente();
            }
            pilaAux = null;
        }
    }
   
    public void eliminar(){
        inicio = null;
        tamaño = 0;
    }
  
    public void listar(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.println(aux.getValor());
            aux = aux.getSiguiente();
        }
    }
}