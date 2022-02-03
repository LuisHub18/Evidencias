public class Producto {
    private String clave;
    private String descripcion;
    private double precio;
    private int [] cantidad;
    //Constructor
    public Producto(String clave, String descripcion, double precio, int[] cantidad) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //Metodos get y set
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public int [] getCantidad() {
        return cantidad;
    }
    public void setCantidad(int [] cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
