public class Actividades {
    private Integer codigo;
    private String nombre;
    public Actividades(Integer codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString(){
        return codigo+"  "+nombre;
    }
}
