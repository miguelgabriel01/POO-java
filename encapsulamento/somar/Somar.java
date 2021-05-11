public class Somar{
  private int numeroA;
  private int numeroB;

  public int getNumeroA(){
    return this.numeroA;
  }
  public void setNumeroA(int numeroA){
    if(numeroA < 0){
      return;
    }
    this.numeroA = numeroA;
  }

  public int getNumeroB(){
    return this.numeroB;
  }

  public void setNumeroB(int numeroB){
    if(numeroB < 0){
      return;
    }
    this.numeroB = numeroB;
  }

  public int conta(){
    return this.numeroB + this.numeroA;
  }

  public static void main(String[] args){
    Somar s1 = new Somar();
    s1.setNumeroA(20);
    s1.setNumeroB(30);

    System.out.println("Valor da variavel numeroA: " + s1.getNumeroA());
    System.out.println("Valor da variavel numeroB: " + s1.getNumeroB());
    System.out.println("Somando......");
    System.out.println("Resultado: " + s1.conta());
  }
}