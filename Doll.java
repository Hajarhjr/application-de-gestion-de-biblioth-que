package poupeeruss;

public class Doll extends Poupee {
	Doll doll;

	public Doll(int taille) {
		super(taille);
		doll = null;

	}

	@Override
	public void ouvrir() {
		if (!estoppen()) {
			setOppen(true);
			System.out.println("Open");
		} else
			System.out.println("Already open");
	}

	@Override
	public void fermer() {
		if (estoppen()) {
			setOppen(false);
			System.out.println("Closed");
		} else
			System.out.println("Already closed");
	}

//	doll.placerdans(doll1);
	@Override
	public void placerdans(Doll d) {
		if (gettaille() >= d.gettaille()) {
			System.out.println("the doll is big we can't place it");
		} else if (!d.estoppen()) {
			System.out.println(" the doll is closed");
		} else {
			System.out.println("Placement of Russian doll size " + gettaille() + " in a doll of size " + d.gettaille());
			doll = d;
		}
	}

	@Override
	public void sortirDe(Doll d) {
		if (d != doll) {
			System.out.println("The doll does not contain the other doll");
		} else {
			System.out.println(
					"Exit the russian doll with size " + gettaille() + " from the doll with size " + d.gettaille());
			doll = null;
		}

	}

}
