//Autor: Eduardo Téllez.
public class Base extends Empleado {
        protected double base;
        //Constructor que le asigna un sueldo base al empleado
        public Base(String nombre,String apellido,char sexo,String nacimiento,double base,int id){
            super(nombre, apellido, sexo, nacimiento, base,id);
        }
        public Base(){
            System.out.println("Base");
        }
        //Metodos get y set
        public double getBase() {
            return base;
        }
        public void setBase(double base) {
            this.base = base;
            sueldo=base;
        }
        public String toString(){
            return super.toString();
        }

}
