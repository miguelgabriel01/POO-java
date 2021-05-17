public class AltaOrdem{
  public static void main(String[] args){
    Calculo soma = (a,b) -> a + b;
    System.out.println(executarOperacao(soma,1,3));
  }

  public static int executarOperacao(Calculo calculo, int a, int b){
    return calculo.cacular( a,b );
  } 
  interface Calculo{
    public int cacular(int a, int b);
  }
}