public class Celular{
    String modelo;
    String cor;
    float valor;
    String sistema;
    boolean garantia; 
    public static void main(String[] args){

        Celular c1 = new Celular();
        c1.modelo = "Samsung A10";
        c1.cor = "Azul escuro";
        c1.valor = 788.85f;
        c1.sistema = "Android 9.7";
        c1.garantia = true;

        Vendedor v1 = new Vendedor();
        v1.nome = "Casas Bahia";
        v1.pais = "Brasil";
        v1.estado = "Pernambuco";
        v1.cidade = "Igarassu";
        v1.cnpj = "FRTTR-220112554";

/*         if(c1.garantia == true){
            String garantia;
            c1.garantia = "Garantia de fabrica!";
        }else{
            String garantia;
            c1.garantia = "garantia indiponivel!";
        } */

        System.out.println("Informações sobre dispositivo: ");
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Cor: " + c1.cor);
        System.out.println("Valor: " + c1.valor);
        System.out.println("Sistema operacional: " + c1.sistema);
        System.out.println("Estatus da garantia: " + c1.garantia);
        System.out.println("Vendido por: " + v1.nome);
        System.out.println("Pais: " + v1.pais);
        System.out.println("Estado: " + v1.estado);
        System.out.println("Cidade: " + v1.cidade);
        System.out.println("Cnpj da Empresa: " + v1.cnpj);
        System.out.println("********************************");


    }
}