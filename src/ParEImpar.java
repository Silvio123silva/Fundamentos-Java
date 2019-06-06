import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt(), par = 1, impar = 1;

        System.out.println("Numeros Pares: ");
        while(par <= num){
            if(par%2 == 0){
                System.out.println(par);
            }
            par++;
        }

        System.out.println("Numeros Impares: ");
        while(impar <= num){
            if(impar%2 != 0){
                System.out.println(impar);
            }
            impar++;
        }

    }
}