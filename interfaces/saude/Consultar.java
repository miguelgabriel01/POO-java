public class Consultar{
  public static void main(String[] args){
    Paciente paciente1 = new Paciente(55.333f,1.60f);

    System.out.println("Dados sobre o Paciente");
    System.out.println("IMC atual: " + paciente1.imc());
    System.out.println(" ");
    System.out.println("-----------------------");
  }
}