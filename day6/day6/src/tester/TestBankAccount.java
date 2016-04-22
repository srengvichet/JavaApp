package tester;

import java.util.Date;
import java.util.Scanner;

import com.core.banking.BankAccount;

import static utils.AccountValidationUtils.*;

public class TestBankAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			try {
				System.out
						.println("Enter A/c Info : nm type bal date day-mon-yr");
				// validation rules
				String nm = sc.next();
				String type = sc.next();
				double bal = sc.nextDouble();
				String date = sc.next();
				validateType(type);
				validateBalance(bal);
				Date parsedNValidatedDate = validateDate(date);
				BankAccount a1 = new BankAccount(nm, type, bal,
						parsedNValidatedDate);
				// show summary
				System.out.println("A/C summary " + a1);
				System.out.println("Enter withdrawl amt");
				a1.withdraw(sc.nextDouble());
				System.out.println("A/C summary post withdraw" + a1);
				exit=true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		sc.close();

	}

}
