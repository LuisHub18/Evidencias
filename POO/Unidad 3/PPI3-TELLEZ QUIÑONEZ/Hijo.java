//Autor: Eduardo Téllez.
public class Hijo extends Padre{

    private int otroValor;
    public int getOtroValor() {
        return otroValor;
    }
    public void setOtroValor(int otroValor) {
        this.otroValor = otroValor;
    }
    public String toString(){
        return super().toString()+otroValor;
    }
    public static void main(String []args ){
        Hijo hijo=new Hijo();
        System.out.println(hijo);
    }
    
}
