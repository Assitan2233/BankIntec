package entite;

public class ComptPayant extends Compte{
    public ComptPayant() {
    }

    @Override
    public String toString() {
        return "ComptPayant{}";
    }

    @Override
    public void verser(float mt) {
        super.verser(mt);
    }

    @Override
    public void retirer(float mt) {
        super.retirer(mt);
    }
}
