public class Ordenamiento{
    public static void quickSort(int A[], int izq, int der) {
        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
        while(i < j){                         //mientras no se crucen las búsquedas                                   
           while(A[i] <= pivote && i < j) i++;//busca elemento mayor que pivote
           while(A[j] > pivote) j--;          //busca elemento menor que pivote
           if (i < j) {                       //si no se han cruzado                      
               aux= A[i];                     //los intercambia
               A[i]=A[j];
               A[j]=aux;
           }
         }
         A[izq]=A[j];             //se coloca el pivote en su lugar de forma que tendremos                                    
         A[j]=pivote;             //los menores a su izquierda y los mayores a su derecha
         if(izq < j-1)
            quickSort(A,izq,j-1); //ordenamos subarray izquierdo
         if(j+1 < der)
            quickSort(A,j+1,der); //ordenamos subarray derecho 
      }
    public static void intercalacion (int[]a1,int[] a2){
        int i,j,k;
        int a3[]=new int[a1.length+a2.length];
        //Repetir mientras los arreglos tengan elementos para comparar
        for(i=j=k=0;i<a1.length&&j<a2.length;k++){
          if(a1[i]<a2[j]){
            a3[k]=a1[i];
            i++;
          }else{
            a3[k]=a2[j];
            j++;
          }
          
        }
        //Añadir elementos sobrantes
        for(;i<a1.length;i++,k++){
          a3[k]=a1[i];
        }
        for(;j<a2.length;j++,k++){
          a3[k]=a2[j];
        }
        for (int n : a3) {
          System.out.println(n + " ");
        }
    }
      public static void main(String[] args) {
          int[] arreglo={2,3,4,6,7,8,9,1,5,10};
          int[] arreglo2={5,6,3,44,22,1};
          int[] arreglo3={5,2,1,8,3,9,7};
          System.out.println("----Arreglo sin ordenar----");
          System.out.println("Arreglo 1:");
          for (int n : arreglo) {
            System.out.println(n + " ");
          }
          System.out.println("Arreglo 2:");
          for (int n : arreglo2) {
            System.out.println(n + " ");
          }
          System.out.println("-----Arreglo Ordenado------");
          System.out.println("QuickSort:");
          quickSort(arreglo, 0, arreglo.length-1);
          for (int n : arreglo) {
            System.out.println(n + " ");
          }
          System.out.println("Intercalacion:");
          //Deben estar previamente ordenados
          quickSort(arreglo2, 0, arreglo2.length-1);
          quickSort(arreglo3, 0, arreglo3.length-1);
          intercalacion(arreglo2, arreglo3);
          
      }
      
}