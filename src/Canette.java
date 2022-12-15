public class Canette extends ContenantBuvable{

    public Canette(int contenance) {
        super(contenance,contenance, new Ouvrable());
    }

    public void ouvrir(){
        ((Ouvrable)this.getOuverture()).ouvrir();
    }

}
