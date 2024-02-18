package poupeeruss;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IllegalStateException {

		Doll doll = new Doll(12);
		Doll doll1 = new Doll(10);
		Doll doll2 = new Doll(9);
		Scanner scanner = new Scanner(System.in);
		int choix;
		do {

			System.out.println("MENU");
			System.out.println("1 to open a doll");
			System.out.println("2 to close ad doll");
			System.out.println("3 Place one doll inside another");
			System.out.println("4 Take a doll out of a doll");
			System.out.println("0 to leave");
			System.out.println("Here are all the dolls");
			System.out.println("give your choice");
			choix = scanner.nextInt();
			scanner.nextLine();

			switch (choix) {
			case 1:
				System.out.println("The size of the first doll is " + " " + doll.gettaille());
				System.out.println("The size of the second doll is " + " " + doll1.gettaille());
				System.out.println("The size of the third doll is" + " " + doll2.gettaille());
				System.out.println("enter 1 if you want to oppen the first doll");
				System.out.println("enter 2 if you want to oppen the second doll");
				System.out.println("enter 3 if you wqant to oppen the thirth doll");
				int taille = scanner.nextInt();
				scanner.nextLine();

				if (taille == 1) {
					doll.ouvrir();
				} else if (taille == 2 ) {
					doll1.ouvrir();
				} else if (taille == 3) {
					doll2.ouvrir();
				}
				break;
			case 2:
				System.out.println("The size of the first doll is " + " " + doll.gettaille());
				System.out.println("The size of the second doll is " + " " + doll1.gettaille());
				System.out.println("The size of the third doll is" + " " + doll2.gettaille());
				System.out.println("enter 1 if you want to close the first doll");
				System.out.println("enter 2 if you want to close the second doll");
				System.out.println("enter 3 if you wqant to close the thirth doll");
				int taille1 = scanner.nextInt();
				scanner.nextLine();

				if (taille1 == 1) {
					doll.fermer();
				} else if (taille1 == 2) {
					doll1.fermer();
				} else if (taille1 == 3)
					doll2.fermer();

				break;
			case 3:
				System.out.println("Press 1 if you want the size of the first doll : " + " " + doll.gettaille());
				System.out.println("Press 2 if you want the size of the second doll : " + " " + doll1.gettaille());
				System.out.println("Press 3 if you want the size of the third doll : " + " " + doll2.gettaille());
				System.out.println("Choses main doll");
				int size = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Choses the doll that you want to put in the main doll");
				int size1 = scanner.nextInt();
				scanner.nextLine();
				if (size == 1 && size1 == 2) {
					doll1.placerdans(doll);
				}else if (size == 1 && size1 == 3) {
					doll2.placerdans(doll);
				}else if (size == 2 && size1 == 3) {
					doll1.placerdans(doll2);
				}
				else {
					System.out.println("You can't place this doll");
				}
				break;
			case 4:
				System.out.println("Press 1 if you want the size of the first doll : " + " " + doll.gettaille());
				System.out.println("Press 2 if you want the size of the second doll : " + " " + doll1.gettaille());
				System.out.println("Press 3 if you want the size of the third doll : " + " " + doll2.gettaille());
				System.out.println("Choses main doll");
				int sizeClose = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Choses the doll that you want to put in the main doll");
				int size1Close = scanner.nextInt();
				scanner.nextLine();
				if (sizeClose == 1 && size1Close == 2) {
					doll1.sortirDe(doll);
				}else if (sizeClose == 1 && size1Close == 3) {
					doll2.sortirDe(doll);
				}else if (sizeClose == 2 && size1Close == 3) {
					doll1.sortirDe(doll2);
				}
				else {
					System.out.println("Doll not founded");
				}
				break;

			default:
				throw new IllegalStateException("an error: " + choix);

			}
		} while (choix != 0);
	}

}