package teachersandstudents;

public class Student {

    int whatILearned;


    public Student () {
        whatILearned = 0;
    }


    public void learn(){
        whatILearned += 50;
        System.out.println("I swear I'm learning!");
        System.out.println("My knowledge rate is: " + whatILearned);
    }


    public void question(Teacher teacher){
        teacher.answer();
    }

}