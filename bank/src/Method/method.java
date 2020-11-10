package Method;

import java.util.Scanner;

public class method {
	private String accno;
    private String name;
    private long balance;

    Scanner KB = new Scanner(System.in);

    //method to open an account
   public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = KB.next();
        System.out.print("Enter Name: ");
        name = KB.next();
        System.out.print("Enter Balance: ");
        balance = KB.nextLong();
    }

    //method to display account details
   public void showAccount() {
        System.out.println("Account number : " +accno +"\n" + "Name:  "+ name + "\n" + "Balance :  "+ balance);
    }

    //method to deposit money
   public void deposit() {
        long amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt = KB.nextLong();
        balance = balance + amt;
        System.out.println("The new balance is   " +balance);
    }

    //method to withdraw money
   public void withdrawal() {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = KB.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("The new balance is   "+ balance);
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }

    //method to search an account number
   public boolean search(String acn) {
        if (accno.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}
