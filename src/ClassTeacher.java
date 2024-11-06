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
                System.out.println("W tej grupie już istnieje taki nauczyciel");
                break;
            }
        }
        if (teachers.size() >= maxNumberOfTeachers){
            System.out.println("Brak miejsca w grupie");
        }
        else if (!found && teachers.size() < maxNumberOfTeachers){
            teachers.add(teacher);
        }
        for (int i = 0; i < teachers.size(); i++ ){
            System.out.println(teachers.get(i).name);
        }
    }
}
