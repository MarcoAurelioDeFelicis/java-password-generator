package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("inserisci il tuo nome");
		String nome = input.nextLine();
		
		System.out.println("inserisci il tuo cognome");
		String cognome = input.nextLine();
		
		System.out.println("inserisci il tuo colore preferito");
		String colore = input.nextLine();
		
		System.out.println("inserisci la tua data di nascita in numeri");
		int data = input.nextInt();
		
		System.out.println("La tua nuova passward è : " + "-" + nome 
				+ "-" + cognome + "-" + colore + "-" + data);
	}

}
