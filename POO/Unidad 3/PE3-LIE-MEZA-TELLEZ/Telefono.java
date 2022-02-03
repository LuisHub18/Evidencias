package Proyecto;
public class Telefono{
    protected char tipoTelefono;
    protected int clavePais;
    protected String numeroTelefono;
    public Telefono(char tipoTelefono,int clavePais, String numeroTelefono){
        this.tipoTelefono=tipoTelefono;
        this.clavePais=clavePais;
        this.numeroTelefono=numeroTelefono;
    }
    //Metodos get y set
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public int getClavePais() {
        return clavePais;
    }
    public void setClavePais(byte clavePais) {
        this.clavePais = clavePais;
    }
    public char getTipoTelefono() {
        return tipoTelefono;
    }
    public void setTipoTelefono(char tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
    public String toString(){
        return "("+tipoTelefono+", "+clavePais+", "+numeroTelefono+")";
    }
}
