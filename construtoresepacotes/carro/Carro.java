public class Carro{
  private String modelo;
  private float velocidade;

  private Carro(String modelo, float velocidade){
    this.setModelo(modelo);
    this.setVelocidade(velocidade);
  }

  public Carro(String modelo){
    this(modelo,0.0f);
  }

  public String getModelo(){
    return this.modelo;
  }

  public void setModelo(String modelo){
    if(modelo == null || modelo.length() == 0){
      return;
    }
    this.modelo = modelo;
  }

  public float getVelocidade(){
    return this.velocidade;
  }

  private void setVelocidade(float velocidade){
    if(velocidade < 0.0f){
      return;
    }
    this.velocidade = velocidade;
  }

  public void MudarModelo(String novoModelo){
    this.modelo = novoModelo;
  }

  public void MudarVelocidade(float novaVelocidade){
    this.velocidade = novaVelocidade;
  }

  public static void main(String[] args){
    Carro c1 = new Carro("BMW",300.0f);

    System.out.println("Modelo: " + c1.getModelo());
    System.out.println("Velocidade Maxima: " + c1.getVelocidade());

    c1.MudarVelocidade(200.55f);
    System.out.println("Nova velocidade: " + c1.getVelocidade());

    c1.MudarModelo("Ferrari");
    System.out.println("Novo modelo: " + c1.getModelo());
    System.out.println("----------------------------");
  }
}