/*
    Fruta y UsaFruta (página 27)
    Autor: Eduardo Tellez.
*/
public class UsaFruta {
    public static void main(String [] args){
        String nombreFruta;
        int gramos=0;
        double caloriasPorGramo;
        Fruta [] frutas=new Fruta [3];
        //CICLO FOR PRINCIPAL
        System.out.println("_|_VALOR NUTRICIONAL DE FRUTAS_|_");
        for(int i=0;i<frutas.length;i++){
            System.out.println("-----------FRUTA #"+(i+1)+"-----------");
            System.out.print("Cual es el nombre de la fruta?");
            nombreFruta=Keyboard.readString();
            nombreFruta=nombreFruta.toUpperCase();
            frutas[i]=new Fruta(nombreFruta);
            switch(nombreFruta){
                case "SANDIA":
                    caloriasPorGramo=0.30;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                case "PIÑA":
                    caloriasPorGramo=0.50;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                case "MANZANA":
                    caloriasPorGramo=0.52;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                case "NARANJA":
                    caloriasPorGramo=0.47;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                case "MANGO":
                    caloriasPorGramo=0.60;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                case "FRESA":
                    caloriasPorGramo=0.32;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                case "PLATANO":
                    caloriasPorGramo=0.89;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                case "UVA":
                    caloriasPorGramo=0.69;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                case "PERA":
                    caloriasPorGramo=0.57;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                case "DURAZNO":
                    caloriasPorGramo=0.39;
                    frutas[i].setCalorias(caloriasPorGramo);
                    break;
                default:
                    System.out.print("Cuantas calorias por gramo tiene su fruta?");
                    caloriasPorGramo=Keyboard.readDouble();
            }
            System.out.print("Cuantos gramos son de la fruta "+nombreFruta+"?" );
            gramos=Keyboard.readInt();
            frutas[i].setPeso(gramos);
            System.out.println("------------------------------");
        }
        //Imprimir lista de frutas
        System.out.println("----------LISTADO DE FRUTAS----------\nNOMBRE\t\tGRAMOS\tCALORIAS POR GRAMOS");
        for(int i=0;i<frutas.length;i++){
            System.out.println(frutas[i].getNombre()+"\t\t"+frutas[i].getPeso()+"\t\t"+frutas[i].getCalorias());
        }
        

    }
}
 