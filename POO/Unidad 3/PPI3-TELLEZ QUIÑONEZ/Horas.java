//Autor: Eduardo Téllez.
public class Horas extends Empleado{

    private int horasTrabajadas;
    private double valorHora;
   
    public Horas(String nombre,String apellido,char sexo,String nacimiento,int horasTrabajadas,double valorHora,int id){
            super(nombre,apellido,sexo,nacimiento,(horasTrabajadas*valorHora),id);
            this.horasTrabajadas=horasTrabajadas;
            this.valorHora=valorHora;
    }
    public Horas(){
        System.out.println("Horas");
    }   
    //Metodos get y set
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHogar(double hora) {
        this.valorHora = hora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String toString(){
        return super.toString()+"\t"+valorHora+"\t"+horasTrabajadas;
    }
}
