//Autor: Eduardo Téllez 
public class Empleado extends PersonaEjercicios implements Cloneable{
    private int id=0;
    protected double sueldo=0;
    public Empleado(String nombre,String apellido,char sexo,String nacimiento,double s,int id){
        super(nombre,apellido,sexo,nacimiento);
        sueldo=s;
        this.id=id;
    }
    public Empleado(){
        //System.out.println("Empleado");
    }   
    //Metodos get y set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id =id;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public String toString(){
        return id+"\t"+this.nombre+"\t\t"+this.apellido+"\t\t"+this.sexo+"\t\t"+this.getNacimiento()+"\t\t$"+sueldo;
    }
    
}   
