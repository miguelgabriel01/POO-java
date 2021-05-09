public class Carro{
    String modelo;
    String cor;
    int portas;

    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.modelo = "BMW 2000 || Evolution Edition";
        c1.cor = "Preto || Verde";
        c1.portas = 2;

        System.out.println("***********************");
        System.out.println("Dados sobre o veiculo: ");
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Cores disponiveis: " + c1.cor);
        System.out.println("Numero de portas: " + c1.portas);
        System.out.println("***********************");
    }
}