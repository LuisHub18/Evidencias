package ejercicio2;

public class Cola<T> { 
	private int Maximo,Frente,Fin;
	private T [] C;
	public T Dr;
	
	public Cola(){
	    this(5);
	}
	
	@SuppressWarnings("unchecked")
	public Cola(int Maximo){
	    this.Maximo=Maximo;
	    Frente=Fin=-1;
	    Dr=null;
	    C=(T[]) new Object[Maximo];
	}
	
	public boolean Llena(){
	    return Fin==Maximo-1;
	}
	
	public boolean Vacia(){
	    return Frente==-1;
	}
	
	public boolean Inserta(T Dato){
	    if(Llena())
	    return false;
	    Fin++;
	    C[Fin]=Dato;
	    if(Frente==-1)
	    Frente=0;
	    return true;
	}
	
	public boolean Retira(){
	    if(Vacia()){
	        return false;
	    }
	        Dr=C[Frente];  
	    if(Frente==Fin){
	            Frente=Fin=-1;
	    }  
	    else{
	        Frente++;
	         
	    }
	return true;
	}
	
	public void mostrar(){
	    if(!Vacia()){
	       for(int i=0; i<C.length; i++){
	            System.out.println("Contenido[" + (i+1) +"]: " + C[i]);
	        } 
	    }
	    else{
	        System.out.println("La cola esta vacia");
	    }
	}
	
	public void mostrarInverso(){
	    if(!Vacia()){
	       for(int i=4; i<5; i--){
	    	   try {
	    		  System.out.println("Contenido[" + (i+1) +"]: " + C[i]); 
	    	   }catch(Exception e) {
	    	   }
	        } 
	    }
	    else{
	        System.out.println("La cola esta vacia");
	    }
	}
}
