public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Bn", "Nazwisko", TeacherCondition.obecny, 2000, 2205);
        Teacher t2 = new Teacher("An2", "Nazwisko", TeacherCondition.obecny, 2000, 2405);
        t.printing();
        ClassTeacher c = new ClassTeacher("AA", 2);
        c.addTeacher(t);
        c.addTeacher(t2);
        c.addSalary(t2, 100);

//        c.removeTeacher(t);
        c.changeCondition(t, TeacherCondition.chory);
        c.search("Nazwisko");
        c.searchPartial("Na");
        c.countByCondition(TeacherCondition.nieobecny);
        c.summary();
        c.sortByName();
        c.sortBySalary();
        c.max();
//        Wywołania wszystkich metod które są do zaimplementowanina
    }
}