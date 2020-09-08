package sistemadeequações;

import java.util.Locale;
import java.util.Scanner;

public class EquaçõesLineares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double a, b, c, d, eh, f, x, y;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com o valor de A: ");
		a = teclado.nextDouble();
		System.out.print("Entre com o valor de B: ");
		b = teclado.nextDouble();
		System.out.print("Entre com o valor de C: ");
		c = teclado.nextDouble();
		System.out.print("Entre com o valor de D: ");
		d = teclado.nextDouble();
		System.out.print("Entre com o valor de E: ");
		eh = teclado.nextDouble();
		System.out.print("Entre com o valor de F: ");
		f = teclado.nextDouble();
		
		x = (c*eh - b*f)/(a*eh - b*d);
		y = (a*f - c*d)/(a*eh - b*d);
		
		System.out.printf("Valor de X: %.2f", x);
		System.out.printf("\nValor de Y: %.2f", y);
		
		teclado.close();
	}

}
