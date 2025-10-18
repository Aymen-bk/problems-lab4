package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student() {
        super();
        this.cne = "UNKNOWN";
        this.major = new Major("23", "Computer Science");
        this.major.addStudent(this);
    }

    public Student(String firstName, String lastName, String phone, String email, String cne, Major major) {
        super(firstName, lastName, phone, email);
        this.cne = cne;
        this.major = major;
        this.major.addStudent(this);
    }
    public Student(String firstName, String lastName, String phone, String email, String cne) {
        this(firstName, lastName, phone, email, cne, new Major("23", "Computer Science"));
    }

    // Getters
    public String getCne() { return cne; }
    public Major getMajor() { return major; }
    // Setters
    public void setCne(String cne) { this.cne = cne; }
    public void setMajor(Major major) { this.major = major; }

    // Method 5
    public String getFullNameFormatted() {
        return String.format("%s, %s", lastName.toUpperCase(), firstName);
    }

    public String toString() {
        return String.format("%s - %s", cne, getFullNameFormatted());
    }
}
