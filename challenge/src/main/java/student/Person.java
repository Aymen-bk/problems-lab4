package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;

    public Person() { this.id = nextId++; }

    public Person(String firstName, String lastName, String phone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName; }
    public String getPhone() {return phone;}
    public String getEmail() {return email;}

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) {this.lastName= lastName;}
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email;}

    public void display() {
        System.out.printf("%d  %s %s%n", id, lastName, firstName);
    }

    public String toString() {
        return String.format("%d - %s %s (%s, %s)", id, lastName, firstName, phone, email);
    }
}
