public class Camisa{
    String modelo;
    String cor;
    int tamanho;

    void MudarCor(String novaCor){
        this.cor = novaCor;
    }

    void MudarTamnho(int novoTamnho){
        this.tamanho = novoTamnho;
    }

    public static void main(String[] args){
        Camisa c1 = new Camisa();
        c1.cor = "Preta";
        c1.modelo = "esportiva";
        c1.tamanho = 25;

        Camisa c2 = new Camisa();
        c2.cor = "verde";
        c2.modelo = "Esportiva";
        c2.tamanho = 20;

        System.out.println("Detalhes sobre nossas Camisas disponiveis: ");
        System.out.println("Estoque do Shopping Rio Mar");
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Cor disponivel: " + c1.cor);
        System.out.println("Tamnho: " + c1.tamanho);
        System.out.println("   ");
        System.out.println("Estoque do Shoppinh NorthWay");
        System.out.println("Modelo: " + c2.modelo);
        System.out.println("Cor disponivel: " + c2.cor);
        System.out.println("Tamnho: " + c2.tamanho);
        System.out.println("   ");
        System.out.println("Escolha uma nova cor e tamanho para as camisas disponiveis no shopping Rio Mar");

        c1.MudarCor("Laranja");
        c1.MudarTamnho(15);


        System.out.println("carregando...");
        System.out.println("Nova cor escolhida: " + c1.cor);
        System.out.println("Novo tanho escolhido: " + c1.tamanho);
        System.out.println("   ");

        System.out.println("Escolha uma nova cor e tamanho para as camisas disponiveis no Shopping NorthWay");
        c2.MudarCor("Rosa");
        c2.MudarTamnho(20);

        System.out.println("carregando...");
        System.out.println("Nova cor escolhida: " + c1.cor);
        System.out.println("Novo tanho escolhido: " + c1.tamanho);
        System.out.println("   ");

        System.out.println("Comparando tamanho das camisas...");
        if(c1.tamanho > c2.tamanho){
            System.out.println("A camisa do Shopping Rio Mar tem o tamnho maior!");
        }else if(c2.tamanho > c1.tamanho){
            System.out.println("A camisa do Shopping NorthWay tem o tamnho maior!");
        }else{
            System.out.println("As Camisas possuem o mesmo tamanho!");
        }
    }
}