package controller;

public class DigitosController {

	public DigitosController() {
		super();
	}

	public int Func_QtdDigito(int N, int qtd) {
		//Condição de parada -> Quando N for igual a 0, encerra a pilha de chamadas e retorna o valor de qtd
		//onde qtd é variável que armazena a quantidade de digitos calculada.
		if (N == 0) {
			return qtd;
		}
		qtd += 1;
		N /= 10;
		return Func_QtdDigito(N, qtd);
		/*
		 * A função funciona da seguinte forma:
		 *
		 * Primeiramente ela recebe como parâmetro o número digitado pelo usuário (N) e a váriavel qtd, que
		 * armazena a quantidade de dígitos. Inicialmente esta varíavel é um contador inicializado com 0.
		 * Com isso, a função começa dividindo o valor de N por 10, diminuíndo o valor de N por casas, em 10
		 * por 10, até chegar a 0 (sua condição de parada), e a cada chamada o contador vai aumentando um em
		 * um. Assim, após finalizar o processo, retorna o resultado para o usuário no console.
		 */
	}

}
