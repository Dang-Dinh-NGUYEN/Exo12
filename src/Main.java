public class Main {

    public static void main(String[] args) {
	// write your code here
        Verre verre = new Verre(50);
        verre.boire(50);
        BouteilleRefermable bouteilleRefermable = new BouteilleRefermable(500);
        //System.out.println(bouteilleRefermable.getReste());
        //System.out.println(bouteilleRefermable.getOuverture());
        bouteilleRefermable.ouvrir();
        //System.out.println(bouteilleRefermable.getOuverture().estOuvert());
        //bouteilleRefermable.fermer();
        //System.out.println(bouteilleRefermable.getOuverture().estOuvert());
        //System.out.println(Contenant.getTransferabilite().estTransferable(bouteilleRefermable, 500));


        bouteilleRefermable.verserDans(500,verre);
        System.out.println(bouteilleRefermable.getReste());
        System.out.println(verre.getReste());
    }
}
