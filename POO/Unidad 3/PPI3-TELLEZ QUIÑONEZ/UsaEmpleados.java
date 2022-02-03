import java.util.ArrayList;

//Autor: Eduardo Téllez.
public class UsaEmpleados {
    public static void main(String [] args){
        int numeroEmp,dia,mes,año,id,base,horas,precio;
        double porcentaje,numVenta;
        String nombres,apellidos,nacimiento,tipoEmpleado;
        char sexo;
        ArrayList<Empleado> listaEmpleados=new ArrayList<Empleado>();
        System.out.println("<-------------------------------------EMPLEADO------------------------------------->");
        System.out.print("Cuantos empleados seran añadidos?");
        numeroEmp=Keyboard.readInt();
        for(int i=0;i<numeroEmp;i++){
                System.out.println("<------EMPLEADO "+(i+1)+"------>");
                //Leer nombre
                System.out.print("Nombre: ");
                nombres=Keyboard.readString().toUpperCase();
                //Leer el apellido
                System.out.print("Apellido: ");
                apellidos=Keyboard.readString().toUpperCase();
                //Validar el sexo del contacto
                do{
                    System.out.print("Sexo:");
                    sexo=Keyboard.readChar();
                    sexo=Character.toUpperCase(sexo);
                            switch (sexo){
                            case 'M':break;
                            case 'F':break;
                            default:
                                    System.out.println("Respuesta Incorrecta!!Solo M,F");
                            }
                }while(!(sexo=='M'|| sexo=='F'));
                //Leer la fecha de nacimiento
                System.out.println("<------Fecha de Nacimiento------>");
                do{
                    System.out.print("Dia: ");
                    dia=Keyboard.readInt();
                    if(dia<0 || dia>31)System.out.println("Valor Incorrecto!");
                }while(dia<0 || dia>31);
                do{
                    System.out.print("Mes: ");
                    mes=Keyboard.readInt();
                    if(mes<0 || mes>12)System.out.println("Valor Incorrecto!");
                }while(mes<0 || mes>12);
                do{
                    System.out.print("Año: ");
                    año=Keyboard.readInt();
                    if(año<1900 || año>2021)System.out.println("Valor Incorrecto!");
                }while(año<1900 || año>2021);
                nacimiento=dia+"/"+mes+"/"+año;
                System.out.println("Cual es su ID?");
                id=Keyboard.readInt();
                System.out.println("--------------------------------------DATOS PARA SUELDO DE EMPLEADO--------------------------------------");
                System.out.println("1.-Base\n2.-Comision\n3.-Horas");
                System.out.print("Que tipo de empleado es?\n--->");
                tipoEmpleado=Keyboard.readString().toUpperCase();
                switch(tipoEmpleado){
                    case "BASE":
                            System.out.println(">>>>>EMPLEADO BASE<<<<<");
                            System.out.print("Cual es su sueldo base?");
                            base=Keyboard.readInt();
                            listaEmpleados.add(new Base(nombres, apellidos, sexo, nacimiento, base, id));
                            System.out.println("<----->");
                            break;
                    case "COMISION":
                            System.out.println(">>>EMPLEADO COMISION<<<");
                            System.out.print("Cuantas ventas hizo?");
                            numVenta=Keyboard.readDouble();
                            System.out.print("Que porcentaje obtiene?");
                            porcentaje=Keyboard.readDouble();
                            listaEmpleados.add(new Comision(nombres, apellidos, sexo, nacimiento, porcentaje,numVenta, id));
                            System.out.println("<----->");
                            break;
                    case "HORAS":
                            System.out.println(">>>>EMPLEADO HORAS<<<<");
                            System.out.print("Cuantas horas trabajo?");
                            horas=Keyboard.readInt();
                            System.out.print("Cuanto se le paga por hora?");
                            precio=Keyboard.readInt();
                            listaEmpleados.add(new Horas(nombres, apellidos, sexo, nacimiento, horas, precio, id));
                            System.out.println("<----->");
                            break;
                    default:
                            System.out.println("No existe ese tipo de empleado!");
                }
        }
                //Imprimir la lista completa
                System.out.println("<ID>\t<NOMBRE>\t<APELLIDO>\t<SEXO>\t\t<NACIMIENTO>\t\t<SUELDO>");
                for(int i=0;i<listaEmpleados.size();i++){
                      System.out.println(listaEmpleados.get(i));
                }

    }   
}
