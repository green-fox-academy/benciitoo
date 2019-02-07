import apples.Apples;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sum.Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestsForSimpleExercises {

    @Test
    public void getNameTest(){
        Apples apple = new Apples("Testname");
        assertEquals("Testname", apple.getName());
    }


    @Test
    public void sumMethodTest_MultipleElements(){
        List<Integer> numberTest = new ArrayList(Arrays.asList(new Integer[]{4, 5, 7, 2}));
        Sum sum1 = new Sum();
        assertEquals((Integer)18, sum1.sum(numberTest));
    }

    @Test
    public void sumMethod_EmptyList_ReturnsZero(){
        List<Integer> numberTest = new ArrayList();
        Sum sum1 = new Sum();
        assertEquals((Integer)0, sum1.sum(numberTest));
    }

    @Test
    public void sumMethod_OneElement_ReturnsSameElement(){
        List<Integer> numberTest = new ArrayList(Arrays.asList(new Integer[]{7}));
        Sum sum1 = new Sum();
        assertEquals((Integer)7, sum1.sum(numberTest));
    }

    @Test
    public void sumMethod_Null(){
        //List<Integer> numberTest;
        //numberTest = null;
        Sum sum1 = new Sum();
        assertEquals(null, sum1.sum(null));

    }


    @Test
    public void anagramTestWithCaseTestAndDifferentStringSize(){
        Anagram anagram = new Anagram();
        assertTrue(anagram.areTheAnagram("ABCD", "DCBA"));
        Anagram anagram2 = new Anagram();
        assertTrue(anagram2.areTheAnagram("ABCD", "dcbA"));
        Anagram anagram3 = new Anagram();
        assertFalse(anagram2.areTheAnagram("ABCD", "ABCDefgh"));
    }


    @Test
    public void countLettersTest(){

        
    }



}