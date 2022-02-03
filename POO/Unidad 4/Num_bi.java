/*Escribe un programa que almacene en un arreglo la denominación de
billetes y monedas (1000, 500, 200, 100, 50, 20, 10, 5, 2, 1) lee de teclado
una cantidad y procesa numero de billetes y monedas de cada
denominación para tal cantidad.
Autor:EduTellez.
*/
public class Num_bi{
	public static void main(String [] args){
		int [] bi_mon={1000,500,200,100,50,20,10,5,2,1};
		int [] conteo=new int[10];
		Boolean eje=true;
		String val="";
		System.out.println("NUMERO DE BILLETES Y MONEDAS DE UNA CANTIDAD");
			
		do{
				System.out.print("Dame la cantidad:");
				int cantidad=Keyboard.readInt();
				//Numero de billetes
				for(int i=0;i<bi_mon.length;i++){
					conteo[i]=cantidad/bi_mon[i];
					cantidad=cantidad-(conteo[i]*bi_mon[i]);
					//Validar billetes o monedas del arreglo
						if(bi_mon[i]>=20){
								//Imprimir dependiendo de numero de billetes
								if(conteo[i]>1 || conteo[i]==0){
									System.out.println("Son "+conteo[i]+ " billetes de "+ bi_mon[i]);
								}
								else{
									System.out.println("Son "+conteo[i]+ " billete de "+ bi_mon[i]);
								}
						}
						else{
								//Imprimir dependiendo del numero de monedas
								if(conteo[i]>1 || conteo[i]==0){
									System.out.println("Son "+conteo[i]+ " monedas de "+ bi_mon[i]);
								}
								else{
									
									System.out.println("Son "+conteo[i]+ " moneda de "+ bi_mon[i]);
								}

						}
				}//for
				 //Repetir programa mientras
				 do{
                    System.out.print("Desea continuar con el programa (Si/No)?");
                    val=Keyboard.readString();
               		System.out.println("---------------------------------------------");
                    val=val.toUpperCase();
                     switch(val){
                        case "SI":
                            eje=true;
                            break;
                        case "NO":    
                            eje=false;
                            break;
                        default:
                        System.out.println("Respuesta Incorrecta");
                    } 
                }
                while(!(val.equals("NO") || val.equals("SI")));
		}//Cierre del primer do
		while(eje);
		System.out.println("Fin del programa");
	}//Main

}//class