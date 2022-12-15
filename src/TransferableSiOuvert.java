public class TransferableSiOuvert implements Transferabilite{

    @Override
    public boolean estTransferable(Contenant contenant, int quantite) {
        return (contenant.getOuverture().estOuvert());
    }
}
