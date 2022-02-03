//Clase Perro
//Autor: Eduardo Tellez.
public class Perro {
            private String nombre;
            private char sexo;
            private String raza;
            private int edad;
            private String color;
            private double peso;
            public static int totalPerros;
            //Constructores
            public Perro(String n, char s, String r){
                   this.nombre=n;
                   this.sexo=s;
                   this.raza=r;
                   totalPerros++;
            }
            /*
           public Perro(String n, char s, String r,int e, String c, double p){
                        this.nombre=n;
                        this.sexo=s;
                        this.raza=r;
                        this.edad=e;
                        this.color=c;
                        this.peso=p;
            }*/
            
            //Metodos get
            public String getNombre(){
                    return nombre;
            }
            public char getSexo(){
                    return sexo;
            }
            public String getRaza(){
                    return raza;
            }
            public int getEdad(){
                    return edad;
            }
            public String getColor(){
                    return color;
            }
            public double getPeso(){
                    return peso;
            }
            //Metodos set 
            public void setEdad(int e){
                    this.edad=e;
            }
            public void setColor(String c){
                    this.color=c;
            }
            public void setPeso(double p){
                    this.peso=p;
            }

            public String toString(){
                    return "Nombre: "+nombre+ " Sexo: "+ sexo + " Raza: "+ raza +" Edad: "+ edad +" Color: "+ color+ " Peso: "+peso+"\n";
            }
}
