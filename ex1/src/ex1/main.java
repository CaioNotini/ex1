package ex1;
import java.util.Scanner;

public class main {
	public static void main (String args[]){
		//Declaracao de variaveis
		int num1, num2, soma;
		Scanner sc = new Scanner(System.in);
		//Leituras
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		//Somar
		soma = num1 + num2;
		//Mostrar na tela
		System.out.println("Soma:" + soma);
		}
}
