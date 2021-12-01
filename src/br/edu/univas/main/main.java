package br.edu.univas.main;

import br.edu.univas.configuration.DatabaseConfiguration;

public class main {
	
	public static void main(String[] args) {
		DatabaseConfiguration db1 = DatabaseConfiguration.getInstance();
		System.out.println(db1.getConfiguration());
		
		DatabaseConfiguration db2 = DatabaseConfiguration.getInstance();
		System.out.println(db2.getConfiguration());		
	}
}
