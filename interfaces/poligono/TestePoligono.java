public class TestePoligono{
  public static void main(String[] args){
    Poligono p1 = new Retangulo(10,20);

    System.out.println("Area: " + p1.area());
    System.out.println("Perimetro: " + p1.perimetro());

    p1 = new TrianguloIssoceles(12,8,10);

    System.out.println("Area: " + p1.area());
    System.out.println("Perimetro: " + p1.perimetro());
  }
}