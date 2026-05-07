import java.util.ArrayList;
import java.util.Objects;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printListOfActors() {
        for (Actor actor : this.getListOfActors()) {
            System.out.println(actor);
        }
    }

    public Actor addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
            return actor;
        }
        return null;
    }

    public Actor replaceActor(Actor oldActor, Actor newActor) {
        if (!listOfActors.contains(oldActor)) {
            listOfActors.remove(oldActor);
            listOfActors.add(newActor);
            return newActor;
        }
        return null;
    }
}
