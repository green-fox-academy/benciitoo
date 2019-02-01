package teachersandstudents;

public class Teacher {

    public Teacher(){}


    public void answer(){
        System.out.println("This is the answer my young wizard padawan!");
    }


    public void teach(Student student){
        student.learn();
    }

}