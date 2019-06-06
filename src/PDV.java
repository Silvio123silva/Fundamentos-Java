import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		
		//Date trabalhar com Data 
		Date data = new Date();
		//Formatar a data 
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL); // FULL exibe data e hora 
		DecimalFormat resultado = new DecimalFormat("#0.00");
		double total,desconto = 0,totaldesconto,pago,troco;
		Scanner leia = new Scanner(System.in);
			System.out.println(formatador.format(data));
			System.out.println("=====================");
			System.out.println("========PDV==========");
			System.out.println("=====================");
			System.out.println("");
			System.out.println("Valor total:");
			total = leia.nextDouble();
			System.out.print("Desconto em %:");
			desconto = leia.nextDouble();
			totaldesconto = total - (desconto * total)/100;
			System.out.println("Total com desconto:" + resultado.format(totaldesconto));
			System.out.println("__________________");
			System.out.println("");
			System.out.println("Valor pago:");
			pago = leia.nextDouble();
			troco = pago - totaldesconto;
			System.out.println("Troco:" + troco);
			
	}

}