import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainWindow extends JFrameWindow {


    // Konstruktor der AddNotes-Klasse
    public MainWindow(String title, int x, int y) {
        // Rufe den Konstruktor der Basisklasse auf
        super(title, x, y);

        // Initialisiere das Textfeld und den Button
        JButton addButton = new JButton("Add Note");
        JButton loadButton = new JButton("Load");
        JButton closeButton = new JButton("Close");

        //Setze die bevorzugte Größe der Buttons
        addButton.setPreferredSize(new Dimension(150, 40));
        loadButton.setPreferredSize(new Dimension(150, 40));
        closeButton.setPreferredSize(new Dimension(150, 40));

        // Erstelle ein Panel und füge die Komponenten hinzu
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(addButton, BorderLayout.NORTH);
        panel.add(loadButton, BorderLayout.CENTER);
        panel.add(closeButton, BorderLayout.SOUTH);

        // Füge das Panel zum Fenster hinzu
        getContentPane().add(panel);
    }

    
}
