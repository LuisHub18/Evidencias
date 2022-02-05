public class ArbolTest2 {
    //Atributs
    private NodoTest2 raiz;

    //Constructores
    public ArbolTest2(){

    }

    public ArbolTest2(int valor){
        this.raiz = new NodoTest2(valor);
    }

    public ArbolTest2(NodoTest2 raiz){
        this.raiz = raiz;
    }
    

    //Metodos
    //Insertar nodo
    public void InsertarABB(NodoTest2 nodo){
        this.InsertarABB(nodo, raiz);
    }

    private boolean InsertarABB(NodoTest2 nuevo, NodoTest2 nodo){
        if (nuevo.getValor() < nodo.getValor()){
            if(nodo.getHojaIzquierda() == null){
                nodo.setHojaIzquierda(nuevo);
                System.out.println("Se inserto " + nuevo);
                return true;
            }
            else{
                InsertarABB(nuevo, nodo.getHojaIzquierda());
            }
        }
        else{
            if(nuevo.getValor() > nodo.getValor()){
                if (nodo.getHojaDerecha() == null){
                    nodo.setHojaDerecha(nuevo);
                    System.out.println("Se inserto " + nuevo);
                    return true;
                }
                else{
                    InsertarABB(nuevo, nodo.getHojaDerecha());
                }
            }
        }
        return false;
    }

    /*public void inorden (NodoTest2 nodo) {
        if(nodo != null){
            inorden(nodo.getHojaIzquierda());
            System.out.println(nodo.getValor());
            inorden(nodo.getHojaDerecha());
        }
    }*/

    public void inorden(){
        inorden(raiz);
    }
    private void inorden (NodoTest2 raiz) {
        if(raiz != null){
            inorden(raiz.getHojaIzquierda());
            System.out.println(raiz.getValor());
            inorden(raiz.getHojaDerecha());
        }
    }

    /*public void preorden(NodoTest2 nodo){
		if (nodo != null){
			System.out.println(nodo.getValor());
			preorden(nodo.getHojaIzquierda());
			preorden(nodo.getHojaDerecha());
		}
	}*/

    public void preorden(){
        preorden(raiz);
    }

    private void preorden(NodoTest2 raiz){
        if (raiz != null){
			System.out.println(raiz.getValor());
			preorden(raiz.getHojaIzquierda());
			preorden(raiz.getHojaDerecha());
		}
    }

    //Buscar nodo
    public NodoTest2 buscarNodo(NodoTest2 nodo){
        return buscarNodo(nodo, raiz);
    }

    private NodoTest2 buscarNodo(NodoTest2 nodo, NodoTest2 nodoAux){
        if(nodoAux == null){
            return null;
        }
        if(nodoAux.getValor() == nodo.getValor()){
            return nodoAux;
        }
        else if (nodo.getValor() < nodoAux.getValor()){
            return buscarNodo(nodo, nodoAux.getHojaIzquierda());
        }
        else{
            return buscarNodo(nodo, nodoAux.getHojaDerecha());
        }
    }

    //Buscar y verificar que se encuentra el nodo
    public boolean busquedaBoolean(NodoTest2 nodo){
        return busquedaBoolean(nodo, raiz);
    }

    private boolean busquedaBoolean(NodoTest2 nodo, NodoTest2 nodoAux){
        if(nodoAux == null){
            return false;
        }
        if(nodoAux.getValor() == nodo.getValor()){
            return true;
        }
        else if (nodo.getValor() < nodoAux.getValor()){
            return busquedaBoolean(nodo, nodoAux.getHojaIzquierda());
        }
        else{
            return busquedaBoolean(nodo, nodoAux.getHojaDerecha());
        }
    }

    //Buscar el padre del nodo 
    public NodoTest2 BuscaNodoPadre(NodoTest2 nodo){
        return BuscaNodoPadre(nodo, raiz);
    }

    private NodoTest2 BuscaNodoPadre(NodoTest2 nodo, NodoTest2 nodoAux){
        if (nodoAux!=null){
			if (nodoAux.getValor() != nodo.getValor()){
		        if (nodo.getValor() > nodoAux.getValor()){
                    nodoAux.setPadre(nodoAux);
			        BuscaNodoPadre(nodo, nodoAux.getHojaDerecha());
		        }
		        else if (nodo.getValor() < nodoAux.getValor()){
                    nodoAux.setPadre(nodoAux);
			        BuscaNodoPadre(nodo, nodoAux.getHojaIzquierda());
			    }
		    }
		}
		return nodoAux.getPadre();
	}

    /**
     * Remover nodo
     * Caso 1: Nodo hoja
     * Caso 2: Nodo padre con un hijo
     * Caso 3: Nodo padre con dos hijos
     */
    public boolean removerNodo(NodoTest2 nodo){
        NodoTest2 auxiliar = raiz;
        NodoTest2 padre = raiz;
        boolean esHijoIzq = true;

        while(auxiliar.getValor() != nodo.getValor()){
            padre = auxiliar;
            if(nodo.getValor() < auxiliar.getValor()){
                esHijoIzq = true;
                auxiliar = auxiliar.getHojaIzquierda();
            }
            else{
                esHijoIzq = false;
                auxiliar = auxiliar.getHojaDerecha();
            }
            if(auxiliar == null){
                return false;
            }
        }
        if(auxiliar.getHojaIzquierda() == null && auxiliar.getHojaDerecha() == null){
            if(auxiliar == raiz){
                raiz = null;
            } 
            else if(esHijoIzq){
                padre.setHojaIzquierda(null);
            }
            else{
                padre.setHojaDerecha(null);
            }
        }
        else if(auxiliar.getHojaDerecha() == null){
            if(auxiliar == raiz){
                raiz = auxiliar.getHojaIzquierda();
            } 
            else if(esHijoIzq){
                padre.setHojaIzquierda(auxiliar.getHojaIzquierda());
            }
            else{
                padre.setHojaDerecha(auxiliar.getHojaIzquierda());
            }
        }
        else if(auxiliar.getHojaIzquierda() == null){
            if(auxiliar == raiz){
                raiz = auxiliar.getHojaDerecha();
            } 
            else if(esHijoIzq){
                padre.setHojaIzquierda(auxiliar.getHojaDerecha());
            }
            else{   
                padre.setHojaDerecha(auxiliar.getHojaIzquierda());
            }
        }
        else{
            NodoTest2 reemplazo = obtenerNodoReemplazo(auxiliar);
            if(auxiliar == raiz){
                raiz = reemplazo;
            }
            else if(esHijoIzq){
                padre.setHojaIzquierda(reemplazo);
            }
            else{
                padre.setHojaDerecha(reemplazo);
            }
            reemplazo.setHojaIzquierda(auxiliar.getHojaIzquierda());
        }
        return true;
    }

    private NodoTest2 obtenerNodoReemplazo(NodoTest2 nodoReemplazo){
        NodoTest2 reemplazarPadre = nodoReemplazo;
        NodoTest2 reemplazo = nodoReemplazo;
        NodoTest2 auxiliar = nodoReemplazo.getHojaDerecha();

        while(auxiliar != null){
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.getHojaIzquierda();
        }
        if(reemplazo != nodoReemplazo.getHojaDerecha()){
            reemplazarPadre.setHojaIzquierda(reemplazo.getHojaDerecha());
            reemplazo.setHojaDerecha(nodoReemplazo.getHojaDerecha());
        }
        System.out.println("El nodo reemplazo es " + reemplazo);
        return reemplazo;
    }

    //Obtener nivel del nodo 
    public void obtenerNivel(NodoTest2 nodo){
        if(nodo == raiz){
            System.out.println("Nodo " + nodo + " es el nodo raiz");
        }
        else{
            if(nodo.getHojaDerecha() != null && nodo.getHojaIzquierda() != null){
                System.out.println("Nodo " + nodo + " es un nodo padre con dos hijos");
            }
            else if((nodo.getHojaDerecha() != null && nodo.getHojaIzquierda() == null) || (nodo.getHojaDerecha() == null && nodo.getHojaIzquierda() != null)){
                System.out.println("Nodo " + nodo + " es un nodo padre con un hijo");
            }
            else{
                System.out.println("Nodo " + nodo + " es un nodo hoja");
            }
        }
    }
}
