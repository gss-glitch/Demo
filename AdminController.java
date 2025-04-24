package Com.Exponent.BankApp.controller;

import java.util.List;
import java.util.Scanner;

import Com.Exponent.BankApp.service.RBI;
import Com.Exponent.BankApp.serviceimpl.SBI;

public class AdminController {

	private static int getgexception() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice:-");
		int ch;
		try {
			ch = sc.nextInt();

		} catch (Exception e) {
			System.out.println("Enter Valid choice ");
			return getgexception();

		}
		return ch;

	}

	public static void main(String[] args) {
		// this is our entry point in core java

		System.out.println("***********WELCOME TO SBI BANK**************");

		// To take input from user >>input user

		RBI rbi = new SBI();// WE make this object to call data from sbi by loose coupling

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		// we need to create choices for user and we need to show repeatedly to user
		// that's why we use loop
		while (flag) {
			// we are creating choices for user and ans by using switch case

			System.out.println("**************************************************************");

			System.out.println(" 1.CREATE BANK ACCOUNT");
			System.out.println("2.SHOW ACCOUNT DETAILS");
			System.out.println("3.SHOW ACCOUNT BALANCE");
			System.out.println("4.DEPOSITE MONEY");
			System.out.println("5.WITHDRAW MONEY");
			System.out.println("6.UPDATE ACCOUNT DETAILS");
			System.out.println("7.EXIT");

			System.out.println("**************************************************************");

			int ch = getgexception();

			// now we are creating switch case to link above choice to methods
			// we are passing value of user to validate condition

			switch (ch) {
			case 1:

				// we calling rbi overrided method by using line 17 obj//linking to method
				// when user enter 1-7 no then this cases will be execute
				rbi.createAccount();

				break;

			case 2:
				rbi.showAccountDetials();
				break;

			case 3:
				rbi.showAccountBalance();
				break;

			case 4:
				rbi.depositeMoney();
				break;

			case 5:
				rbi.withdrawMoney();
				break;

			case 6:
				rbi.updateAccountDetials();
				break;

			case 7:
				flag = false;
				break;

			default:
				System.out.println("Enter Valid Input/Value");

				break;
			}

		}
		// we need to close all java resources used by us
		// we need to close scanner class after use manually //JVM not close for us
//		sc.close();

		System.out.println("***********Thank You For Banking With SBI************");

	}

}
