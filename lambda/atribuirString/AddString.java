public class AddString{
  public static void main(String[] args){
    //exemplo com uma unica instrução
    //Funcao ColocarSR = valor -> "Sr. " + valor;
    //System.out.println(ColocarSR.gerar("Miguel"));

    //multiplas instruções
    Funcao ColocarSR = valor ->{
     String valorComPrefixo = "Sr. " + valor;
     String valorComPrefixoEPonto = valorComPrefixo + ".";
     return valorComPrefixoEPonto;
    };

    System.out.println(ColocarSR.gerar("Miguel gabriel"));
  }
}

@FunctionalInterface
interface Funcao{
  String gerar(String valor);
}