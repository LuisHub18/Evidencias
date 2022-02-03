//Fruta y UsaFruta (página 27)
//Autor: Eduardo Tellez.
public class Fruta {
        private String nombre;
        private int gramos;
        private double caloriasPorGramo;
        Fruta (String n ){
        this.nombre=n;
        }
        public String getNombre(){
                return nombre;
        }
        public void setPeso (int g ){
        this.gramos=g;
        }
        public int getPeso ( ){
        return gramos;
        }
        public void setCalorias(double c){
        this.caloriasPorGramo =c;
        }
        public double getCalorias(){
        return caloriasPorGramo;
        }
        public String toString (){
        return nombre+" peso "+gramos+" gramos.";
        }
       
}
