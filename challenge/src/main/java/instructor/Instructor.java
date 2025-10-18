package instructor;

public class Instructor extends student.Person {
    private String employeeNumber;

    public Instructor() {
        super();}

    public Instructor(String firstName, String lastName, String phone, String email, String employeeNumber) {
        super(firstName, lastName, phone, email);
        this.employeeNumber = employeeNumber;
    }

    public String cleanEmployeeNumber() {
        return employeeNumber == null ? "" : employeeNumber.trim().replace(" ", "");
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                cleanEmployeeNumber(), lastName, firstName);
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null) sb.append(lastName);
        if (firstName != null) sb.append(" ").append(firstName);
        return sb.toString().trim();
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n----------\n")
                .append("Employee #: ").append(cleanEmployeeNumber()).append("\n")
                .append("Name      : ").append(lastName).append(", ").append(firstName).append("\n")
                .append("Email     : ").append(email).append("\n")
                .append("Phone     : ").append(phone);
        return sb.toString();
    }

    public String toString() { return summaryLine(); }
}
