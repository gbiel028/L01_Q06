import java.util.Scanner;
public class L01_Q06 {

	public static void main(String[] args) {
double num01, num02;
		
		Scanner lerNum = new Scanner(System.in);
		
		System.out.println("Primeiro numero: ");
		num01 = lerNum.nextDouble();
		System.out.println("Segundo numero: ");
		num02 = lerNum.nextDouble();
		
		System.out.println("Somando: " + num01 + "+" + num02 + "=" + (num01 + num02));
		System.out.println("Subtração: " + num01 + "-" + num02 + "=" + (num01 - num02));
		System.out.println("Multiplicação: " + num01 + "*" + num02 + "=" + (num01 * num02));
		System.out.printf("Divisão:", num01, num02, (num01 / num02));
		
		lerNum.close();
	}

}
