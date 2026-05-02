package entite;

import java.util.Date;

public class Compte {
    private int code;
    private float solde;
    private int nbComptes;
    private Date createdDate;
    private Date updatedDate;

    public Compte(int code, float solde, int nbComptes, Date createdDate, Date updatedDate) {
        this.code = code;
        this.solde = solde;
        this.nbComptes = nbComptes;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public int getNbComptes() {
        return nbComptes;
    }

    public void setNbComptes(int nbComptes) {
        this.nbComptes = nbComptes;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    public void verser(float mt){
        solde+=mt;
    }
    public void retirer(float mt){
        if(mt<solde) solde-=mt;
    }

    @Override
    public String toString() {
       String s = "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                ", nbComptes=" + nbComptes +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
        System.out.println(s);
        return s;
    }
}

