public class AlunoAprovado{
    public static void main(String[] args){
        int na = 1;
        int nb = 1;
        int nc = 1;
        int nd = 10;

        int media = (na + nb + nc + nd)/4;

        if(media > 7){
            System.out.println("Aluno aprovado!");
        }else if(media < 4){
            System.out.println("Aluno reprovado!");
        }else{
            System.out.println("Recuperação!");
        }
    }
}