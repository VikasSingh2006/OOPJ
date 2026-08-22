class StudentData {
    String name;
    int rollno;
    double marks;

    StudentData(String name, int rollno, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}

public class Students{
    public static void main(String[] args) {

        StudentData s1 = new StudentData("Vikas", 101, 85.5);
        StudentData s2 = new StudentData("Rahul", 102, 90.0);
        StudentData s3 = new StudentData("Satish", 103, 80.0);

        System.out.println("Student 1: " + s1.name +   s1.rollno + " "  +  s1.marks);
        System.out.println("Student 2: " + s2.name +   s2.rollno +  " " + s2.marks);
        System.out.println("Student 3: " + s3.name +    s3.rollno + " " + s3.marks);
    }
}