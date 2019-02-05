package greenfoxinheritanceexercise;

public class Sponsor extends Person {

    String company;
    int hiredStudents;

    public Sponsor(){
        company = "Google";
        this.hiredStudents = 0;
    }


    public Sponsor (String name, int age, String gender, String company){
        super(name, age, gender);
        this.hiredStudents = 0;
        this.company = company;
    }


    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents "
        + company + " and hired " + hiredStudents + " students so far.");
    }


    @Override
    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }


    public void hire(){
        hiredStudents++;
    }
}