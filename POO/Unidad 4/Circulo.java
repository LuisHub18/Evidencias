//Autor:Eduardo Tellez.
public class Circulo extends FiguraGeometrica {
    protected int radio=0;
    public Circulo(String color, String tipo, int radio) {
        super(color, tipo);
        this.radio = radio;
    }
    //Metodos get y set para el radio
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    //Metodo equals
    public boolean equals(Object o){
        if(o instanceof Circulo){
            Circulo c=(Circulo)o;
            return(radio==c.radio && color.equals(c.getColor()));
        }
        return false;   
    }
    //Metodos heredados de FiguraGeometrica
    @Override
    public double calcularArea(){
        double a=Math.PI*Math.pow(radio,2);
        double r=(double)Math.round(a * 100d) / 100d;
        return r;
    }
      @Override
    public double calcularPerimetro(){
        double a= 2*(Math.PI*radio);
        double r=(double)Math.round(a * 100d) / 100d;
        return r;
    }
    //Metodo toString
    public String toString(){
        return super.toString()+radio+"\t"+calcularArea()+"\t"+calcularPerimetro();
    }
}
