import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		//Lógica do jogador
		int jogador;
		Scanner mao= new Scanner (System.in);
		System.out.println("___________________");
		System.out.println("_____JoKenPo____");
		System.out.println("___________________");
		System.out.println("1.Preda");
		System.out.println("2.Papel");
		System.out.println("3.Tesoura");
		System.out.println("Digite a opção desejada: ");
		jogador = mao.nextInt();
		// Estrutura switch case admite apenas tipo int e char
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		
		}
		// Lógica do computador
		//A linha abaixo gera números aleatórios entre 0 e 2
		//(int) converte para o tipo inteiro (casting)
		//+1 soma 1 ao resultando (1 ou 2 ou 3)
		int computador = (int)(Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		//Lógica para determinar o vencedor ou empate
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
		}
		if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
			System.out.println("JOGADOR VENCEU");
		} else {
			System.out.println("COMPUTADOR VENCEU");
		}
		
		mao.close();
		

	}

}