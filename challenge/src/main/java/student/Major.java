package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;

    private int studentCount;
    private static final int max = 50;

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name=name;
        this.students=new Student[max];
        this.studentCount =0;
    }

    public Major() {
        this("23", "Computer Science"); //default
    }

    public void addStudent(Student s) {
        if (studentCount < max) { students[studentCount++] = s; }

        else {System.out.println("Cannot add more students, capacity full for " + name);}
    }

    public Student findStudentByCNE(String cne) {
        for (int i = 0; i < studentCount; i++)
        {
            if (students[i].getCne().equals(cne)) {return students[i];}
        }
        return null; //not found
    }

    public boolean removeStudent(String cne) {
        for (int i = 0; i < studentCount; i++) { //very similar shifting method  in problem2
            if (students[i].getCne().equals(cne))
            {
                for (int j = i; j < studentCount - 1; j++) {students[j] = students[j + 1];}
                students[--studentCount] = null;
                return true;
            }
        }
        return false;
    }

    //some getters
    public int getStudentCount() { return studentCount;}
    public double getOccupancyRate() {return (studentCount * 100.0) / max;}

    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder(); //using string builder
        for (int i = 0; i < studentCount; i++) {
            sb.append(i + 1).append(". ").append(students[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public void displayStudents() {
        System.out.println("Major " + name + " has :");
        System.out.println(getStudentListAsString());
    }

    public String toString() {
        return String.format("Major[%s - %s] (%d/%d students)", code, name, studentCount, max);
    }
}
