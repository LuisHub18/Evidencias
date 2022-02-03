//Punto y UsaPunto (página 26)
//Autor: Eduardo Tellez
public class Punto{
	private int x=0;
	private int y=0;
	private static int totalpuntos=0;
	public Punto(int _x, int _y){
		x=_x;
		y=_y;
		totalpuntos++;				
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	public static int getTotalPuntos(){
		return totalpuntos;
	}
	public int getX(){
		return x;	
	}
	public int getY(){
		return y;
	}
	public void setX(int _x){
		x=_x;
	}
	public void setY(int  _y){
		y=_y;
	}
	public double DistanciaPuntos(Punto _p){
		int px=x-_p.getX();
		int py=y-_p.getY();
		double distancia=Math.sqrt(Math.pow(px,2) + Math.pow(py,2));
		return distancia;
	}
	// 10.-Escribe un método para la clase Punto que mueva las coordenadas a otro punto.
	public void muevePunto(int x, int y){
		this.x=x;
		this.y=y;
	}
	// 11.-Escribe un método que reciba como parámetro dos objetos tipo Punto y regrese como
    //     resultado su pendiente.
	public static double pendientePuntos(Punto p1,Punto p2){
		return (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
	}
	// 13.-Escribe un método que reciba como parámetro un arreglo de Puntos y obtenga
	//	   cuantos están en el origen (0,0)
	public static int puntosOrigen(Punto [] puntos){
		int numPuntosO=0;
		for(int i=0; i<puntos.length;i++){
			if(puntos[i].getX()==0 && puntos[i].getY()==0)numPuntosO++;
		}
		return numPuntosO;
	}
	public void move(Punto a){
		x=a.getX();
		y=a.getY();
	}
	public void move(int x, int y){
		this.x=x;
		this.y=y;
	}
	
}