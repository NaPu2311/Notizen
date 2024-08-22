import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameWindow extends JFrame {

    public JFrameWindow() {
        // Setze den Titel des Fensters
        super("Mein Benutzerdefiniertes JFrame");

        // Setze die Standardaktion beim Schließen des Fensters
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Erstelle und füge ein JLabel hinzu
        JLabel label = new JLabel("Hallo, Welt!", JLabel.CENTER);
        getContentPane().add(label);

        // Setze die Größe des Fensters
        setSize(300, 200);

        // Mache das Fenster sichtbar
        setVisible(true);
    }
}


