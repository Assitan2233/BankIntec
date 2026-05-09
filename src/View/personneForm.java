package View;
import javax.swing.*;

public class personneForm {
    public static void main(String[] args) {
new personneForm();
    }
    //Creation de la fenêtre
    JFrame fenetre = new JFrame("BankIntec");
    public personneForm (){
        fenetre.setSize(500,400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(null);
        //Label iD
        JLabel id = new JLabel("ID:");
        id.setBounds(30, 30, 80, 25);
        fenetre.add(id);
        //Textfiel ID
        JTextField txtID = new JTextField();
        txtID.setBounds(120, 30, 120, 25);
        fenetre.add(txtID);
    // Label Nom
    JLabel Nom = new JLabel("Nom :");
        Nom.setBounds(40, 40, 90, 30);
        fenetre.add(Nom);

    // TextField Nom
    JTextField txtNom = new JTextField();
        txtNom.setBounds(122, 40, 122, 26);
        fenetre.add(txtNom);

    // Label Prénom
    JLabel Prenom = new JLabel("Prénom :");
        Prenom.setBounds(30, 70, 80, 25);
        fenetre.add(Prenom);

    // TextField Prénom
    JTextField txtPrenom = new JTextField();
        txtPrenom.setBounds(120, 70, 120, 25);
        fenetre.add(txtPrenom);
    //Label AGE
        JLabel Age = new JLabel("Age :");
        Prenom.setBounds(30, 70, 80, 25);
        fenetre.add(Prenom);
        // TextField Age
        JTextField txtAge = new JTextField();
        txtAge.setBounds(120, 70, 120, 25);
        fenetre.add(txtAge);
        //Label Adresse
        JLabel Adresse = new JLabel("Adresse :");
        Adresse.setBounds(30, 70, 80, 25);
        fenetre.add(Adresse);
        // TextField Adress
        JTextField txtAdresse = new JTextField();
        txtAdresse.setBounds(120, 70, 120, 25);
        fenetre.add(txtAdresse);
        //Label Phone
        JLabel Phone = new JLabel("Phone :");
        Phone.setBounds(30, 70, 80, 25);
        fenetre.add(Phone);
        // TextField Phone
        JTextField txtPhone = new JTextField();
        txtPhone.setBounds(120, 70, 120, 25);
        fenetre.add(txtPhone);
        //Label DateNaissance
        JLabel DateNaissance = new JLabel("DateNaissance :");
        DateNaissance.setBounds(30, 70, 80, 25);
        fenetre.add(DateNaissance);
        // TextField DateNaissance
        JTextField txtDateNaissance = new JTextField();
        txtDateNaissance.setBounds(120, 70, 120, 25);
        fenetre.add(txtDateNaissance);
        //Label createdDate
        JLabel createdDate = new JLabel("createdDate :");
        createdDate.setBounds(30, 70, 80, 25);
        fenetre.add(createdDate);
        // TextField createdDate
        JTextField txtcreatedDate = new JTextField();
        txtcreatedDate.setBounds(120, 70, 120, 25);
        fenetre.add(txtcreatedDate);
        //Label updatedDate
        JLabel updatedDate = new JLabel("updatedDate:");
        updatedDate.setBounds(30, 70, 80, 25);
        fenetre.add(updatedDate);
        // TextField updatedDate
        JTextField txtupdatedDate = new JTextField();
        txtupdatedDate.setBounds(120, 70, 120, 25);
        fenetre.add(txtupdatedDate);
    // Afficher la fenêtre
        fenetre.setVisible(true);

}
}
