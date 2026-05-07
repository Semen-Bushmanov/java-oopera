import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + this.getName() +
                "', surname='" + this.getSurname() +
                "', gender='" + this.getGender() +
                "', height=" + this.getHeight() + "'" + "}";
    }

    @Override
    public boolean equals(Object o) { // добавили и переопределили equals
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(this.getName(), actor.getName()) &&
                Objects.equals(this.getSurname(), actor.getSurname()) &&
                Objects.equals(this.getGender(), actor.getGender()) &&
                Objects.equals(this.getHeight(), actor.getHeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSurname(), this.getGender(), this.getHeight());
    }
}
