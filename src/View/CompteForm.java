package View;

import javax.swing.*;

public class CompteForm {
    public static void main(String[] args) {
        new CompteForm();
    }
        //Creation de la fenêtre
        JFrame fenetre = new JFrame("BankIntec");
    public CompteForm() {
            fenetre.setSize(500, 400);
            fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fenetre.setLayout(null);
            //Label Code
            JLabel code = new JLabel("Code:");
            code.setBounds(30, 30, 80, 25);
            fenetre.add(code);
            //Textfiel Code
            JTextField txtCode = new JTextField();
            txtCode.setBounds(120, 30, 150, 25);
            fenetre.add(txtCode);
            //Label solde
            JLabel solde = new JLabel("solde:");
            solde.setBounds(30, 70, 80, 25);
            fenetre.add(solde);
            //Textfiel solde
            JTextField txtsolde = new JTextField();
            txtsolde.setBounds(120, 70, 150, 25);
            fenetre.add(txtsolde);
            //Label nbComptes
            JLabel nbComptes = new JLabel("nbComptes:");
            nbComptes.setBounds(30, 110, 80, 25);
            fenetre.add(nbComptes);
            //Textfiel nbComptes
            JTextField txtnbComptes = new JTextField();
            txtnbComptes.setBounds(120, 70, 150, 25);
            fenetre.add(txtnbComptes);
            //Label createdDate
            JLabel createdDate = new JLabel("createdDate :");
            createdDate.setBounds(30, 150, 80, 25);
            fenetre.add(createdDate);
            // TextField createdDate
            JTextField txtcreatedDate = new JTextField();
            txtcreatedDate.setBounds(120, 150, 150, 25);
            fenetre.add(txtcreatedDate);
            //Label updatedDate
            JLabel updatedDate = new JLabel("updatedDate:");
            updatedDate.setBounds(30, 190, 80, 25);
            fenetre.add(updatedDate);
            // TextField updatedDate
            JTextField txtupdatedDate = new JTextField();
            txtupdatedDate.setBounds(120, 190, 150, 25);
            fenetre.add(txtupdatedDate);
            // Afficher la fenêtre
            fenetre.setVisible(true);

        }

    }