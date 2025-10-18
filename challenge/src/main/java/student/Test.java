package student;

public class Test {
    public static void main(String[] args) {
        Major cs = new Major("23", "Computer Science");
        Major m = new Major("42", "Math");

        Student s1 = new Student("Aymen", "bbk", "0666666666", "aye@gmail.com", "22885676", cs);
        Student s2 = new Student("best", "student#1", "0696969696", "yo@mail.com", "23585976", cs);
        Student s3 = new Student("I'm", "him", "0420420420", "oo@hotmail.com", "23886111", m);

        cs.displayStudents();

        System.out.println("\nSearching for student with CNE 22885676:");
        System.out.println(cs.findStudentByCNE("22885676"));

        System.out.println("Occupancy Rate: " + cs.getOccupancyRate() + "%");

        cs.removeStudent("23585976");
        System.out.println("\nAfter removal:");
        cs.displayStudents();
    }
}
