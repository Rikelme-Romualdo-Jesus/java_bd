import java.util.Scanner;
public class Principal {
    public static void main (String [] args ) {

        System.out.println("bom dia ");


        Scanner sc = new Scanner (System.in);

        System.out.println("digite nome ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade ");
        int idade = sc.nextInt();

        Conexao co = new Conexao();
        co.inserirPessoa(nome,idade);
    }
}