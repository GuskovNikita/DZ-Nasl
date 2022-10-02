public class Main {
    public static void main(String[] main) {
        Student student = new Student
                ("Polina", "Rogova", "PKS-120", 5);
        Aspirant aspirant = new Aspirant
                ("Oleg", "Gromov", "PKS-218", 4, "scientific article");
        Student[] students = {student, aspirant};

        for (Student g : students)
            System.out.println(g.getScholarship());
    }
}