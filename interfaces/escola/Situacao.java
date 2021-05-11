public class Situacao{
  public static void main(String[] args){
    Aluno a1 = new Aluno(8.8F,9.4f);

    System.out.println("Nota do aluno: " + a1.media());
    System.out.println("Resultado final: ");
    if(a1.media() > 7.0f){
      System.out.println("Aluno aprovado!");
    }else{
      System.out.println("Aluno reprovado!");
    }
  }
}