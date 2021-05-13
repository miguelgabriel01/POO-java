public class Retangulo{
  private double base;
  private double altura;

   //conta quantos retangulos foram criados
  private static int retCriados = 0;

  public Retangulo(double base, double altura){
    this.base = base;
    this.altura = altura;
  
    //qualquer metodo da classe pode alterar o atributo
    Retangulo.retCriados++;
  }

  public static int getRetCriados(){
    return Retangulo.retCriados;
  }

  public static void main(String[] args){
    Retangulo r1 = new Retangulo(10,3);
    Retangulo r2 = new Retangulo(50,3);
    Retangulo r3 = new Retangulo(4,3);
    Retangulo r4 = new Retangulo(1,1);

    System.out.println("Criados: " + Retangulo.getRetCriados());
  }


}