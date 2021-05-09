public class Camisa{
    String cor;
    String modelo;
    float valor;

    public static void main(String[] args){
        Camisa c1 = new Camisa();
        c1.cor = "Preta com detalhes em Branco";
        c1.modelo = "Esportiva";
        c1.valor = 250.33f;

        Marca m1 = new Marca();
        m1.nome = "Adidas";
        m1.pais = "União sovietica";

        System.out.println("Dados sobre a camisa: ");
        System.out.println("Cor: " + c1.cor);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Valor por unidade: " + c1.valor);
        System.out.println("Marca: " + m1.nome);
        System.out.println("Pais de origem: " + m1.pais);
        System.out.println("**************************");
    }
}