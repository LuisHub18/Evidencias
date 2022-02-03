public class PersonaEjercicios  {
            protected String nombre="Sin nombre";
            protected String apellido="*******";
            protected char sexo='*';
            private String nacimiento="*";
            public PersonaEjercicios(String nombre, String apellido, char sexo, String nacimiento) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.sexo = sexo;
                this.nacimiento = nacimiento;
            }
            public PersonaEjercicios(){
                //System.out.println("Persona");
            }
            
            //Metodos Get y Set de los atributos 
            public char getSexo() {
                return sexo;
            }
            public void setSexo(char sexo) {
                this.sexo = sexo;
            }
            public String getNacimiento(){
                return nacimiento;
            }
            public void setNacimiento(String n){
                nacimiento=n;
            }
            public String getNombre() {
                return nombre;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public String getApellido() {
                return apellido;
            }
            public void setApellido(String apellido) {
                this.apellido = apellido;
            }
            //Implementacion de metodo equals en clase Persona
            public boolean equals(Object o){
                if(o instanceof PersonaEjercicios){
                   PersonaEjercicios p1=(PersonaEjercicios)o;
                    return  ((nombre.equals(p1.nombre)) && (apellido.equals(p1.apellido)) && (sexo==p1.sexo) && (nacimiento.equals(p1.nacimiento)));
                }
                    return false;
            }
            // Método para clonación
            public Object clone(){
                    Object obj=null;
                    try{
                        obj=super.clone();
                        }catch(CloneNotSupportedException ex){
                        System.out.println(" No se puede duplicar");
                    }
                    return obj;
            }
            //Metodos para intentar sobrescribir clase Persona
            public final String hablar(){
                return "Hola a todos";
            }
            //----------------------------------------------
            public String toString(){
                //System.out.println("Persona");
                return "("+nombre+","+apellido+","+sexo+","+nacimiento+")";
            }
}
