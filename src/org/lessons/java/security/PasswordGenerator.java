package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("inserisci il tuo nome");
		String nome = scan.nextLine();
		
		System.out.println("inserisci il tuo cognome");
		String cognome = scan.nextLine();
		
		System.out.println("inserisci il tuo colore preferito");
		String colore = scan.nextLine();
		
		System.out.println("inserisci il tuo giorno di nascita");
		int giorno = scan.nextInt();
		
		System.out.println("inserisci il tuo mese di nascita");
		int mese = scan.nextInt();
		
		System.out.println("inserisci il tuo anno di nascita");
		int anno = scan.nextInt();
		
		int data = (giorno + mese + anno); 
		
		System.out.println("La tua nuova passward è : " + nome 
				+ "-" + cognome + "-" + colore + "-" + data );
	}

}
