public abstract class Poupee {
    private int taille;
    private boolean oppen;



    public int gettaille(){
        return taille;
    }
    public void setTaille(){
        this.taille=taille;

    }
    public boolean estoppen(){
        return oppen;
    }
    public boolean setOppen(boolean oppen){
        this.oppen=oppen;

        return oppen;
    }

    public Poupee(int taille){
        this.taille=taille;
        this.oppen =false;
    }

    public abstract  void ouvrir();

    public  abstract void fermer();


    public abstract void placerdans(Doll d);

    public abstract void sortirDe(Doll d);

}
