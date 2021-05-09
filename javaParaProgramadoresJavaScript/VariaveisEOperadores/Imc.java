public class Imc{
    
    public static void main(String[] args){
        float peso = 54.500f;
        float altura = 1.65f;
        float resposta;

        resposta = peso / (altura * altura);

        System.out.println("Resultado do IMC:");
        System.out.println(resposta);
        System.out.println("***************************");
    }
}