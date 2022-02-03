public class PersonaEjercicios {
            protected String nombre;
            protected String apellido;
            protected char sexo;
            private String nacimiento;
            public PersonaEjercicios(String nombre, String apellido, char sexo, String nacimiento) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.sexo = sexo;
                this.nacimiento = nacimiento;
            }
            public PersonaEjercicios(){
                System.out.println("Persona");
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
            public String toString(){
                System.out.println("Persona");
                return "("+nombre+","+apellido+","+sexo+","+nacimiento+")";
            }
}
