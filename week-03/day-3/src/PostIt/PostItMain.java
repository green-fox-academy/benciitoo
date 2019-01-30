package PostIt;

public class PostItMain {
    public static void main(String[] args) {

        PostItConstructor postIt1 = new PostItConstructor("orange", "blue", "Idea 1");
        PostItConstructor postIt2 = new PostItConstructor("pink", "black", "Awesome");
        PostItConstructor postIt3 = new PostItConstructor("yellow", "green", "Superb");


        System.out.println(postIt3.textColor);
    }
}
