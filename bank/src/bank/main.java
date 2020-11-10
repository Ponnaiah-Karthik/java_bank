package bank;

import java.util.Scanner;

import Method.method;

public class main {

	public static void main(String[] args) {
	      Scanner KB = new Scanner(System.in);
	          method m =new method();
	        //create initial accounts
	        System.out.print("No of customers : ");
	        int n = KB.nextInt();
	        method C[] = new method[n];
	        for (int i = 0; i < C.length; i++) {
	            C[i] = new method();
	            C[i].openAccount();
	        }
            
	        //run loop until menu 5 is not pressed
	        int ch;
	        
	        do {
	            System.out.println("Main Menu\n 1. Display All\n 2. Search By Account\n 3. Deposit\n 4. Withdrawal\n 5. Exit ");
	                System.out.println("Ur Choice :"); ch = KB.nextInt();
	                switch (ch) {
	                    case 1:
	                        for (int i = 0; i < C.length; i++) {
	                            C[i].showAccount();
	                        }
	                        break;

	                    case 2:
	                        System.out.print("Enter Account No U Want to Search: ");
	                        String acn = KB.next();
	                        boolean found = false;
	                        for (int i = 0; i < C.length; i++) {
	                            found = C[i].search(acn);
	                            if (found) {
	                                break;
	                            }
	                        }
	                        if (!found) {
	                            System.out.println("Search Failed..Account Does Not Exist..");
	                        }
	                        break;

	                    case 3:
	                        System.out.print("Enter Account No : ");
	                        acn = KB.next();
	                        found = false;
	                        for (int i = 0; i < C.length; i++) {
	                            found = C[i].search(acn);
	                            if (found) {
	                                C[i].deposit();
	                                break;
	                            }
	                        }
	                        if (!found) {
	                            System.out.println("Search Failed..Account Not Exist..");
	                        }
	                        break;

	                    case 4:
	                        System.out.print("Enter Account No : ");
	                        acn = KB.next();
	                        found = false;
	                        for (int i = 0; i < C.length; i++) {
	                            found = C[i].search(acn);
	                            if (found) {
	                                C[i].withdrawal();
	                                break;
	                            }
	                        }
	                        if (!found) {
	                            System.out.println("Search Failed..Account Not Exist..");
	                        }
	                        break;

	                    case 5:
	                        System.out.println("exit");
	                        break;
	                }
	            }
	            while (ch != 5);
	        }
}
