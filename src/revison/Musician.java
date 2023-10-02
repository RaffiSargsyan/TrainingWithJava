package revison;

public abstract class Musician {
    private String name;

    public abstract void playMusic();
    public abstract void readNotes(String notes);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
