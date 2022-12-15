public class ContenantBuvable extends Contenant{

    public ContenantBuvable(int contenance,int rest, Ouverture ouverture){
        super(contenance,contenance,ouverture);
    }

    public void boire(int quantite){
        if(super.getTransferabilite().estTransferable(this,quantite))
            setReste(getReste() - quantite);
    }
}

