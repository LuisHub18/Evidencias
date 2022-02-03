//Autor:Eduardo Tellez.
public abstract class FiguraGeometrica{
    protected String color="";
    public FiguraGeometrica(String color, String tipo) {
        this.color = color;
        this.tipo = tipo;
    }
    protected String tipo="";
    //Metodos get y set para variables
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color=c;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String t){
        tipo=t;
    }
    //Metodos abstractos de que heredaremos a las clases 
    //Triangulo, Circulo y Cuadrado
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    //Metodo toString() con solo el tipo de figura
    public String toString(){
        return tipo+"\t\t";
    }
}