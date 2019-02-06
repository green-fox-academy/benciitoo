package cloneable;



public class Student extends Person {

    String previousOrganization;
    int skippedDays;


    public Student (String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }


    public Student(){
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from "
                + previousOrganization + " who skipped " + skippedDays + " day from the course already.");
    }

    @Override
    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }


    @Override
    public Student clone(){ //Ha ez Object lenne, akkor át kéne castolni a Main-ban (Student)-té: Student johnTheClone = (Student)student1.clone();

   /* return this;  Így is működne, de akkor később ha változtatom a student1-nek az age-ét a Main-ban,
      a klón is változna. Szóval tökre ne használjam így klónozáshoz.*/

        return new Student(name, age, gender, previousOrganization);
    }


    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;

    }
}