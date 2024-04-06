package ge.ibsu.demo.dto;

public class Actor {
    
    private String firstName;
    private String lastName;    

    // Default constructor
    public Actor() {
    }

    // Parameterized constructor
    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
}
