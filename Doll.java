public class Doll extends Poupee{
Doll doll;
    public Doll(int taille) {
        super(taille);
        doll=null;

    }

    @Override
    public void ouvrir() {
if (!estoppen()){
    setOppen(true);
    System.out.println("ouvert");
}System.out.println(" deja ouvert");
    }

    @Override
    public void fermer() {
      if(estoppen()){
          setOppen(false);
          System.out.println("fermer");
      }else System.out.println("deja fermer");
    }



    @Override
    public void placerdans(Doll d) {

    }

    @Override
    public void sortirDe(Doll d) {

    }
}
