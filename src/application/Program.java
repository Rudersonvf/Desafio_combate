package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = scan.next();
		System.out.print("Vida inicial: ");
		int life = scan.nextInt();
		System.out.print("Ataque: ");
		int attack = scan.nextInt();
		System.out.print("Armadura: ");
		int armor = scan.nextInt();
		System.out.println();
		
		Champion champ1 = new Champion(name, life, attack, armor);
		
		System.out.println("Digite os dados do Segundo campeão: ");
		System.out.print("Nome: ");
		name = scan.next();
		System.out.print("Vida inicial: ");
		life = scan.nextInt();
		System.out.print("Ataque: ");
		attack = scan.nextInt();
		System.out.print("Armadura: ");
		armor = scan.nextInt();
		
		Champion champ2 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.print("Quantos turnos deseja executar? ");
		int n = scan.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Resultado do turno %d%n", ++i);
			--i;
			System.out.println(champ1.status());
			System.out.println(champ2.status());
			System.out.println();
		}
		
		System.out.println("FIM DO COMBATE");		
		scan.close();
	}

}
