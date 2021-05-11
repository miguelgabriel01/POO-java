public class Conta{
  private String titular;
  private String numero;
  private float saldo;

  private Conta(String titular,float saldo,String numero){
    this.setTitular(titular);
    this.setSaldo(saldo);
    this.setNumero(numero);
  }

  public Conta(String titular,String numero){
    this(titular,0.0f,numero);
  }

  public String getTutular(){
    return this.titular;
  }

  public void setTitular(String titular){
    if(titular == null || titular.length() == 0){
      return;
    }
    this.titular = titular;
  }

  public float getSaldo(){
    return this.saldo;
  }

  private void setSaldo(float saldo){
   if(saldo < 0.0f){
     return;
   }
   this.saldo = saldo;
  }

  public String getNumero(){
    return this.numero;
  }

  public void setNumero(String numero){
    if(numero == null || numero.length() == 0){
      return;
    }
    this.numero = numero;
  }

  public boolean creditar(float valor){
    if(valor <= 0.0f){
      return false;
    }
    this.setSaldo(this.getSaldo() + valor);
    return true;
  }

  public boolean debitar(float valor){
    if(valor <= 0.0f || valor > this.getSaldo()){
      return false;
    }
    this.setSaldo(this.getSaldo() - valor);
    return true;
  }

  public static void main(String[] args){
    Conta c1 = new Conta("Miguel gabriel","BOLSO2022");

//    c1.creditar(250.9f);
c1.setSaldo(200.00f);
    System.out.println("Dados sobre a conta");
    System.out.println("Titular: " + c1.getTutular());
    System.out.println("Numero: " + c1.getNumero());
    System.out.println("Saldo atual: " + c1.getSaldo());
    
    c1.creditar(190.66f);
    System.out.println("Novo saldo: " + c1.getSaldo());
    
    c1.debitar(200.00f);
    System.out.println("Novo saldo: " + c1.getSaldo());
    System.out.println("---------------------");
  }
}
