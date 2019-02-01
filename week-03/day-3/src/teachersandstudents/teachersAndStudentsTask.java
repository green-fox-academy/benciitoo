package teachersandstudents;

import sun.java2d.loops.DrawLine;

public class teachersAndStudentsTask {
    public static void main(String[] args) {

        Teacher dumbledore = new Teacher();
        Student harry = new Student();

        dumbledore.teach(harry);
        System.out.println("-------------------------------------------------------------");
        harry.question(dumbledore);


    }

}