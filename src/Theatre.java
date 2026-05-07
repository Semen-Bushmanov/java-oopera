import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor firstActor = new Actor("Nicholas", "Cage", Gender.MALE, 180);
        Actor secondActor = new Actor("Tom", "Cruise", Gender.MALE, 174);
        Actor thirdActor = new Actor("Veronica", "Still", Gender.FEMALE, 162);
        Actor unrealActor = new Actor("John", "Snow", Gender.MALE, 198);
        Director firstDirector = new Director("Michael", "Smith", Gender.MALE, 14);
        Director secondDirector = new Director("Lisa", "Goodwill", Gender.FEMALE, 2);
        Person firstMusicAuthor = new Person("Antonio", "Vivaldi", Gender.MALE);
        Person secondMusicAuthor = new Person("Richard", "Bach", Gender.MALE);
        Show firstShow = new Show("Snow White", 154, secondDirector);
        Opera secondShow = new Opera("The Sun", 120, secondDirector, firstMusicAuthor,"Some libretto text", 12);
        Ballet thirdShow = new Ballet("The Nutcracker", 90, firstDirector, secondMusicAuthor,"Some more libretto text", secondMusicAuthor);

        firstShow.addActor(firstActor);
        firstShow.addActor(thirdActor);
        secondShow.addActor(firstActor);
        secondShow.addActor(secondActor);
        secondShow.addActor(thirdActor);
        thirdShow.addActor(secondActor);
        thirdShow.addActor(thirdActor);

        firstShow.printListOfActors();
        secondShow.printListOfActors();
        thirdShow.printListOfActors();

        firstShow.replaceActor(firstActor, secondActor);
        thirdShow.replaceActor(unrealActor, firstActor);

        secondShow.printLibretto();
        thirdShow.printLibretto();
    }
}
