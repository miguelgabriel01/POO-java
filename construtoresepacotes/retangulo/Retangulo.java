public class Retangulo{
  private float base;
  private float altura;

  public Retangulo(float base,float altura){
    this.setBase(base);
    this.setAltura(altura);
  }

  public float getBase(){
    return this.base;
  }

  public void setBase(float base){
    if(base < 0.0f){
      return;
    }
    this.base = base;
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

  public float area(){
    return this.base * this.altura;
  }

  public float perimetro(){
    return 2*(this.base + this.altura);
  }

  public static void main(String[] args){
    Retangulo r1 = new Retangulo(12,2);

    System.out.println("Area: " + r1.area());
    System.out.println("Perimetro: " + r1.perimetro());
  }
}