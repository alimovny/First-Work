package uz.pdp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in);
				
				System.out.print("Enter your birthday (YYYY-MM-DD): ");
				String birthdayString = input.nextLine();
				LocalDate birthday = LocalDate.parse(birthdayString);
				
				LocalDate today = LocalDate.now();
				
				long daysSinceBirthday = ChronoUnit.DAYS.between(birthday, today);
				
				System.out.println("Days since your birthday: " + daysSinceBirthday);
	}
}