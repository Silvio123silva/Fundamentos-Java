import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		System.out.println("=====TABUADA=====");
		Scanner leia = new Scanner(System.in);
		//importar <crtl><shift><o>
		int valor;
		System.out.print("Digite o valor da tabuada:  ");
		valor = leia.nextInt();
		System.out.print("");
		// estrutura de repeti��o for
		for (int i = 0; i <= 10 ; i++) {
			System.out.println(valor + " x " + i + " = " + (valor *i));
		}
		leia.close();

	}

}
