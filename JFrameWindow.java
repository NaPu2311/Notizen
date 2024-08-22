import javax.swing.JFrame;

public class JFrameWindow extends JFrame {

 
    
    //Konstruktor
    public JFrameWindow(String title, int x, int y) {
        // Setze den Titel des Fensters
        super(title);

        // Setze die Standardaktion beim Schließen des Fensters
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setze die Größe des Fensters
        setSize(x, y);

        // Mache das Fenster sichtbar
        setVisible(true);
    }

 
}

