package pila_cola_tarea;
/*
                                                                                             CLASE COLA
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
public class Cola <T> {
    //Atributos
    private int frente=-1;
    private int fin=-1;
    private T elementoscola[];
    private int max;

    //Constructores
    public Cola(){
        this(5);
    }
	@SuppressWarnings("unchecked")
    public Cola(int max){
        this.max = max;
        elementoscola= (T[])new Object[max];
    }

    //Metodos
    public boolean Llena(){
        if(fin==max-1 && frente==0 || fin+1==frente){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean Vacia(){
        if(fin==-1 && frente==-1){
            return true;
        }
        else{
            return false;
        }
    }

    public void insertar(T dato){

        if(Llena()==true){
            System.out.print("La cola esta llena \n");
        }
        else{

            if(fin==max-1 && fin>0){
                fin=0;
                elementoscola[fin]=dato;
            }
            else{
                fin++;
                elementoscola[fin]=dato;
                frente=0;
            }
            
        }
    }

    public T retirar(){
        T aux = null;
        if(Vacia()==true){
            System.out.print("La cola esta vacia");
            System.out.println();
        }
        else{
            elementoscola[frente]=aux;
            if(frente==fin){
                frente=-1;
                fin=-1;
            }
            else{
                frente++;
            }
        }
        return aux;
    }

    public void mostrar(){
        if(!Vacia()){    
            for(int iCont=0; iCont<elementoscola.length; iCont++){
                System.out.println("Contenido[" + (iCont+1) + "]: "+elementoscola[iCont]);
            }
        }
        else{
            System.out.print("La cola esta vacia");
        }
    }
}
