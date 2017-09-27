import java.util.*;

public class Main {
    private static String[] firstNames = new String[]{"Curtis", "Hamilton", "Evan", "Tyler", "Paul", "John", "Erin", "Jill", "Buffy", "Bethany", "Tanner", "Dakota", "Andrew", "Justin", "Hannah"};
    private static String[] lastNames = new String[]{"Vanzandt", "Moore", "Coakley", "Jurecki", "Dantam", "Jastrow", "Woody", "Something-Polish", "Feinstein", "Wynns", "Plauche", "Nichols", "Gibson", "Murphy", "Vanzandt"};

    public static void main(String[] args) {
        List<Student> firstGraders = new ArrayList<>();
        Student student;
        for (int i = 0; i < 15; i++) {
            student = new Student();
            student.setFirstName(firstNames[i]);
            student.setLastName(lastNames[i]);
            student.setGrade(1);
            student.setId(i);
            firstGraders.add(student);
        }

        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher;
        for (int i = 0; i < 3; i++) {
            teacher = new Teacher();
            teacher.setFirstName(firstNames[i+4]);
            teacher.setLastName(lastNames[(i+1)*3]);
            teacher.setGrade(1);
            teacher.setId(i);
            teachers.add(teacher);
        }

        Set<Student> students1 = new HashSet<>();
        Set<Student> students2 = new HashSet<>();
        Set<Student> students3 = new HashSet<>();
        for (int i = 0; i < 15; i++) {
            if (i < 5) {
                students1.add(firstGraders.get(i));
            } else if (i < 10) {
                students2.add(firstGraders.get(i));
            } else {
                students3.add(firstGraders.get(i));
            }
        }

        Map<Teacher, Set> classes = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                classes.put(teachers.get(i), students1);
            } else if (i == 1) {
                classes.put(teachers.get(i), students2);
            } else {
                classes.put(teachers.get(i), students3);
            }
        }

        System.out.println(classes.keySet() + "\n");
        System.out.println(classes.values() + "\n");
        System.out.println(classes.entrySet() + "\n");
    }
}