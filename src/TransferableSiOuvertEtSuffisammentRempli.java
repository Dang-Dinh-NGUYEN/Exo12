public class TransferableSiOuvertEtSuffisammentRempli extends TransferableSiOuvert{
    @Override
    public boolean estTransferable(Contenant contenant, int quantite) {
        return (super.estTransferable(contenant,quantite) && contenant.getReste() >= quantite);
    }
}
