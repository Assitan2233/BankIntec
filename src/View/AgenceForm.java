package View;

import javax.swing.*;
import java.awt.*;

public class AgenceForm extends JFrame {

    private JTextField txtNAgence;
    private JTextField txtNom;
    private JTextField txtAdresse;
    private JTextField txtContact;
    private JTextField txtEmail;
    private JTextField txtNBP;

    private JButton btnListe;
    private JButton btnEnregistrer;
    private JButton btnSupprimer;

    public AgenceForm() {

        setTitle("Formulaire d'agence");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titre = new JLabel("FORMULAIRE D'AGENCE");
        titre.setFont(new Font("Arial", Font.BOLD, 24));
        titre.setBounds(140, 40, 350, 30);
        panel.add(titre);

        JLabel lblNAgence = new JLabel("N° Agence :");
        lblNAgence.setBounds(100, 100, 100, 25);
        panel.add(lblNAgence);

        txtNAgence = new JTextField();
        txtNAgence.setBounds(220, 100, 260, 25);
        panel.add(txtNAgence);

        JLabel lblNom = new JLabel("Nom :");
        lblNom.setBounds(100, 140, 100, 25);
        panel.add(lblNom);

        txtNom = new JTextField();
        txtNom.setBounds(220, 140, 260, 25);
        panel.add(txtNom);

        JLabel lblAdresse = new JLabel("Adresse :");
        lblAdresse.setBounds(100, 180, 100, 25);
        panel.add(lblAdresse);

        txtAdresse = new JTextField();
        txtAdresse.setBounds(220, 180, 260, 25);
        panel.add(txtAdresse);

        JLabel lblContact = new JLabel("Contact :");
        lblContact.setBounds(100, 220, 100, 25);
        panel.add(lblContact);

        txtContact = new JTextField();
        txtContact.setBounds(220, 220, 260, 25);
        panel.add(txtContact);

        JLabel lblEmail = new JLabel("Email :");
        lblEmail.setBounds(100, 260, 100, 25);
        panel.add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(220, 260, 260, 25);
        panel.add(txtEmail);

        JLabel lblNBP = new JLabel("N.B.P :");
        lblNBP.setBounds(100, 300, 100, 25);
        panel.add(lblNBP);

        txtNBP = new JTextField();
        txtNBP.setBounds(220, 300, 260, 25);
        panel.add(txtNBP);

        btnListe = new JButton("Liste");
        btnListe.setBounds(120, 370, 90, 35);
        panel.add(btnListe);

        btnEnregistrer = new JButton("Enregistrer");
        btnEnregistrer.setBounds(240, 370, 120, 35);
        panel.add(btnEnregistrer);

        btnSupprimer = new JButton("Supprimer");
        btnSupprimer.setBounds(390, 370, 110, 35);
        panel.add(btnSupprimer);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AgenceForm();
    }
}