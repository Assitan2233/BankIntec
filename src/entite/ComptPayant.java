package entite;

import java.util.Date;

public class ComptPayant extends Compte{

     public ComptPayant() {
    }

    @Override
    public void verser(float mt) {
        super.verser(mt);
    }

    @Override
    public void retirer(float mt) {
        super.retirer(mt);
    }

    public ComptPayant(int code, float solde, int nbComptes, Date createdDate, Date updatedDate) {
        super(code, solde, nbComptes, createdDate, updatedDate);
    }

    @Override
    public String toString() {
        String s =  "ComptPayant{}";
        System.out.println(s);
        return s ;
    }
}
