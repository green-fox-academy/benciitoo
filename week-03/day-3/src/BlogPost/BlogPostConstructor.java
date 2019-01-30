package BlogPost;

public class BlogPostConstructor {

    String authorName;
    String title;
    String text;
    String publicationDate;


    public BlogPostConstructor(String authorName, String publicationDate) {
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

}