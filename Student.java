class Student {

    // static data member (shared memory)
    static String college = "ABC College";

    // non-static data members
    int rollNo;
    String name;

    // constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // non-static method
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    // static member function
    static void changeCollege() {
        college = "XYZ College";
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        // calling static method (no object required)
        Student.changeCollege();

        // creating objects
        Student s1 = new Student(1, "Shraddha");
        Student s2 = new Student(2, "Ravi");

        // displaying data
        s1.display();
        s2.display();
    }
}
