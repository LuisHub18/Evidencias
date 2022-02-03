//Clase Triangulo
//Autor: Eduardo Tellez
public class Triangulo {
		//atributos
		private int base,altura;
		private double area;
		// constructor
		public Triangulo (int b, int a){
		base = b;
		altura = a;
		}
		// calcular área
		public double area(){
		area= base * altura / 2;
		return  area;
		}
		// método toString
		public String toString(){
		return "Base = "+base+"  Altura =" + altura;
		}
		// métodos get
		public int getAltura(){
		return altura ;
		}
		public int getBase(){
		return base ;
		}
		// métodos set
		public void setBase(int b){
		base = b;
		}
		public void setAltura(int a){
		altura = a;
		}
}