public class Filme{
    String nome;
    String genero;
    int anoDeLancamento;

    public static void main(String[] args){
        Filme f1 = new Filme();
        f1.nome = "Batman VS Superman - A origem da justiça";
        f1.genero = "Ação/Drama";
        f1.anoDeLancamento = 2016;

        System.out.println("Dados sobre o filme: ");
        System.out.println("*******************");
        System.out.println("Nome do filme: " + f1.nome);
        System.out.println("Genero: " + f1.genero);
        System.out.println("Ano de lançamento: " + f1.anoDeLancamento);
        System.out.println("*******************");
        System.out.println("Dados sobre produtora");
        System.out.println("Nome da produtora: ");
        System.out.println("Pais: ");
        System.out.println("*******************");
        System.out.println("Dados sobre diretor: ");
        System.out.println("Nome: ");
        System.out.println("Pais de origem: ");

    }
}