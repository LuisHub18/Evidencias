//Autor: Eduardo Téllez.
public class Comision extends Empleado {
    private double porcentajeVenta;
    private double totalVentas;
    public Comision(String nombre, String apellido,char sexo,String nacimiento,double pV,double tV,int id){
        super(nombre,apellido,sexo,nacimiento,(pV*tV*2000),id);
        porcentajeVenta=pV;
        totalVentas=tV;
    }
    public Comision(){
        System.out.println("Comision");
    }
    //Metodos get y set
    public double getTotalVentas() {
        return totalVentas;
    }
    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }
    public double getPorcentajeVenta() {
        return porcentajeVenta;
    }
    public void setPorcentajeVenta(double porcentajeVenta) {
        this.porcentajeVenta = porcentajeVenta;
    }

    public String toString(){
        return super.toString()+"\t"+porcentajeVenta+"\t"+totalVentas;
    }
   


}
