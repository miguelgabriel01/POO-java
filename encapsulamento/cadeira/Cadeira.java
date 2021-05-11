public class Cadeira{
  private String marca;
  private String cor;
  private float altura;

  public String getMarca(){
    return this.marca;
  }

  public void setMarca(String marca){
    if(marca == null || marca.length() == 0){
      return;
    }
    this.marca = marca;
  }

  public String getCor(){
    return this.cor;
  }

  public void setCor(String cor){
    if(cor == null || cor.length() == 0){
      return;
    }
    this.cor = cor;
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

  public void levantar(float incremento){
    this.altura = this.altura + incremento;
  }

  public void descer(float decremento){
    this.altura = this.altura - decremento;
  }

  public static void main(String[] args){
    Cadeira c1 = new Cadeira();
    c1.setMarca("Cadeira A");
    c1.setCor("verde e preto");
    c1.setAltura(22.5f);

    System.out.println("Marca da cadeira: " + c1.getMarca());
    System.out.println("Cor: " + c1.getCor());
    System.out.println("Altura padrão: " + c1.getAltura());

    c1.levantar(27.9f);
    System.out.println("Levantando >>>>>>>");
    System.out.println("Nova altura: " + c1.getAltura());

    c1.descer(14.7f);
    System.out.println("Descendo <<<<<<<<");
    System.out.println("Nova altura: " + c1.getAltura());

  }
}