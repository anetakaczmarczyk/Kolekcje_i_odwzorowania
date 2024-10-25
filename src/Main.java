public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("An", "Nazwisko", TeacherCondition.obecny, 2000, 2405);
        Teacher t2 = new Teacher("An2", "Nazwisko", TeacherCondition.obecny, 2000, 2405);
        t.printing();
        ClassTeacher c = new ClassTeacher("AA", 1);
        c.addTeacher(t);
        c.addTeacher(t2);
        return;
    }
}