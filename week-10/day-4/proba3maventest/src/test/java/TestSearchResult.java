import org.junit.*;

import static org.junit.Assert.*;

public class TestSearchResult {

    @Before
    public void testSetup() {
        Main.getGoogle();
    }

    @After
    public void testShutdown() {
        Main.closeBrowser();
    }

    @Test
    public void testSearch1() {
        //Main.getGoogle();

        Main.searchInGoogle();

        assertEquals("Süsü - Google-keresés", Main.getTitle());
       // Main.closeBrowser();

    }


    @Test
    public void testSearch2() {
       // Main.getGoogle();

        Main.searchInGoogle();

        assertEquals("Süsü - Google-keresés", Main.getTitle());
       // Main.closeBrowser();

    }

   /* @Test
    public void testSearch3() {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }
    @Test
    public void testSearch4() {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch5() {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch6() {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch7() {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }
*/


}