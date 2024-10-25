import java.util.ArrayList;

public class ClassTeacher {
    public String groupName;
    public ArrayList<Teacher> teachers = new ArrayList<>();
    public int maxNumberOfTeachers;

    public ClassTeacher(String groupName, int maxNumberOfTeachers) {
        this.groupName = groupName;
        this.maxNumberOfTeachers = maxNumberOfTeachers;
    }

    public void addTeacher(Teacher teacher) {
        boolean found = false;
        for (Teacher t : teachers){
            if (t.name.equals(teacher.name) && t.surname.equals(teacher.surname)) {
                found = true;
                break;
            }
        }
        if (!found && teachers.size() < maxNumberOfTeachers){
            teachers.add(teacher);
        } // Dodanie komunikatów przy found i przy size
        System.out.println(teachers.toString());
    }
}
