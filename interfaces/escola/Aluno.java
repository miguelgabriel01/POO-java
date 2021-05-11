public class Aluno{
  private float notaA;
  private float notaB;

  public Aluno(float notaA, float notaB){
    this.setNotaA(notaA);
    this.setNotaB(notaB);
  }

  public float getNotaA(){
    return this.notaA;
  }

  public float getNotaB(){
    return this.notaB;
  }

  public void setNotaA(float notaA){
    if(notaA < 0.0f){
      return;
    }
    this.notaA = notaA;
  }

  public void setNotaB(float notaB){
    if(notaB < 0.0f){
      return;
    }
    this.notaB = notaB;
  }

  public float media(){
    return (this.getNotaA() + this.getNotaB())/2;
  }
}