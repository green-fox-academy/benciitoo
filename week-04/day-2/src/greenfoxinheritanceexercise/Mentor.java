package greenfoxinheritanceexercise;

public class Mentor extends Person {

    String level;

    public Mentor (String name, int age, String gender, String level){
        super(name, age, gender);
        this.level = level;
    }


    public Mentor (){
        this.level = "intermediate";
    }


    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ", " + level + " level mentor.");
    }


    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }
}