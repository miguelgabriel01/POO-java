public class Conta{
    private String titular;
    private float saldo;
    private String numero;

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        if(titular == null || titular.length() == 0){
            return;
        }
        this.titular = titular;
    }

    public float getSaldo(){
        return this.saldo;
    }

    private void setSaldo(float saldo){
        if(saldo < 0.0f){
            return;
        }
        this.saldo = saldo;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        if(numero == null || numero.length() == 0){
            return;
        }

        this.numero = numero;
    }


    public boolean Creditar(float valor){
        if(valor <= 0.0f){
            return false;
        }
        this.setSaldo(this.getSaldo() + valor);
        return true;
    }

    public boolean  Debitar(float valor){
        if(valor <= 0.0f || valor > this.getSaldo()){
            return false;
        }
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }

    public static void main(String[] args){
        Conta c1 = new Conta();
        c1.setTitular("Miguel gabriel b. dos santos");
        c1.setSaldo(255.22f);
        c1.setNumero("BOLSO2022");

        System.out.println("Dados bancarios do Usuario");
        System.out.println("Nome do titular da conta: " + c1.getTitular());
        System.out.println("Numero da conta: " + c1.getNumero());
        System.out.println("Saldo atual: " + "R$" + c1.getSaldo());
        System.out.println(" ");

        System.out.println("Processando requisições...");
        
        c1.Creditar(20.00f);
        System.out.println("Novo valor apos a aprovação do credito: " + c1.getSaldo());
        System.out.println(" ");

        c1.Debitar(150.66f);
        System.out.println("novo valor apos o Debito aprovado: " + c1.getSaldo());
        System.out.println("----------------------------------------------");
    }
}