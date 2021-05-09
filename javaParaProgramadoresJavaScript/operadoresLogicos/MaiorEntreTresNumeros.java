public class MaiorEntreTresNumeros{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 12;

        if(a > b && a > c){
            System.out.println("a é a variavel com maior valor: " + a);
        }else if(b > a && b> c){
            System.out.println("b é a variavel com maior valor: " + b);
        }else if(c > a && c > b){
            System.out.println("c é a variavel com maior valor: " + c);
        }
    }
}