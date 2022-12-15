public class BouteilleNonRefermable extends Contenant{

    public BouteilleNonRefermable(int contenant){
        super(contenant,contenant,new Ouvrable());
    }

    public void ouvrir(){
        ((Ouvrable) this.getOuverture()).ouvrir();
    }

}

/*
public class BouteilleNonRefermable extends Contenant{
    private Bouteille bouteille;

    public BouteilleNonRefermable(int contenance){
        this.bouteille = new Bouteille(contenance);
    }

    public void ouvrir() { this.bouteille.ouvrir();}

    void verserDans(int quantite, Verre verre) {
        this.bouteille.verserDans(quantite,verre);
    }
}
* */