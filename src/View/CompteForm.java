package View;

import javax.swing.*;

public class CompteForm {

        JFrame fenetre = new JFrame("BankIntec");

        public CompteForm() {

                // Création de la fenêtre
                fenetre.setSize(500, 350);
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fenetre.setLayout(null);

                // Label Code
                JLabel code = new JLabel("Code :");
                code.setBounds(30, 30, 100, 25);
                fenetre.add(code);

                // TextField Code
                JTextField txtCode = new JTextField();
                txtCode.setBounds(150, 30, 180, 25);
                fenetre.add(txtCode);

                // Label Solde
                JLabel solde = new JLabel("Solde :");
                solde.setBounds(30, 70, 100, 25);
                fenetre.add(solde);

                // TextField Solde
                JTextField txtSolde = new JTextField();
                txtSolde.setBounds(150, 70, 180, 25);
                fenetre.add(txtSolde);

                // Label Nb Comptes
                JLabel nbComptes = new JLabel("Type de Comptes :");
                nbComptes.setBounds(30, 110, 120, 25);
                fenetre.add(nbComptes);

                // TextField Nb Comptes
                JTextField txtNbComptes = new JTextField();
                String[] types = {"Compte Simple", "Compte Epargne", "Compte Payant"};
                JComboBox<String> cbType = new JComboBox<>(types);
                cbType.setBounds(150, 110, 180, 25);
                fenetre.add(cbType);

                // Bouton Enregistrer
                JButton btnEnregistrer = new JButton("Enregistrer");
                btnEnregistrer.setBounds(80, 200, 130, 35);
                fenetre.add(btnEnregistrer);

                // Bouton Modifier
                JButton btnModifier = new JButton("Modifier");
                btnModifier.setBounds(250, 200, 130, 35);
                fenetre.add(btnModifier);
                btnEnregistrer.addActionListener(e -> {
                        JOptionPane.showMessageDialog(
                                fenetre,
                                "Compte enregistré avec succès !"
                        );
                });

                // Affichage de la fenêtre
                fenetre.setLocationRelativeTo(null);
                fenetre.setVisible(true);
                btnModifier.addActionListener(e -> {
                        JOptionPane.showMessageDialog(
                                fenetre,
                                "Compte modifié avec succès !"
                        );
                });
        }

        public static void main(String[] args) {
                new CompteForm();
        }
}