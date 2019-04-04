import org.junit.*;

import static org.junit.Assert.*;

public class TestSearchResult {

    @Before
    public void testSetup() {
        Main.getGoogle();
    }

    @AfterClass
    public static void testShutdown()  {
        Main.closeBrowser();
    }

    @Test
    public void testSearch01() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch02() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch03() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }
    @Test
    public void testSearch04() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch05() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch06() throws Exception {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch07()throws Exception {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch08()throws Exception {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch09()throws Exception {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }
    @Test
    public void testSearch10() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch11() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch12() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch13()throws Exception {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch14()throws Exception {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch15()throws Exception {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch16()throws Exception {
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch17() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch18() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch19() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }

    @Test
    public void testSearch20() throws Exception{
        Main.searchInGoogle();
        assertEquals("Süsü - Google-keresés", Main.getTitle());
    }








}