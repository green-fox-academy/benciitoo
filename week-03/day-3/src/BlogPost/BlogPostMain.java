package BlogPost;

public class BlogPostMain {
    public static void main(String[] args) {

        BlogPostConstructor blogPost1 = new BlogPostConstructor("John Doe", "2000.05.04.");
        blogPost1.title = "Lorem Ipsum";
        blogPost1.text = "Lorem ipsum dolor sit amet.";


        BlogPostConstructor blogPost2 = new BlogPostConstructor("Tim Urban", "2010.10.10.");
        blogPost2.title = "Wait but why";
        blogPost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";


        BlogPostConstructor blogPost3 = new BlogPostConstructor("William Turton", "2017.03.28.");
        blogPost3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogPost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, " +
                "doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, " +
                "he told me that he wasn’t really into the whole organizer profile thing.";

        System.out.println(blogPost3.text);

    }
}