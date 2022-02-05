//Autor: Eduardo Téllez.
package gaussjordan_gaussseidel;
import java.text.DecimalFormat;
public class SolucionGJGS{
    public static void main(String[] args) {
        int opcion=0,orden=0;
        String pregunta="",unidad="";
        //Pantalla de inicio
        System.out.println("\t\t  Instituto Tecnológico de Culiacán");
        System.out.println("\t\t  Ing. En Sistemas Computacionales. ");
        System.out.println("Téllez Quiñonez Luis Eduardo. ");
        System.out.println("Raíces de una Ecuación. ");
        System.out.println("De 12:00 a 13:00 horas. ");
        System.out.println("Este programa ejecuta el progreso de cálculo en la solucion\nde un sistema de ecuaciones utilizando diversos métodos de\nsolucion.");
        System.out.print("¿Cuál es la pregunta del problema?");
        pregunta=Keyboard.readString();
        System.out.print("¿Cuál es la unidad de la pregunta?");
        unidad=Keyboard.readString();
        do{
            System.out.print("Introduce el orden de la matriz de datos:");
            orden=Keyboard.readInt();
        }while(!(orden>=2 && orden<=6));
        String concepto[]=new String[orden];
        for(int i=0;i<orden;i++){
            System.out.print("Concepto para la incognita X"+(i+1)+":");
            concepto[i]=Keyboard.readString(); 

        }
        double[][] matrizDatos=new double[orden][orden+1];
        System.out.println();
        System.out.println("Capture la matriz de datos");
        for (int i = 0; i < orden; i++) {
            for (int j = 0; j < (orden+1); j++) {
                System.out.print("Inserte el valor en la posición ["+(i+1)+"], ["+(j+1)+"]:");
                matrizDatos[i][j] =Keyboard.readDouble();
            }
        }	
        System.out.println("--------------------------------------------------------------");
        //Menu
        System.out.println("\tMétodos Numéricos\n"+"Solución de Ecuaciones");
        System.out.println("1.-Método de Gauss Jordan");
        System.out.println("2.-Método de Gauss Seidel");
        System.out.println("10.-F I N");
        do{
            System.out.print("¿Cual es su opción? ");
            opcion=Keyboard.readInt();
            switch(opcion){
                case 1:
                double[][] m=matrizDatos;
                double pivote,dp;
                System.out.println("\t\t\t\t  Instituto Tecnológico de Culiacán");
                System.out.println("\t\t\t\t  Ing. En Sistemas Computacionales. ");
                System.out.println("Téllez Quiñonez Luis Eduardo. ");
                System.out.println("Método de Gauss Jordan. ");
                System.out.println("De 12:00 a 13:00 horas. ");
                System.out.println("Pregunta:\n"+pregunta);
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Matriz de datos");
                System.out.println("-----------------------------------------------");
                for (int k = 0; k < orden; k++) {
                    for (int i = 0; i < orden + 1; i++) {
                        System.out.print(m[k][i] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("-----------------------------------------------");
                    for(int k=0;k<orden-1;k++)
                    {
                        pivote=m[k][k];
                        for (int f=k+1;f<orden;f++)
                        {
                            dp=m[f][k];
                            for(int c=0;c<orden+1;c++)
                            {
                                m[f][c]=((pivote*m[f][c])-(dp*m[k][c]));
                            }
                        }
                    }
                    
                    for (int k=orden-1;k>0;k--)
                    {
                        pivote=m[k][k];
                        for (int f=0;f<k;f++)
                        {
                            double factor=((m[f][k])/pivote);
                            for(int c=k;c<=orden;c++)
                            {
                                m[f][c]=((m[f][c])-(factor*m[k][c]));
                            }
                        }
                    }
                    
                    for (int k=0;k<m.length;k++)
                    {
                        m[k][orden]=(m[k][orden])/(m[k][k]);
                        m[k][k]=(m[k][k]/m[k][k]);						
                    }
                System.out.println();
                System.out.println("Matriz Transformada");
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < orden; i++) {
                    for (int j = 0; j < orden + 1; j++) {
                        System.out.print(m[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("-----------------------------------------------");
                System.out.println("Resultado de las operaciones:");
                    for(int i=0;i<m.length;i++){
                        System.out.println(concepto[i]+"    =    "+Math.round(m[i][orden])+"    "+unidad);
                    }
                    break;  
                case 2:
                    double[] vActual= new double[orden];
		            double[] vAnterior = new double[orden];
                    double errorAbsoluto = 0;
                    int nc=0;
                    DecimalFormat formato = new DecimalFormat("#000.000000");
                    System.out.println("Pregunta:\n"+pregunta);
                    for (int i = 0; i < orden; i++) {
                        System.out.println(concepto[i]+":");
                        System.out.print("¿Cual es el valor inicial?");	
                        vAnterior[i] =Keyboard.readDouble();
                        vActual[i] = 0;
                    }
                    System.out.print("Capture el error aceptado:");
                    double error=Keyboard.readDouble();
                    System.out.print("Capture el total de calculos:");
                    int totalCalculos=Keyboard.readInt();
                    System.out.println("\t\t\t\t  Instituto Tecnológico de Culiacán");
                    System.out.println("\t\t\t\t  Ing. En Sistemas Computacionales. ");
                    System.out.println("Téllez Quiñonez Luis Eduardo. ");
                    System.out.println("Método de Gauss Seidel. ");
                    System.out.println("De 12:00 a 13:00 horas. ");
                    System.out.println("Pregunta:\n"+pregunta);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("NO.\t VITAMINA B \t\tVITAMINA C \t\tVITAMINA D \t\tVITAMINA E \tERROR TOTAL");
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("0  \t700.000  \t\t800.000  \t\t900.000  \t\t1000.000  \t0.0000");
                    do{
                            for (int i = 0; i < orden; i++) {
                                double suma = matrizDatos[i][(orden)];
                                double coef = matrizDatos[i][i];
                                for (int j = 0; j < (orden); j++) {
                                    if (i != j) {
                                        if (j < i)
                                            suma = suma + ((matrizDatos[i][j]*-1)*vActual[j]);
                                        else
                                            suma = suma + ((matrizDatos[i][j]*-1)*vAnterior[j]);
                                    }	
                                }
                                suma = suma/coef;
                                vActual[i] = suma;
                            }
                            errorAbsoluto=0;
                            for (int i = 0; i < orden; i++) {
                                errorAbsoluto+=Math.abs(Math.abs(vActual[i])-Math.abs(vAnterior[i]));
                            }
                            System.out.print(nc+1);
                            for (int i = 0; i < orden; i++) {
                                System.out.print("\t"+formato.format(vActual[i])+"\t");
                                vAnterior[i] = vActual[i];
                            }
                            System.out.println(formato.format(errorAbsoluto));
                        System.out.println();
                        nc++;
                        if(nc==totalCalculos){
                            System.out.println("El proceso supero el número máximo de cálculos y no encontró la mejor aproximación");
                            break;
                         }
                    }while(errorAbsoluto>=error && nc<totalCalculos);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    //Imprimir los resultados
                    System.out.println("Resultado de las operaciones:");

                    for(int i=0;i<concepto.length;i++){
                        System.out.println(concepto[i]+"    =    "+Math.round(vActual[i])+"    "+unidad);
                    }
                    break;
                case 10:
                    System.out.println("----------------------Fin Del Programa-------------------------");
                    break;
                default:
                    System.out.println("#OpcionInvalida");
            }
        }while(opcion!=10);
    }
}