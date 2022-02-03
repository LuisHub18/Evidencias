//Autor: Eduardo Téllez.
public class Producto{
    private String id, nombreProd;
    private int disP, precio;
    public Producto(String id,String nombreProd, int disP, int precio){
        this.id=id;
        this.nombreProd=nombreProd;
        this.disP=disP;
        this.precio=precio; 
    }
    public String getNombre(){
            return nombreProd;
    }
    public String getId(){
        return id; 
    }
    public int getPrecio(){
        return precio;
    }
    public int getdisP(){
        return disP;
    }
    public void setNombre(String n){
        nombreProd=n;
    }
    public void setdisP(int d){
        disP=d;
    }
    public void verProducto(){
        System.out.println("ID:"+getId() +"\n Nombre del producto: "+ getNombre()+ "\n Precio: "+getPrecio()+ "\n Disponibilidad: "+ getdisP() );
    }
}