package View;

import javax.swing.*;
import java.awt.*;

public class PersonneForm extends JFrame {
    private final String[] nomsChamps = {
            "ID :", "Nom :", "Prénom :", "Âge :", "Adresse :",
            "Téléphone :", "Date de Naissance :", "CreatedDate :", "updateDate :"
    };

    public PersonneForm() {
        // 1. Configuration de la fenêtre
        setTitle("Formulaire Personne");
        setSize(450, 530);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Permet le positionnement libre
        setLocationRelativeTo(null); // Centre l'interface à l'écran

        // 2. Alignement automatique des lignes
        int xLabel = 60;      // Alignement gauche des textes
        int xChamp = 195;     // Alignement gauche des cases vides
        int largeurChamp = 160;
        int hauteur = 25;
        int departY = 40;     // Position de la première ligne

        for (int i = 0; i < nomsChamps.length; i++) {
            // Calcule la hauteur pour chaque ligne automatiquement
            int y = departY + i * 37;

            // Création de l'étiquette (alignée à droite)
            JLabel label = new JLabel(nomsChamps[i], SwingConstants.RIGHT);
            label.setBounds(xLabel, y, 120, hauteur);
            add(label);

            // Création de la case vide
            JTextField champ = new JTextField();
            champ.setBounds(xChamp, y, largeurChamp, hauteur);
            add(champ);
        }

        // 3. Ajout du bouton "Enregistrer" juste en dessous
        JButton btnEnregistrer = new JButton("Enregistrer");
        btnEnregistrer.setBounds(xLabel + 20, departY + (nomsChamps.length * 37) + 5, 250, 30);
        add(btnEnregistrer);

        // 4. Affichage
        setVisible(true);
    }

    public static void main(String[] args) {
        new PersonneForm();
    }
}