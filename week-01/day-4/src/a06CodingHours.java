public class a06CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        // Hány százalékát tölti kódolással a szemeszternek, ha az átlagos munkahét 52 órás?


        float workinghoursperweek = 52;
        float codinghoursperweek = 5 * 6;
        int semester = 17;
        //codingh/working*100
        float percentage;
        System.out.println("The attendee spends " + semester * codinghoursperweek + " hours with coding in a semester");

        //percentage = codinghoursperweek / workinghoursperweek * 100;
        //System.out.println(percentage);
        //Ez egy másik megoldás, így is jó.

        percentage = 100 / workinghoursperweek * codinghoursperweek;
        System.out.println("The percentage of the coding hours in the semester if the average work hours weekly is 52: " + percentage);



    }
}
