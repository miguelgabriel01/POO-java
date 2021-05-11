public class Paciente{
  private float altura;
  private float peso;

  public Paciente(float peso,float altura){
    this.setAltura(altura);
    this.setPeso(peso);
  }

  public float getAltura(){
    return this.altura;
  }

  public void setAltura(float altura){
    if(altura < 0.0f){
      return;
    }
    this.altura = altura;
  }

  public float getPeso(){
    return this.peso;
  }

  public void setPeso(float peso){
    if(peso < 0.0f){
      return;
    }
    this.peso = peso;
  }

  public float imc(){
    return (this.getPeso() * this.getAltura())/2;
  }
}