public class Director {
    private String name;
    private String surname;
    private Gender gender;
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.numberOfShows = numberOfShows;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }
}
