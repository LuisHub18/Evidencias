//Autor:Eduardo Tellez.
public class Cuadrado extends FiguraGeometrica {
    protected int lado=0;
    public Cuadrado(String color, String tipo, int lado) {
        super(color, tipo);
        this.lado = lado;
    }
    //Metodo get y set
    public int getLado(){
        return lado;
    }
    public void setLado(int l){
        lado=l;
    }
    //Metodo equals
    public boolean equals(Object o){
        if(o instanceof Cuadrado){
            Cuadrado c=(Cuadrado)o;
            return(lado==c.lado) && (color.equals(c.getColor()));
        }
        return false;   
    }
    //Metodos heredados de FiguraGeometrica
    @Override
	public double calcularArea(){
		return lado*lado;
	}
	@Override
	public double calcularPerimetro(){
		return lado*4;
	}
    //Metodo toString
    public String toString(){
        return super.toString()+lado+"\t"+calcularArea()+"\t"+calcularPerimetro();
    }
}
