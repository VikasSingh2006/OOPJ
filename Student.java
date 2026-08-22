class StudentData {

    private String name;
    private int rollno;
    private double marks;

    static int studentCount = 0;
    StudentData(String name, int rollno, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;

        studentCount++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public double getMarks() {
        return marks;
    }
}

public class Student {

    public static void main(String[] args) {

        StudentData s1 = new StudentData("Vikas", 101, 85.5);
        StudentData s2 = new StudentData("Rahul", 102, 90.0);
         StudentData s3 = new StudentData("Satish", 103, 80.0);


        //  System.out.println(s1.getName());
        //  System.out.println(s2.getName());
        //  System.out.println(s3.getName());



        //  System.out.println("Marks:"+s1.getMarks());
        //  System.out.println("Marks:"+s2.getMarks());
        //  System.out.println("Marks:"+s3.getMarks());


         System.out.println("Student 1 Name: " + s1.getName());
         System.out.println("Student 1 Roll No: " + s1.getRollno());
         System.out.println("Student 1 Marks: " + s1.getMarks());

         System.out.println();

         System.out.println("Student 2 Name: " + s2.getName());
         System.out.println("Student 2 Roll No: " + s2.getRollno());
         System.out.println("Student 2 Marks: " + s2.getMarks());

         System.out.println();

           System.out.println("Student 3 Name: " + s3.getName());
         System.out.println("Student   3  Roll No: " + s3.getRollno());
         System.out.println("Student   3  Marks: " + s3.getMarks());

         System.out.println();

        System.out.println("Total Students: " + StudentData.studentCount);
    }
}