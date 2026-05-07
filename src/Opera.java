import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSizer;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText, int choirSizer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSizer = choirSizer;
    }

    public int getChoirSizer() {
        return choirSizer;
    }
}
