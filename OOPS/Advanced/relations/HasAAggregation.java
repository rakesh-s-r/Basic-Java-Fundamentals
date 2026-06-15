package OOPS.Advanced.relations;

// uses-a/has-a
import java.util.ArrayList;
import java.util.List;

// Professor exists independently — it's not created by Department
class Professor {
    private String name;
    private String subject;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }
}

// Department USES Professor — aggregation
class Department {
    private String name;
    private List<Professor> professors; // holds reference — not owner

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    // Professor is PASSED IN — created outside Department
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void removeProfessor(Professor professor) {
        professors.remove(professor);
    }
}

public class HasAAggregation {
    public static void main(String[] args) {
        // Usage — Professor exists before and after Department
        Professor p1 = new Professor("Dr. Smith", "Physics");
        Professor p2 = new Professor("Dr. Jones", "Math");

        Department physics = new Department("Physics Dept");
        physics.addProfessor(p1);
        physics.addProfessor(p2);

        // Department is gone — but professors still exist!
        physics = null; // Department destroyed
        System.out.println(p1.getName()); // "Dr. Smith" — still alive ✅

        // Same professor can belong to multiple departments — shared ownership
        Department science = new Department("Science Dept");
        science.addProfessor(p1); // p1 in two departments simultaneously ✅
    }
}
