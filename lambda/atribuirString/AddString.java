public class AddString{
  public static void main(String[] args){
    Funcao ColocarSR = valor -> "Sr. " + valor;
    System.out.println(ColocarSR.gerar("Miguel"));
  }
}

@FunctionalInterface
interface Funcao{
  String gerar(String valor);
}