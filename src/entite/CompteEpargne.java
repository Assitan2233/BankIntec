package entite;

public class CompteEpargne extends Compte{
    private float taux;

    public CompteEpargne(float taux) {
        this.taux = taux;
    }

    public CompteEpargne() {
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    @Override
    public void verser(float mt) {
        super.verser(mt);
    }

    @Override
    public void retirer(float mt) {
        super.retirer(mt);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
