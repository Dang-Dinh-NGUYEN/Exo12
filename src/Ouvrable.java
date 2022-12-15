public class Ouvrable implements Ouverture{
    private boolean est_ouvert = false;

    @Override
    public boolean estOuvert() {
        return this.est_ouvert;
    }

    public void ouvrir(){
        this.est_ouvert = true;
    }

    void  setOuvert(boolean b){
        est_ouvert=b;
    }
}
