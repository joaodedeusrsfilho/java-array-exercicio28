package aula19_Arrays;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		/*
		 * Ler um vetorA com 10 elementos e construir um vetor B de mesmo tipo e tamanho
		 * e com os mesmos elementos de A, sendo que estes deverão estar invertidos, ou
		 * seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento
		 * de A passa a ser o penúltimo de B e assim por diante
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Entre com o valor da posicao " + (x + 1));
			vetorA[x] = ler.nextInt();
			vetorB[vetorA.length - 1 - x] = vetorA[x];
		}

		System.out.print("VetorA = ");
		for (int x = 0; x < vetorA.length; x++) {
			System.out.print(vetorA[x] + " ");
		}
		System.out.println();
		System.out.print("VetorB = ");
		for (int x = 0; x < vetorB.length; x++) {
			System.out.print(vetorB[x] + " ");
		}
	}
}
