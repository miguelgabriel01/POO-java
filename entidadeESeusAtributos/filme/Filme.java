public class Filme{
    String nome;
    String genero;
    int anoDeLancamento;

    public static void main(String[] args){
        Filme f1 = new Filme();
        f1.nome = "Batman VS Superman - A origem da justiça";
        f1.genero = "Ação/Drama";
        f1.anoDeLancamento = 2016;

        Diretor d1 = new Diretor();
        d1.nome = "Zack Snyder";
        d1.pais = "Estados Unidos Da america - USA";

        Produtora p1 = new Produtora();
        p1.nome = "DC comics || wayner bross";
        p1.pais = "Estados Unidos Da America - USA";

        System.out.println("Dados sobre o filme: ");
        System.out.println("*******************");
        System.out.println("Nome do filme: " + f1.nome);
        System.out.println("Genero: " + f1.genero);
        System.out.println("Ano de lançamento: " + f1.anoDeLancamento);
        System.out.println("*******************");
        System.out.println("Dados sobre produtora");
        System.out.println("Nome da produtora: " + p1.nome);
        System.out.println("Pais: " + p1.pais);
        System.out.println("*******************");
        System.out.println("Dados sobre diretor: ");
        System.out.println("Nome: " + d1.nome);
        System.out.println("Pais de origem: " + d1.pais);

    }
}