import java.io.IOException;

public class Arboles2 {
    public static NodoArbol12 Raiz=null;
    public static NodoArbol12 padre = null;;
    public static int cuenta=0, total=0;

    public static NodoArbol12 CreaNodo(int clave)
    {
        NodoArbol12 nvo = new NodoArbol12();
        nvo.claveart = clave;
        nvo.LD = null;
        nvo.LI = null;

        return nvo;
    }

    public static void inorden (NodoArbol12 nodo) {
        if(nodo != null)
        {
            inorden(nodo.LI);
            System.out.println(nodo.claveart);
            inorden(nodo.LD);
        }
    }

    public static void preorden(NodoArbol12 nodo)
	{
		if (nodo!=null){
			System.out.println(nodo.claveart);
			preorden(nodo.LI);
			preorden(nodo.LD);
		}
	}

    public static NodoArbol12 Busca(int dato, NodoArbol12 nodo)
	{
		if (nodo!=null){
			if (nodo.claveart!=dato){
		        if (dato>nodo.claveart){
			        padre=nodo;
			        Busca(dato,nodo.LD);
		        }
		        else if (dato<nodo.claveart){
			        padre=nodo;
			        Busca(dato,nodo.LI);
			    }
		    }
		}
		return padre;
	}

    public static boolean InsertarABB( int clave, NodoArbol12 nodo)
    {
        if (clave<nodo.claveart)
        {
            if(nodo.LI==null)
            {
                NodoArbol12 nuevo=CreaNodo(clave);
                nodo.LI=nuevo;
                System.out.println("Se inserto "+clave);
                return true;
            }
            else
            {
                InsertarABB(clave, nodo.LI);
            }
        }
        else
        {
            if(clave>nodo.claveart)
            {
                if (nodo.LD==null)
                {
                    NodoArbol12 nuevo = CreaNodo(clave);
                    nodo.LD=nuevo;
                    System.out.println("Se inserto "+clave);
                    return true;
                }
                else
                {
                    InsertarABB(clave, nodo.LD);
                }
            }
        }
        return false;
    }

    public static boolean busquedaBoolean(int dato, NodoArbol12 nodo){
        if(nodo != null){
            if(nodo.claveart == dato){
                return true;
            }
            else{
                if(dato > nodo.claveart){
                    padre = nodo;
                    Busca(dato, nodo.LD);
                }
                else{
                    if(dato < nodo.claveart){
                        padre = nodo;
                        Busca(dato, nodo.LI);
                    }
                }
            }
        }
        return false;
    }

    public static NodoArbol12 busquedaNodo(int dato, NodoArbol12 nodo){
        if(nodo != null){
            if(nodo.claveart == dato){
                padre = nodo;
                return padre;
            }
            else{
                if(dato > nodo.claveart){

                    Busca(dato, nodo.LD);
                }
                else{ 
                    if(dato < nodo.claveart){
                            padre = nodo;
                            Busca(dato, nodo.LI);
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        NodoArbol12 newNumero = CreaNodo(80);
        Raiz = newNumero;

        InsertarABB(90, Raiz);
        InsertarABB(50, Raiz);
        InsertarABB(55, Raiz);
        InsertarABB(70, Raiz);
        InsertarABB(35, Raiz);
        InsertarABB(100, Raiz);
        InsertarABB(115, Raiz);
        InsertarABB(65, Raiz);
        InsertarABB(45, Raiz);
        InsertarABB(120, Raiz);
        InsertarABB(95, Raiz);
        InsertarABB(40, Raiz);

        System.out.println();

        System.out.println("Recorrido inorden:");
        inorden(Raiz);

        System.out.println();

        System.out.println("Recorrido preorden:");
        preorden(Raiz);
    }
}
