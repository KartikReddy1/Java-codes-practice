public class StudentDetails {

    String name = "Karthik";
    int age = 20;
    double marks = 85.5;

    void displayDetails() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Marks = " + marks);
    }

    public static void main(String[] args) {

        StudentDetails student = new StudentDetails();

        student.displayDetails();
    }
}