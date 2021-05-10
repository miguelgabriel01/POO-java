public  class Musica{
    private String nome;
    private String genero;
    private int ano;
    private float duracao;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.length() == 0){
            return;
        }
        this.nome = nome;
    }

    public String getGenero(){
        return this.genero;
    }
  
    public void setGenero(String genero){
        if(genero == null || genero.length() == 0){
            return;
        }
        this.genero = genero;
    }

    public float getDuracao(){
        return this.duracao;
    }

    public void setDuracao(float duracao){
        if(duracao <0.0f){
            return;
        }
       this.duracao = duracao;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        if(ano < 0){
            return;
        }
        this.ano = ano;
    }

    public void ProximaMusica(float incremento){
        this.duracao = this.duracao + incremento;
    }

    public void VoltarMusica(float decremento){
        this.duracao = this.duracao - decremento;
    }

    public static void main(String[] args){
        Musica m1 = new Musica();
        m1.setNome("Lost in Hollwood");
        m1.setGenero("Rock alternativo");
        m1.setAno(2016);
        m1.setDuracao(120.0f);

        System.out.println("Detalhes sobre a musica");
        System.out.println("Nome: " + m1.getNome());
        System.out.println("Genero: " + m1.getGenero());
        System.out.println("Duração: " + m1.getDuracao());
        System.out.println("Ano de lançamento: " + m1.getAno());
        System.out.println("-----------------------------");

        m1.ProximaMusica(30f);
        System.out.println("Duração >>>>>>>>  " + m1.getDuracao());
        m1.VoltarMusica(60f);
        System.out.println("Duração <<<<<<<<  " + m1.getDuracao());

    }

}