package application;

import java.util.Scanner;

public class ImpressaoLosango {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Digite um número superior a 5:");
		int n = sc.nextInt(); if (n<5){ 
		System.out.println("Número inválido.Tente de novo"); 
		n = sc.nextInt(); } 
		int i, j;

		    for (i = 1; i < n/2; i++) { //rows
		        for (j = i; j <= n/2; j++) //columns
		            System.out.print(" ");
		        for (j = 1; j < i; j++)
		            System.out.print("*");
		        for (j = 1; j <= i; j++)
		            System.out.print("*");
		        for (j = i; j <= n/2; j++)
		            System.out.print(" ");
		        System.out.println();
		        }
		    for (i = 1; i <= n/2; i++) { //rows
		        for (j = 1; j<=i; j++) {//columns
		            System.out.print(" ");}
		        for (j = i; j <= n / 2; j++)
		            System.out.print("*");
		        for (j = i; j < n / 2; j++)
		            System.out.print("*");
		        for (j = 1; j <= i; j++)
		            System.out.print(" ");

		            System.out.println();



		    }
		    }
		
}
