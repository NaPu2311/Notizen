import java.util.ArrayList;
import java.util.List;

public class NoteManagement{
    private List<Notes> notesList; 
        
    public NoteManagement() {
        this.notesList = new ArrayList<>();
    }

    public void addNote(String text, String title){
        Notes note = new Notes(title, text);
        notesList.add(note);

    }
}