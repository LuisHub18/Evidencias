//Autor: Eduardo Tellez
public class Point{
	protected int x=0;
	protected int y=0;
	protected static int totalPuntos=0;
    public Point(){
        totalPuntos++;
    }
	public Point(int _x, int _y){
		x=_x;
		y=_y;
		totalPuntos++;				
	}
	public void setX(int _x){
		x=_x;
	}
	public void setY(int  _y){
		y=_y;
	}
	public int getX(){
		return x;	
	}
	public int getY(){
		return y;
	}
	public Point medio(Point a){
        return new Point((a.x+x)/2,(a.y+y)/2);
	}
    public String toString(){
		return "("+x+","+y+")";
	}
	
}