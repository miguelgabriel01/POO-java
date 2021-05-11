public class TrianguloIssoceles implements Poligono{
  private double base;
  private double altura;
  private double lado;

  public TrianguloIssoceles(double base,double altura,double lado){
    this.setAltura(altura);
    this.setBase(base);
    this.setLado(lado);
  }

  public double getBase(){
    return this.base ;
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
    if(altura <  0.0f){
      return;
    }
    this.altura = altura;
  }

  public double getLado(){
    return this.lado;
  }

  public void setLado(double lado){
    if(lado < 0.0f){
      return;
    }
    this.lado = lado;
  }

  public double area(){
    return (this.getBase() * this.getAltura())/2;
  }

  public double perimetro(){
    return 2 * (this.getLado() + this.getBase());
  }
}