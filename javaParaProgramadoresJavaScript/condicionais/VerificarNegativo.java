public class VerificarNegativo{
   public static void main(String[] args){
    int a = 10;
    int b = 25;
    int mult = a*b;

    if(mult < 0){
        System.out.println("Resultado negativo!");
    }else{
        System.out.print("Resultado positivo!");
    }

   }
}