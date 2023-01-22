package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Program {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank;
		
		System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine(); //necessário já que faltou a quebra de linha//
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new Bank(number,holder, initialDeposit);
        } else {
            bank = new Bank(number,holder);
        }
        /* parte do deposito */
        System.out.println();
        System.out.println("Account data:");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bank.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(bank);
        /*parte do saque */
        System.out.println();
        System.out.println("Account data:");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bank.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(bank);

        sc.close();

    }
}