//Autor: Eduardo Téllez.
public class Perro extends Animal{
        private String color;
        public Perro (String nombre,String color){
            super("Perro",nombre);
            this.color=color;
        }
        public String getNombre(){
            return nombre;
        }
        public void printSonido(){
            System.out.println("guau");
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String toString(){
            return super.toString()+" me llamo "+nombre;
        }
}