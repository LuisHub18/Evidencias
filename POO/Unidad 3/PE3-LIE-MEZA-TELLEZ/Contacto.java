package Proyecto;
import java.util.ArrayList;
public class Contacto extends Persona implements Comparable<Contacto>{
    protected String email;
    protected String alias;
    protected ArrayList<Telefono> telefonos= new ArrayList<Telefono>();
    public Contacto (String nombre, String apellido,String alias, char sexo, String nacimiento,String email,ArrayList<Telefono> telefono){
        super(nombre,apellido,sexo,nacimiento);
        this.alias=alias;
        this.email=email;   
        this.telefonos=telefono;
    }
    //Metodos get y set
    public String getAlias(){
        return alias;
    }
    public void setAlias(String alias){
        this.alias=alias;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return super.toString()+"\t\t"+alias+"\t"+email+"\t"+telefonos+"\n";
    }
    public String toString(int i){
        return super.toString()+"\t\t"+alias+"\t"+email+"\t"+telefonos.get(i)+"\n";
    }
    //Metodo para decir como vamos a ordenar la lista
	public int compareTo(Contacto p) {
		return nombre.compareTo(p.getNombre());
	}
    
}
