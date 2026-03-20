package OOPS.Basic.classes;

/*
 Pojo classes are public classes and it has getter and setter
 It don't have any annotations like @Table, @Entity
 It has public constructor
 It should not from any extend or implements
*/
public class Pojo {
    int marks;
    public String name;

    void setMarks(int mark) {
        this.marks = mark;
    }

    void setName(String name) {
        this.name = name;
    }

    int getMarks() {
        return this.marks;
    }

    String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Pojo pj = new Pojo();
        pj.setMarks(10);
        pj.setName("Michel");

        System.out.println(pj.name);
    }
}
