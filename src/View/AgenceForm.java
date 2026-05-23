package View;

import javax.swing.*;

public class AgenceForm {
    public static void main(String[] args) {
        new  AgenceForm();
    }
    JFrame  AgenceForm = new JFrame("Formulaire D'Agence");
    public AgenceForm() {
        AgenceForm.setSize(500, 400);
        AgenceForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AgenceForm.setLayout(null);
        //Label NDagent
        JLabel N_agent  = new JLabel("N_agent:");
       N_agent.setBounds(30, 30, 80, 25);
        //Textfiel N_agent
        JTextField txtN_agent = new JTextField();
        txtN_agent.setBounds(120, 30, 150, 25);
        AgenceForm.add(txtN_agent);
        //Label Nom
        JLabel Nom = new JLabel("Nom:");
       Nom.setBounds(30, 70, 80, 25);
        AgenceForm.add(Nom);
        //Textfiel Nom
        JTextField txtNom = new JTextField();
        txtNom.setBounds(120, 70, 150, 25);
        AgenceForm.add(txtNom);
        //Label Adress
        JLabel Adress = new JLabel("Adress:");
        Adress.setBounds(30, 110, 80, 25);
        AgenceForm.add(Adress);
        //Textfiel Adress
        JTextField txtAdress = new JTextField();
        txtAdress.setBounds(120, 107, 150, 25);
        AgenceForm.add(txtAdress);
        //LabelContact
        JLabel Contact = new JLabel("Contact :");
        Contact.setBounds(30, 150, 80, 25);
        AgenceForm.add(Contact);
        // TextField Contact
        JTextField txtContact = new JTextField();
        txtContact.setBounds(120, 150, 150, 25);
        AgenceForm.add(txtContact);
        //Label Email
        JLabel Email = new JLabel(" Email:");
        Email.setBounds(30, 190, 80, 25);
        AgenceForm.add( Email);
        // TextField Email
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(120, 190, 150, 25);
        AgenceForm.add(txtEmail);
        //Label NBpersonne
        JLabel NBpersonne = new JLabel("solde:");
        NBpersonne .setBounds(30, 70, 80, 25);
        AgenceForm.add(NBpersonne );
        //Textfiel NBpersonne
        JTextField txtNBpersonne  = new JTextField();
        txtNBpersonne .setBounds(120, 30, 150, 25);
        AgenceForm.add(txtNBpersonne );
        // Afficher la fenêtre
        AgenceForm.setVisible(true);
    }
}
