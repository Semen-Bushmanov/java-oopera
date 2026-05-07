import java.util.ArrayList;
import java.util.Objects;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
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
        boolean canAdd = true;

        for (Actor actorInList : getListOfActors()) {
            if (actorInList.equals(actor)) {
                canAdd = false;
                break;
            }
        }

        if (canAdd) {
            listOfActors.add(actor);
            System.out.println("The actor " + actor.toString() + " has been added.");
            return actor;
        }

        System.out.println("The actor exists already.");
        return null;
    }

    public Actor replaceActor(Actor oldActor, Actor newActor) {
        boolean canReplace = false;

        for (Actor actor : getListOfActors()) {
            if (actor.equals(oldActor)) {
                canReplace = true;
                break;
            }
        }

        if (canReplace) {
            listOfActors.remove(oldActor);
            listOfActors.add(newActor);
            System.out.println("The actor " + oldActor.toString() + " is replaced by " + newActor.toString() + ".");
            return newActor;
        }

        System.out.println("There is no such actor.");
        return null;
    }
}
