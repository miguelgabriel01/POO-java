public class Musica{
    String nome;
    String album;
    float duracao;
    int ano;
    Banda[] banda;
    public static void main(String[] args){

        Musica m1 = new Musica();
        m1.nome = "Lost in hoollwood";
        m1.album = "Hipnotize";
        m1.duracao = 5.30f;
        m1.ano = 2010;

        Banda b1 = new Banda();
        b1.nome = "System Of A Down";
        b1.pais = "Estados Unidos Da America - California";
        b1.genero = "Alternative Rock || heave metal";

        System.out.println("dados sobre a musica: ");
        System.out.println("Nome da musica: " + m1.nome);
        System.out.println("album: " + m1.album);
        System.out.println("Duração: " + m1.duracao);
        System.out.println("Ano de lançamento: " + m1.ano);
        System.out.println("Artista: " + b1.nome);
        System.out.println("Pais de origem" + b1.pais);
        System.out.println("Genero: " + b1.genero);
        System.out.println("*****************************");


    }
}