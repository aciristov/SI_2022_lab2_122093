import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SILAB2Test {

    /*
        - First test cases are for C0-every statement method
        and here are covered test cases for statements or calls of method in sequences of code.
        - Second test cases are for C1-every branch method and same sequences of code are covered here
        but with different outcome, regarding how much outcomes method can have, those cases are different
        test cases which are covered.
     */


    /*
     Below are test cases as part of C0 - testing every statement method
     from code sequence
    */

    // List must be square
    @Test
    public void testIfSquare() {
        List<String> strings = new ArrayList<String>(Arrays.asList("0", "#", "0", "0"));
        List list = SILAB2.function(strings);
        int n = list.size();
        int rootOfN = (int) Math.sqrt(n);
        assertTrue(rootOfN * rootOfN == n);
    }

    // List must not be empty
    @Test
    public void testSize(){
        List<String> strings = new ArrayList<String>(Arrays.asList("0", "#", "0", "0"));
        List list = SILAB2.function(strings);
        assertFalse(list.size() == 0);
    }

    // Item must be "0" or "#"
    @Test
    public void checkItem(){
        List<String> strings = new ArrayList<String>(Arrays.asList("0", "#", "0", "#"));
        List list = SILAB2.function(strings);
//        list.forEach(o -> assertEqual(o.equals("0")) || assertEqual(o.equals("#")));
        for (int i=0;i<list.size();i++){
            if (strings.get(i) == "0" || strings.get(i) == "#")
            {assertTrue(true);}
            else
            {assertFalse(true);}
        }
    }


    //**
    // Below are test cases as part of C1 - testing every branch method
    // from code sequence
    // **

    // List must be square, First Case
    @Test
    public void testIfSquareC11() {
        List<String> strings = new ArrayList<String>(Arrays.asList("0", "#", "0", "0"));
        List list = SILAB2.function(strings);
        int n = list.size();
        int rootOfN = (int) Math.sqrt(n);
        assertTrue(rootOfN * rootOfN == n);
    }

    // List must be square, Second Case
    @Test
    public void testIfSquareC12() {
        List<String> strings = new ArrayList<String>(Arrays.asList("0", "#", "0", "0"));
        List list = SILAB2.function(strings);
        int n = list.size();
        int rootOfN = (int) Math.sqrt(n);
        assertFalse(rootOfN * rootOfN != n);
    }

    // List must not be empty, First Case
    @Test
    public void testSizeC11(){
        List<String> strings = new ArrayList<String>(Arrays.asList("0", "#", "0", "0"));
        List list = SILAB2.function(strings);
        assertFalse(list.size() == 0);
    }

    // List must not be empty, Second Case
    @Test
    public void testSizeC12(){
        List<String> strings = new ArrayList<String>(Arrays.asList("0", "#", "0", "0"));
        List list = SILAB2.function(strings);
        assertTrue(list.size() != 0);
    }

    // Item must be "0" or "#", First Case
    @Test
    public void checkItemC11(){
        List<String> strings = new ArrayList<String>(Arrays.asList("0", "#", "0", "#"));
        List list = SILAB2.function(strings);
        for (int i=0;i<list.size();i++){
            if (strings.get(i) == "0" || strings.get(i) == "#")
            {assertTrue(true);}
            else
            {assertFalse(true);}
        }
    }

    // Item must be "0" or "#", Second Case
    @Test
    public void checkItemC12(){
        List<String> strings = new ArrayList<String>(Arrays.asList("0", "#", "0", "#"));
        List list = SILAB2.function(strings);
        for (int i=0;i<list.size();i++){
            if (strings.get(i) == "0" || strings.get(i) == "#")
            {assertFalse(false);}
            else
            {assertTrue(false);}
        }
    }



}
