package uz.pdp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String str = scanner.nextLine();
		
		for (int i = 0; i <= 16; i++) {
			System.out.println("You -> " + str);
		}
		System.out.println("Hello UZB");
		for (int i = 0; i < 100; i++) {
			System.out.print(i+" ");
		}
		
	}
}
