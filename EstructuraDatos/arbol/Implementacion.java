public class Implementacion {
    public static void main(String[] args) {
       

        //Crear nodos
        NodoTest2 n1 = new NodoTest2(15);
        NodoTest2 n2 = new NodoTest2(20);//Aqui
        NodoTest2 n3 = new NodoTest2(30);//Aqui
        NodoTest2 n4 = new NodoTest2(18);
        NodoTest2 n5 = new NodoTest2(25);
        NodoTest2 n6 = new NodoTest2(28);
        NodoTest2 n7 = new NodoTest2(26);
        NodoTest2 n8 = new NodoTest2(24);
        NodoTest2 n9 = new NodoTest2(27);
        NodoTest2 n10 = new NodoTest2(40);
        NodoTest2 n11 = new NodoTest2(35);//Aqui
        NodoTest2 n12 = new NodoTest2(38);
        NodoTest2 n13 = new NodoTest2(31);
        NodoTest2 n14 = new NodoTest2(34);
        NodoTest2 n15 = new NodoTest2(9);
        NodoTest2 n16 = new NodoTest2(11);
        NodoTest2 n17 = new NodoTest2(5);//Aqui
        NodoTest2 n18 = new NodoTest2(7);
        NodoTest2 n19 = new NodoTest2(6);
        NodoTest2 n20 = new NodoTest2(13);
        NodoTest2 n21 = new NodoTest2(12);
        NodoTest2 n22 = new NodoTest2(10);//Aqui
        NodoTest2 n23 = new NodoTest2(50);
         
        //Crear arbol
         ArbolTest2 arbol = new ArbolTest2(n1);
        
         /**
         * Entrada
         * Insertar nodos en el arbol
         */
        arbol.InsertarABB(n2);
        arbol.InsertarABB(n3);
        arbol.InsertarABB(n4);
        arbol.InsertarABB(n5);
        arbol.InsertarABB(n6);
        arbol.InsertarABB(n7);
        arbol.InsertarABB(n8);
        arbol.InsertarABB(n9);
        arbol.InsertarABB(n10);
        arbol.InsertarABB(n11);
        arbol.InsertarABB(n12);
        arbol.InsertarABB(n13);
        arbol.InsertarABB(n14);
        arbol.InsertarABB(n15);
        arbol.InsertarABB(n16);
        arbol.InsertarABB(n17);
        arbol.InsertarABB(n18);
        arbol.InsertarABB(n19);
        arbol.InsertarABB(n20);
        arbol.InsertarABB(n21);
        arbol.InsertarABB(n22);

        System.out.println();

        /**
         * Salida
         * Demostracion de los metodos buscar, obtener nivel y remover
         */
        System.out.println("Inorden");
        arbol.inorden();

        System.out.println();

        System.out.println("Preorden");
        arbol.preorden();

        System.out.println();

        System.out.println("Buscar nodo n5(25): " + arbol.buscarNodo(n5));
        System.out.println("Se encuentra el nodo n5(25) adentro del arbol: " + arbol.busquedaBoolean(n5));
        System.out.println("Se encuentra el nodo n23(50) adentro del arbol: " + arbol.busquedaBoolean(n23));
        System.out.println("Buscar el padre del nodo n5(25): " + arbol.BuscaNodoPadre(n5));
        arbol.obtenerNivel(n1);
        arbol.obtenerNivel(n2);
        arbol.obtenerNivel(n7);
        arbol.obtenerNivel(n21);

        System.out.println("Mostrar---------------");

        System.out.println("Remover nodo hoja n19(6)");
        arbol.removerNodo(n22);
        arbol.removerNodo(n17);
        arbol.removerNodo(n3);
        arbol.removerNodo(n1);
        arbol.removerNodo(n11);
        arbol.removerNodo(n4);

        System.out.println();

        System.out.println("Inorden");
        arbol.inorden();
        System.out.println("Preorden");
        arbol.preorden();
        /*
        System.out.println();
        System.out.println("Siguiente mostrar");
        System.out.println("Remover nodo padre con un hijo n7(26)");
        arbol.removerNodo(n17);

        System.out.println();

        System.out.println("Inorden");
        arbol.inorden();

        System.out.println();

        System.out.println("Remover nodo padre con dos  hijos n5(25)");
        arbol.removerNodo(n5);

        System.out.println();

        System.out.println("Inorden");
        arbol.inorden();

        System.out.println();

        System.out.println("Remover nodo raiz n1(15)");
        arbol.removerNodo(n1);

        System.out.println();

        System.out.println("Inorden");
        arbol.inorden();

        System.out.println();*/
    }
}
