public class Main {
    public static void main(String[] args) {

        //Stworzenie classContainer i dodanie do niego grup
        ClassContainer classContainer = new ClassContainer();
        classContainer.addClass("Polski", 5);
        classContainer.addClass("Angielski", 10);
        classContainer.addClass("Matematyka", 2);
        classContainer.addClass("Informatyka", 3);

        //Tworzenie nauczycieli
        Teacher t1 = new Teacher("Agnieszka", "Grabowska", TeacherCondition.chory, 1999, 5100);
        Teacher t2 = new Teacher("Angelika", "Ziemna", TeacherCondition.nieobecny, 1985, 6300);
        Teacher t3 = new Teacher("Anna", "Jasielinska", TeacherCondition.delegacja, 2003, 3900);
        Teacher t4 = new Teacher("Martyna", "Szczurowska", TeacherCondition.obecny, 2004, 4200);
        Teacher t5 = new Teacher("Aneta", "Kaczmarczyk", TeacherCondition.obecny, 2002, 4500);

        //Pobranie wszystkich grup
        ClassTeacher polski = classContainer.classes.get("Polski");
        ClassTeacher angielski = classContainer.classes.get("Angielski");
        ClassTeacher matematyka = classContainer.classes.get("Matematyka");
        ClassTeacher informatyka = classContainer.classes.get("Informatyka");

        //Dodawanie nauczycieli do grup
        angielski.addTeacher(t1);
        angielski.addTeacher(t4);
        matematyka.addTeacher(t2);
        informatyka.addTeacher(t3);
        informatyka.addTeacher(t5);
        informatyka.addTeacher(t4);

        //testowanie klasy ClassContainer
        //Dodawanie klasy gdy juz istnieje
        classContainer.addClass("Polski", 3);

        //Dalsze testowanie
        classContainer.findEmpty();
        classContainer.summary();
        classContainer.removeClass("Polski");
        classContainer.summary();

        //testowanie klasy ClassTeacher
        //Dodawanie nauczyciela gdy już istnieje w klasie
        matematyka.addTeacher(t2);

        //Dodawanie nauczyciela gdy nie ma juz miejsca w grupie
        informatyka.addTeacher(t1);

        //Dalsze testowanie
        informatyka.addSalary(t5, 1023);
        angielski.removeTeacher(t4);
        angielski.summary();
        angielski.changeCondition(t1, TeacherCondition.obecny);
        angielski.summary();
        informatyka.search("Kaczmarczyk");
        informatyka.searchPartial("An");
        informatyka.countByCondition(TeacherCondition.obecny);
        informatyka.summary();
        informatyka.sortByName();
        informatyka.sortBySalary();
        informatyka.max();

    }
}