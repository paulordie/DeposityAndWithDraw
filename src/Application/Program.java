package Application;

import entities.Account;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args){

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Account account;

        System.out.print("Digite uma conta: ");
        int conta = sc.nextInt();


        sc.nextLine();
        System.out.print("Nome do titular da conta: ");
        String nome = sc.nextLine();

        System.out.print("Deseja fazer deposito inicial (y/n))? ");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.printf("coloque o valor inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(conta, nome, initialDeposit);
        } else {
            account = new Account(conta, nome);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("entre com um valor para deposito ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("A conta foi atualizada");
        System.out.println(account);

        System.out.print("entre com um valor para saque ");
        double withDraw = sc.nextDouble();
        account.withdraw(withDraw);
        System.out.println("A conta foi atualizada");
        System.out.println(account);

    sc.close();


    }
}