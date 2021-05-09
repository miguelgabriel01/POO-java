public class Temperatura{
    public static void main(String[] args){
        int temperatura = 25;

        if(temperatura  < 15){
            System.out.println("O clima esta frio!");
        }else if(temperatura > 30){
            System.out.println("O clima esta quente!");
        }else{
            System.out.println("Clima normal!");
        }
    }
}