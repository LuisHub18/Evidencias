package ejercicio4;
/*
                                                                                        Clase Lista Ordenada
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
public class ListaOrdenada{
    //Clase
    class Nodo {
       //Atributos
       private int matricula;
       private String nombre;
       private int edad;
       private char sexo;
       private int calificacion;
       public Nodo sig;
       //Constructor
       public Nodo(int m, String n, int e, char s, int calf) {
           matricula = m;
           nombre = n;
           edad = e;
           sexo = s;
           calificacion = calf;
       }
       public int getEdad(){
           return edad;
       }

       public int getMatricula() {
           return matricula;
       }
       public Nodo getSig() {
           return sig;
       }

       public void setSig(Nodo sig) {
           this.sig = sig;
       }

       @Override
       public String toString() {
           String cadena = "";
           if(matricula >= 10000000){
               cadena = cadena + matricula + "\t";
           }
           else{
               cadena = cadena + matricula + "\t\t";
           }
           if(nombre.length() >= 8){
               cadena = cadena + nombre + "\t";
           }
           else{
               cadena = cadena + nombre + "\t\t";
           }
           cadena = cadena + edad + "\t" + sexo + "\t" + calificacion;
           return cadena;
       }
   }
   
   private Nodo raiz;
   private int tamanio=0;
   //Constructor
   public int getTamanio(){
       return tamanio;
   }
   public ListaOrdenada() {
       raiz=null;
       tamanio=0;
   }

   //Metodos
   public boolean listaVacia(){
       return raiz == null;
   }
   public void insertar(int m, String n, int e, char s, int calf){
       Nodo newNodo = new Nodo (m,n,e,s,calf);
       if(!buscar(newNodo.matricula)){
           if (listaVacia()){
               raiz=newNodo;
               tamanio++;
           } 
           else{
               if (m<raiz.matricula){
                   newNodo.sig=raiz;
                   raiz=newNodo;
                   tamanio++;
               } 
               else {
                   Nodo reco=raiz;
                   Nodo atras=raiz;
                   while (newNodo.matricula>=reco.matricula && reco.sig!=null){
                       atras=reco;
                       reco=reco.sig;
                   }
                   if (newNodo.matricula>=reco.matricula){
                       reco.sig=newNodo;
                       tamanio++;
                   } 
                   else{
                       newNodo.sig=reco;
                       atras.sig=newNodo;
                       tamanio++;
                   }
               }
           }
       }
       else{
           System.out.println("Ya existe un alumno con esta matricula");
       }
   }

   private boolean buscar(int matricula){
       Nodo aux = raiz;
       boolean encontrado = false;
       while(aux != null && encontrado != true){
           if (matricula == aux.getMatricula()){
               encontrado = true;
           }
           else{
               aux = aux.getSig();
           }
       }
       return encontrado;
   }

   public void buscarPorMatricula(int matricula){
       if (buscar(matricula)) {
           Nodo aux = raiz;
           while(matricula != aux.getMatricula()){
               aux = aux.getSig();
           }
           System.out.println(aux.toString());
       }
       else{
           System.out.println("No existe un alumno con esta matricula");
       }
   }

   public void remover(int matricula){
       if (buscar(matricula)) {
           if (raiz.getMatricula() == matricula) {
               raiz = raiz.getSig();
           } else{
               Nodo aux = raiz;
               while(aux.getSig().getMatricula() != matricula){
                   aux = aux.getSig();
               }
               Nodo siguiente = aux.getSig().getSig();
               aux.setSig(siguiente);  
           }
           tamanio--;
           System.out.println("Alumno removido");
       }
       else{
           System.out.println("No existe un alumno con esta matricula");
       }
   }
   public void mostrar() {
       Nodo aux = raiz;
       while (aux != null) {
           System.out.println(aux.toString());
           aux = aux.sig;
       }
       System.out.println();
   }
   
   public double promedioGral(){
       double promedio=0;
       int tamaño=0;
       Nodo aux=raiz;
       while (aux != null) {
           promedio+=aux.calificacion;
           aux=aux.sig;
           tamaño++;
       }
       return Math.round(promedio/tamaño);
   }
   public int totalAprobados(){
       int total=0;
       Nodo aux=raiz;
       while (aux != null) {
           if(aux.calificacion>=70){
               total++;
           }
           aux=aux.sig;
       }
       return total;
   }
   public int totalReprobados(){
       int total=0;
       Nodo aux=raiz;
       while (aux != null) {
           if(aux.calificacion<70){
               total++;
           }
           aux=aux.sig;
       }
       return total;
   }
   public void mostrarAlumnoCalificacion(){
       Nodo aux = raiz;
       Nodo alumnoMayor=aux;
       while (aux != null) {
           if(aux.calificacion>alumnoMayor.calificacion){
               alumnoMayor=aux;
           }
           aux = aux.sig;
       }
       System.out.println(alumnoMayor.toString());
   }
   public void mostrarAlumnoHombre(){
       Nodo aux = raiz;
       while (aux != null) {
           if(aux.sexo=='M'){
               System.out.println(aux.toString());
           }
           aux = aux.sig;
       }
   }
   public void mostrarAlumnoMujer(){
       Nodo aux = raiz;
       while (aux != null) {
           if(aux.sexo=='F'){
               System.out.println(aux.toString());
           }
           aux = aux.sig;
       }
   }
   public void mostrarMenorMayor(){
           Nodo arregloAux[] = new Nodo[tamanio];
           Nodo aux = raiz;
           Nodo menor;
   
           for(int i = 0; i < tamanio; i++){
               arregloAux[i] = aux;
               aux = aux.getSig();
           }
   
           for(int i = 0; i < tamanio; i++){
               for(int j = i + 1; j < tamanio; j++){
                   if(arregloAux[i].getEdad() > arregloAux[j].getEdad()){
                       menor = arregloAux[i];
                       arregloAux[i] = arregloAux[j];
                       arregloAux[j] = menor;
                   }
               }
           }
           
           for (Nodo nodo : arregloAux) {
               System.out.println(nodo.toString());
           }
   }
   
   public static void main(String[] args) {
         ListaOrdenada lista= new ListaOrdenada();
         lista.insertar((int)(Math.random()*100)+50, "Juan", 19,'M', (int)(Math.random()*50)+50);
         lista.insertar((int)(Math.random()*100)+50, "Andrea", 20,'F', (int)(Math.random()*50)+50);
         lista.insertar((int)(Math.random()*100)+50, "Pedro", 22,'M', (int)(Math.random()*50)+50);
         lista.insertar((int)(Math.random()*100)+50, "Alejandra", 18,'F', (int)(Math.random()*50)+50);
         lista.insertar((int)(Math.random()*100)+50, "Tania", 17,'F', (int)(Math.random()*50)+50);
         lista.insertar((int)(Math.random()*100)+50, "Maria", 12,'F', (int)(Math.random()*50)+50);
         lista.mostrar();
         System.out.println("-----------------------------Promedio General----------------------------");
         System.out.println(lista.promedioGral()); 
         System.out.println("--------------------------------Aprobados-------------------------------");
         System.out.println(lista.totalAprobados());
         System.out.println("--------------------------------Reprobados------------------------------");
         System.out.println(lista.totalReprobados());
         System.out.println("----------------------------------Mujeres--------------------------------");
         lista.mostrarAlumnoMujer();
         System.out.println("----------------------------------Hombre---------------------------------");
         lista.mostrarAlumnoHombre();
         System.out.println("-----------------------------Mayor Calificacion--------------------------");
         lista.mostrarAlumnoCalificacion();
         System.out.println("--------------------------Alumnos de menor a mayor-----------------------");
         lista.mostrarMenorMayor();
   }
}