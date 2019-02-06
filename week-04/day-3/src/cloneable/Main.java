package cloneable;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 20, "male", "BME");

        Student johnTheClone = student1.clone();
        student1.age = 10; //ez a this-es returnnel működne, és megváltoztatja az age-t a klónban, azaz tökre ne használjam this-sel
        johnTheClone.introduce();
    }
}