//Autor: Eduardo Téllez.
public class Alumno extends PersonaEjercicios{
    private int numeroControl;
    protected char grupo;
    //Este constructor es solamente para el ejercicio 3
    public Alumno(){
        super();
        System.out.println("Alumno");
    }
    public Alumno(String nombre,String apellido, char sexo, String nacimiento,int n, char g){
        super(nombre,apellido,sexo,nacimiento);
        numeroControl=n;
        grupo=g;
    }
    public int getNumeroControl() {
        return numeroControl;
    }
    public char getGrupo() {
        return grupo;
    }
    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
    public String toString(){
        System.out.println("Alumno");
        return super.toString()+numeroControl+","+grupo;
    }

}
