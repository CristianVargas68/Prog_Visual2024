package ar.edu.unju.main;
import java.util.Date;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		System.out.println("Hola mundo :D\n");
		int i=0;
		int enumeracion = 20;
		for(int j=10;i<8;j+=10) {
			enumeracion += j; 
			System.out.println("Enumeracion " + (i + 1) + " = " + enumeracion);
			i++;
		}
		

	}

}
