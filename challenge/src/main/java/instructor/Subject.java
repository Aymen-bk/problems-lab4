package instructor;

public class Subject {
    private int id;
    private static int nextId = 1;
    private String code;
    private String title;

    public Subject(String code, String title) {
        this.id = nextId++;
        this.code = code;
        this.title = title;
    }

    public String normalizedCode() {
        return code == null ? "" : code.trim().toUpperCase();
    }

    public String properTitle() {
        if (title == null || title.isEmpty()) return "";
        String[] words = title.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public boolean isIntroCourse() {
        String t = title.toLowerCase();
        return t.contains("intro") || normalizedCode().startsWith("INTRO-");
    }

    public String syllabusLine(instructor.Instructor inst) {
        StringBuilder sb = new StringBuilder();
        sb.append(normalizedCode()).append(" - ").append(properTitle())
                .append(" (Instructor: ").append(inst.getLastName()).append(" ").append(inst.getFirstName()).append(")");
        return sb.toString();
    }

    public String toString() {
        return String.format("Subject[%s - %s]", normalizedCode(), properTitle());
    }
}
