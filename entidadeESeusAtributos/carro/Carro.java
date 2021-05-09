public class Carro{
    String modelo;
    String cor;
    int portas;
    float valor;
    Montadora[] montadora;
    Origem[] origem;

    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.modelo = "BMW 2000 || Evolution Edition";
        c1.cor = "Preto || Verde";
        c1.portas = 2;
        c1.valor = 50.545f;

        Montadora m1 = new Montadora();
        m1.nome = "BMW";
        m1.seguimento = "Esportivos || luxo";

        Origem o1 = new Origem();
        o1.pais = "Italia || Europa";

        System.out.println("***********************");
        System.out.println("Dados sobre o veiculo: ");
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Cores disponiveis: " + c1.cor);
        System.out.println("Numero de portas: " + c1.portas);
        System.out.println("Valor do vaiculo: " + c1.valor);
        System.out.println("***********************");
        System.out.println("Dados sobre a montadora: ");
        System.out.println("Montadora: " + m1.nome);
        System.out.println("Seguimento: " + m1.seguimento);
        System.out.println("Pais de origem: " + o1.pais);
        System.out.println("***********************");
    }
}