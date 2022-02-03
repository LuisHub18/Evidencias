//Autor: Eduardo Tellez
public class D3Point extends Point{
    private int z=0;
    public D3Point( int x,int y, int z){
        super(x,y);
        this.z=z;
    }
    public int getZ(){
        return z;
    } 
   public void setZ(int _z){
        z=_z;
    }
    //Metodo medio() adaptado para D3Point
    public Point medio(Point p){
        if(p instanceof D3Point){
            return new D3Point((p.x+x)/2,(p.y+y)/2,(this.z+z)/2);
        }
            return new D3Point(0, 0, 0);
	}
    //Metodo toString() adaptado para Z
    public String toString(){
        return "("+this.x+","+this.y+","+z+")";
    }
}