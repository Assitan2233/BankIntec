package entite;

public class Agence {
    private int NDagent;
    private String Nom;
    private  String Adresse ;
    private String Contact ;
    private String Email ;
    private String  NBp;

    public Agence(int NDagent, String nom, String adresse, String contact, String email, String NBp) {
        this.NDagent = NDagent;
        Nom = nom;
        Adresse = adresse;
        Contact = contact;
        Email = email;
        this.NBp = NBp;
    }

    public Agence() {
    }

    public int getNDagent() {
        return NDagent;
    }

    public void setNDagent(int NDagent) {
        this.NDagent = NDagent;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNBp() {
        return NBp;
    }

    public void setNBp(String NBp) {
        this.NBp = NBp;
    }

}
