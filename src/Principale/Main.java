package Principale;

import entite.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    //Cration d'objet pour Compte
    Compte c1 = new Compte(00, 1200000,1,new Date(),new Date());
   Compte  c2 = new Compte(01, 1000000,2,new Date(),new Date());
   Compte  c3 = new Compte(02, 200000,3,new Date(),new Date());
   Compte c4 = new Compte(03, 9900000,4,new Date(),new Date());
   Compte  c5 = new Compte(04, 1800000,5,new Date(),new Date());
     c1.toString();
        c2.toString();
        c3.toString();
        c4.toString();
        c5.toString();
   //Creation d'objet pour CompteSimple
    CompteSimple s1 = new CompteSimple(04, 1800000,5,new Date(),new Date());
    CompteSimple s2 = new CompteSimple(04, 1800000,5,new Date(),new Date());
    CompteSimple s3 = new CompteSimple(04, 1800000,5,new Date(),new Date());
    CompteSimple s4 = new CompteSimple(04, 1800000,5,new Date(),new Date());
    CompteSimple s5 = new CompteSimple(04, 1800000,5,new Date(),new Date());
        s1.toString();
        s2.toString();
        s3.toString();
        s4.toString();
        s5.toString();
//Creation d'objet pour Personne
    Personne P1 = new Personne(01,"Traore","Assitan",25,"KABALA","78029989",new Date(),new Date(),new Date());
    Personne P2 = new Personne(02,"Traore","Assitan",25,"KABALA","78029989",new Date(),new Date(),new Date());
    Personne P3 = new Personne(03,"Traore","Assitan",25,"KABALA","78029989",new Date(),new Date(),new Date());
    Personne P4 = new Personne(04,"Traore","Assitan",25,"KABALA","78029989",new Date(),new Date(),new Date());
    Personne P5 = new Personne(01,"Traore","Assitan",25,"KABALA","78029989",new Date(),new Date(),new Date());
        P1.toString();
        P2.toString();
        P3.toString();
        P4.toString();
        P5.toString();
    // Creation d'objet pour CompteEpargne
    CompteEpargne e1 = new CompteEpargne(13);
    CompteEpargne e2 = new CompteEpargne(14);
    CompteEpargne e3 = new CompteEpargne(15);
    CompteEpargne e4 = new CompteEpargne(16);
    CompteEpargne e5 = new CompteEpargne(17);
        e1.toString();
        e2.toString();
        e3.toString();
        e4.toString();
        e5.toString();
    //Creation d'objet pour ComptePayant
    ComptPayant pa1 = new ComptPayant(01, 1000000,2,new Date(),new Date());
    ComptPayant pa2 = new ComptPayant(8, 1000000,2,new Date(),new Date());
    ComptPayant pa3= new ComptPayant( 9, 1000000,2,new Date(),new Date());
    ComptPayant pa4 = new ComptPayant(02, 1000000,2,new Date(),new Date());
    ComptPayant pa5 = new ComptPayant(04, 1000000,2,new Date(),new Date());
        pa1.toString();
        pa2.toString();
        pa3.toString();
        pa4.toString();
        pa5.toString();
   }
}

