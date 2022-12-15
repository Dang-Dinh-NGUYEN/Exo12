abstract class Contenant implements ContenantRemplissable {
    /*
        private int contenance;
        private int reste;
        int getContenance() { return contenance; }
        int getReste() { return reste; }
        void setReste(int reste) { this.reste = reste; }
        Contenant(int contenance, int reste) {
            this.contenance = contenance;
            this.reste = reste;
        }
        void verserDans(int quantite, Verre verre) {
            reste = reste - quantite;
            verre.setReste(verre.getReste() + quantite);
        }

     */
        private Ouverture ouverture;
        private int contenance;
        private int reste;
        static private Transferabilite transferabilite = new TransferableSiOuvert();

        int getContenance() {
            return contenance;
        }

        public int getReste() {
            return reste;
        }

        public void setReste(int reste) {
            this.reste = reste;
        }

        Ouverture getOuverture() {
            return ouverture;
        }

        static void setTransferabilite(Transferabilite transferabilite) {
            Contenant.transferabilite = transferabilite;
        }

        static Transferabilite getTransferabilite() {
            return transferabilite;
        }

        Contenant(int contenance, int reste, Ouverture ouverture) {
            this.contenance = contenance;
            this.reste = reste;
            this.ouverture = ouverture;
        }

        void verserDans(int quantite, ContenantRemplissable contenant) {
            if (transferabilite.estTransferable(this, quantite)) {
                System.out.println(transferabilite.estTransferable(this, quantite));
                reste = reste - quantite;
                contenant.setReste(contenant.getReste() + quantite);
            }
        }
}
