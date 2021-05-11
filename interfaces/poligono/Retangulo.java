public class Retangulo implements Poligono{
  private double base;
  private double altura;

  public Retangulo(double base, double altura){
    this.setBase(base);
    this.setAltura(altura);
  }

  public double getBase(){
    return this.base;
  }

  public void setBase(double base){
    if(base < 0.0f){
      return;
    }
    this.base = base;
  }

  public double getAltura(){
    return this.altura;
  }

  public void setAltura(double altura){
    if(altura < 0.0f){
      return;
    }
    this.altura = altura;
  }

  public double area(){
    return this.getBase() * this.getAltura();
  }

  public double perimetro(){
    return 2 * (this.getBase() + this.getAltura());
  }
}