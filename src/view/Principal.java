package view;

import java.util.Scanner;

import controller.DigitosController;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DigitosController dc = new DigitosController();

		System.out.println("Informe um n�mero: ");
		int Num = s.nextInt();
		int qtd = 0;

		int res = dc.Func_QtdDigito(Num, qtd);

		System.out.println("Quantidade de d�gitos: " + res);
	}

}
