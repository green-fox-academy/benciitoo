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
    public void anagramTestWithCaseDifferenceAndStringSizeDifference(){
        Anagram anagram = new Anagram();
        assertTrue(anagram.areTheAnagram("ABCD", "DCBA"));
        assertTrue(anagram.areTheAnagram("ABCD", "dcbA"));
        assertFalse(anagram.areTheAnagram("ABCD", "ABCDefgh"));
    }


    @Test
    public void countLettersTestWithCaseDifferenceAndSpecialCharacters(){
        CountLetters clet = new CountLetters();
        assertEquals(4, clet.countTheLettersInString("agyatlanka").get('a')); // Character-nél '' és nem "" !!!
        assertEquals(1, clet.countTheLettersInString("agyatlanka").get('l'));
        assertEquals(4, clet.countTheLettersInString("AGYAtlanka").get('a'));
        assertEquals(1, clet.countTheLettersInString("5555\tt=/+§").get('\t'));
    }


    @Test
    public void fibonacciSequenceTestWithZeroAndOneAndRandomPositiveNumber(){
        Fibonacci fibo = new Fibonacci();
        assertEquals(0, fibo.fibonacciSequence(0));
        assertEquals(1, fibo.fibonacciSequence(1));
        assertEquals(233, fibo.fibonacciSequence(13));
    }
}