public class BouteilleRefermable extends Contenant{

    public BouteilleRefermable(int contenance){
        super(contenance,contenance,new Refermable());
    }

    public void ouvrir(){
        ((Refermable) this.getOuverture()).ouvrir();
    }

    public void fermer(){
        ((Refermable) this.getOuverture()).fermer();
    }
}
