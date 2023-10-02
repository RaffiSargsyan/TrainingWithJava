package revison;

public class Human {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isCorrect(name))
        this.name = name;
        else
            System.out.println("Invalid name");
    }
    public boolean isCorrect(String n ){
       return n.matches("[A-Z][a-z]+");
    }
}
