public class AltaOrdem{
  public static void main(String[] args){
    Calculo soma = (a,b) -> a + b;
    Calculo divisao = (a,b) -> a / b;
    Calculo multiplicacao = (a,b) -> a * b;
    Calculo subtracao = (a,b) -> a - b;

    System.out.println("Resultado da soma: " + executarOperacao(soma,1,3));
    System.out.println("Resultado da divisão: " + executarOperacao(divisao,1,3));
    System.out.println("Resultado da multiplicação: " + executarOperacao(multiplicacao,1,3));
    System.out.println("Resultado da subtração: " + executarOperacao(subtracao,1,3));
  }

  public static int executarOperacao(Calculo calculo, int a, int b){
    return calculo.cacular( a,b );
  } 
  interface Calculo{
    public int cacular(int a, int b);
  }
}