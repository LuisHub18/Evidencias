//Autor: Eduardo Tellez.
    // 6.-Escribe una clase Alumno que contenga atributos para nombre, apellido, sexo,
    //    promedio.
public class Alumno{
    private String nombre;
    private String apellido;
    private char sexo;
    private int promedio;
    public Alumno(String nombre, char sexo, int promedio){
        this.nombre=nombre;
        this.sexo=sexo;
        this.promedio=promedio;
    }
    public char getSexo(){
        return sexo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getPromedio(){
        return promedio;
    }
    // 7.-Escribe un método que reciba como parámetro un arreglo de objetos tipo Alumno y
    //    regrese como resultado el numero de mujeres que hay en el grupo.
    public int numeroMujeres(Alumno [] alumnos){
        int cuentaMujeres=0;
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i].getSexo()=='M')cuentaMujeres++;
        }
        return cuentaMujeres;
    } 
    // 8.-Escribe un método que reciba como parámetro un arreglo de Alumno y regrese el
    //    promedio de todo el grupo.
    public int promedioGrupal(Alumno[] alumnos){
        int promedioGrupal=0;
        for(int i=0;i<alumnos.length;i++){
            promedioGrupal+=alumnos[i].getPromedio();
        }
        return promedioGrupal;
    }
    // 9.-Escribe un método que reciba como parámetro un arreglo de Alumno y regrese
    //    como resultado el total de alumnos reprobados con promedio menor que 70.
    public int alumnosReprobados(Alumno[] alumnos){
        int alumnosReprobados=0;
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i].getPromedio()<70){
                alumnosReprobados++;
            }
        }
        return alumnosReprobados;
    }

}
