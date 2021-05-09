public class Carro{
    String modelo;
    int velocidade;

    void acelerar(int incremento){
        this.velocidade = this.velocidade + incremento;
    }

    void reduzir(int decremento){
        this.velocidade = this.velocidade - decremento;
    }


    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.modelo = "BMW 2021 Last Evolution Edition for you";
        c1.velocidade = 100;

        System.out.println("Dados sobre o veiculo:");
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Velocidade atual: " + c1.velocidade);

        c1.acelerar(50);
        System.out.println("Acelerarando... " + c1.velocidade + "KM/H");

        c1.reduzir(150);
        System.out.println("Reduzindo... " + c1.velocidade + "KM/H");

        if(c1.velocidade == 0){
            System.out.println("Desligado...");
        }

    }
}