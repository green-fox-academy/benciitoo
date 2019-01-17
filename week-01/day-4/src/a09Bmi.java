public class a09Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double bmi = massInKg / (Math.pow(heightInM,2));

        System.out.println(bmi);
        // Print the Body mass index (BMI) based on these values
    }
}