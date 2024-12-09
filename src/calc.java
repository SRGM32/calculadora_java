import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha uma operação");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Divisão");
		System.out.println("4. Multiplicação");
		
		System.out.println("Digite um número para a operação desejada");
		int operacao = sc.nextInt();
		
		System.out.println("Digite o primeiro número");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite outro número");
		double num2 = sc.nextDouble();
		
		double resultado = 0;
		
		switch(operacao) {
		case 1:
			resultado = num1 + num2;
			System.out.println("A soma é : " + resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.println("A subtração é: " + resultado);
			break;
		case 3: if (num2 != 0){
			
			resultado = num1 / num2;
			System.out.println("A divisão é: " + resultado);
		} else {
			System.out.println("Não é possível dividir um número por 0");
		}
			break;
		case 4:
			resultado = num1 * num2;
			System.out.println("A multiplicação é: " + resultado);
			break;
		default:
			System.out.println("operação inválida");
		}
			
		
		sc.close();
	}

}
