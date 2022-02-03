public class PruebasQA {
    public static void main(String[] args) {
        int r=0;
        try{
            System.out.println("A");
            r=Keyboard.readInt();
        }finally{
            System.out.println("Segundo");
            r=Keyboard.readInt();
        }
    }
}
