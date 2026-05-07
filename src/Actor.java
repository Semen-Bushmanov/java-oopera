enum Gender {
    MALE,
    FEMALE
}

public class Actor {
    private String name;
    private String surname;
    private Gender gender;
    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
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

    public double getHeight() {
        return height;
    }
}
