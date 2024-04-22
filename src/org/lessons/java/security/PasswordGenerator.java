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
		
		System.out.println("inserisci il tuo giorno di nascita");
		int giorno = input.nextInt();
		
		System.out.println("inserisci il tuo mese di nascita");
		int mese = input.nextInt();
		
		System.out.println("inserisci il tuo anno di nascita");
		int anno = input.nextInt();
		
		int data = (giorno + mese + anno); 
		
		System.out.println("La tua nuova passward è : " + "-" + nome 
				+ "-" + cognome + "-" + colore + "-" + data );
	}

}
