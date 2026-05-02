package entite;

import java.util.Date;

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

    public CompteEpargne(int code, float solde, int nbComptes, Date createdDate, Date updatedDate, float taux) {
        super(code, solde, nbComptes, createdDate, updatedDate);
        this.taux = taux;
    }

    @Override
    public String toString() {
        String s =  "CompteEpargne{" +
                "taux=" + taux +
                '}';
        System.out.println(s);
        return s ;
    }
}
