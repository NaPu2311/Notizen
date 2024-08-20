import java.util.Date;

public class Notes{
    String title;
    String text;
    Date date;

    public Notes(String title, String text){
        this.title = title;
        this. text = text;
        this.date = new Date();
    }

    public String getTitle(){
        return title;
    }

    public String getText() {
        return text;
    }
    
    public Date getDate() {
        return date;
    }

    public void setText(String text){
        this.text  = text;
    }

    public void setTitle(String title){
        this.title  = title;
    }

    public void setDate(Date date){
        this.date = date;
    }
        
}
