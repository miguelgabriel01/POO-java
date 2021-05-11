public class Retangulo{
  private float base;
  private float altura;

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

  public float permitro(){
    return 2 * (this.base + this.altura);
  }

  public static void main(String[] args){
    Retangulo r1 = new Retangulo();

    r1.setBase(10f);
    r1.setAltura(12f);

    System.out.println("Base do retangulo 1: " + r1.getBase());
    System.out.println("Altura do retangulo 1: " + r1.getBase());
    System.out.println("Area do retangulo 1: " + r1.area());
    System.out.println("Perimetro do retangulo 1: " + r1.permitro());
    System.out.println("-----------------------------------");
    System.out.println("  ");

    Retangulo r2 = new Retangulo();

    r2.setBase(150f);
    r2.setAltura(72f);

    System.out.println("Base do retangulo 2: " + r2.getBase());
    System.out.println("Altura do retangulo 2: " + r2.getBase());
    System.out.println("Area do retangulo 2: " + r2.area());
    System.out.println("Perimetro do retangulo 2: " + r2.permitro());
    System.out.println("-----------------------------------");
  }
}