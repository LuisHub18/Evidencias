package derivacion_integracion;
import java.text.DecimalFormat;

public class DerivacionIntegracion {
    public static void main(String[] args) {
        int nc=0,numProblema=0,trapecio=1;
        String resultados="";
        //Darle formato a los resultados
        DecimalFormat formato=new DecimalFormat("##.000000");
        double h=0, fah=0,fa=0,a,b,ah=0,areaTotal=0,areaTrapecio=0,errorProblema=0;
        //Pantalla de inicio
        System.out.println("\t\t  Instituto Tecnológico de Culiacán");
        System.out.println("\t\t  Ing. En Sistemas Computacionales. ");
        System.out.println("Téllez Quiñonez Luis Eduardo. ");
        System.out.println("Derivación e integración numérica\nMétodo de los trapecios ");
        System.out.println("De 12:00 a 13:00 horas. ");
        System.out.println("Este programa realiza el calculo de una integral definida por el método de trapecios\ncon la siguiente informacion......");
        //Servira para elegir que como resolver la pregunta
        do{
        System.out.print("Que problema resolvera?");
            numProblema=Keyboard.readInt();
        }while(!(numProblema==1 ||numProblema==2));
        //Captura de datos del problema
        System.out.println("Cuál es la pregunta del problema?");
        String pregunta=Keyboard.readString();
        System.out.print("Cuál es el valor real?");
        double valorReal=Keyboard.readDouble();
        System.out.print("Cuál es la unidad de la pregunta?");
        String unidad=Keyboard.readString();
        System.out.print("Valor inferior del intervalo:");
        int valorInferior=Keyboard.readInt();
        System.out.print("Valor superior del intervalo:");
        int valorSuperior=Keyboard.readInt();
        System.out.print("Numero de trapecios inicial:");
        int numTrapecios=Keyboard.readInt();
        System.out.print("Error tolerante del problema:");
        double errorTolerante=Keyboard.readDouble();
        System.out.print("Total de procesos a realizar:");
        int totalProcesos=Keyboard.readInt();
        //Inicio de calculos
        do{
        a=valorInferior;
        b=valorSuperior;
        h=(b-a)/numTrapecios;
        trapecio=1;
        //Calcular el numero de trapecios requerido
        for(int i=1;i<=numTrapecios;i++) {  
            ah=a+h;
            //Dependiendo del problema a resolver usar una expresion u otra
            switch(numProblema){
                    case 1:
                    fa=2+(Math.sin(2*(Math.sqrt(a))));
                    fah=2+(Math.sin(2*(Math.sqrt(ah))));
                    break;
                    case 2:
                    fa=(Math.pow(a, 3)-(Math.sin(a+1)));
                    fah=(Math.pow(ah, 3)-(Math.sin(ah+1)));
                    break;
            }
            //Usamos metodo del trapecio
            areaTrapecio=(h/2)*(fa+fah);
            //Acumulando area total
            areaTotal+=areaTrapecio;
            //Vamos guardando el formato de salida para mostrarlo al final	
            resultados+=" "+trapecio+"\t"+formato.format(a)+"\t"+formato.format(ah)+"\t"+formato.format(fa)+"\t"+formato.format(fah)+"\t"+formato.format(areaTrapecio)+"\n";  
            //Preparamos para el calculo del siguiente trapecio
            if(trapecio<numTrapecios) {
                a=ah;
                ah=a+h;									
            }
            //Imprimimos los resultados si alcanzamos los trapecios que ocupabamos
            if(trapecio==numTrapecios) {
                System.out.println("\t\t\t\tInstituto Tecnologico de Culiacán");
                System.out.println("\t\t\t\tIngenieria en Sistemas Computacionales");
                System.out.println("Téllez Quiñonez Luis Eduardo. ");
                System.out.println("Derivación e integración numérica\nMétodo de los trapecios ");
                System.out.println("De 12:00 a 13:00 horas");
                System.out.println();
                System.out.println("Pregunta: " + pregunta);
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("No.\t a\t\t a+h\t\t F(a)\t\t F(a+h)\t\t Areas ");
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println(resultados);
                System.out.println("------------------------------------------------------------------------------------------------------");
                errorProblema=Math.abs(valorReal-areaTotal);
            }
            trapecio++;
        }//cierre for
            nc++;
            System.out.println("Resultados....");
            System.out.println("Numero de proceso: "+nc);
            System.out.println("Valor calculado por trapecios= "+areaTotal+" "+unidad);
            System.out.println("Error del problema= "+errorTolerante+" "+unidad);
            System.out.println("Error del metodo= "+errorProblema+" "+unidad);
            System.out.println();
            if(errorProblema<=errorTolerante){
                System.out.println("#Fin del programa");
            }else{
                System.out.println(".....");
            }
            areaTotal=0;
            //Duplicamos el numero de trapecios en caso de que no se encuentre el resultado     
            if(errorProblema>errorTolerante) {
                numTrapecios=numTrapecios*2;
                h=(valorSuperior-valorInferior)/numTrapecios;  
            }
        }while(errorProblema>errorTolerante && nc<=totalProcesos);
        System.out.println();
        if(errorProblema>errorTolerante &&nc>totalProcesos){
        System.out.println("#Limite de calculos alcanzado, no se encontro un resultado#");
        System.out.println("#Fin del programa");
    }  
    }//main
}//clase
 