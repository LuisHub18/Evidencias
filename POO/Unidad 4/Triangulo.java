//Autor:Eduardo Tellez.
public class Triangulo extends FiguraGeometrica{
    private int b=0;
    private int h=0;
    public Triangulo(String color, String tipo, int b, int h) {
        super(color, tipo);
        this.b = b;
        this.h = h;
    }
    //Metodos get y set
    public int getBase(){
        return b;
    }
    public int getAltura(){
        return h;
    }
    //Metodo equals
    public boolean equals(Object o){
        if(o instanceof Triangulo){
            Triangulo t=(Triangulo)o;
            return(b==t.b &&h==t.h && color.equals(t.getColor()));
        }
        return false;   
    }
    //Metodos heredados de FiguraGeometrica
    @Override
    public double calcularArea(){
        return (b*h)/2;
    }
    @Override
    public double calcularPerimetro(){
        double hipotenusa=Math.sqrt(Math.pow(b, 2) + Math.pow(b, 2));
        return hipotenusa+b+h;
    }
     //Metodo toString
     public String toString(){
        return super.toString()+b+","+h+"\t"+calcularArea()+"\t"+calcularPerimetro();
    }
}
