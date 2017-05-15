import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * @Author John Antonio Collins
 * Created on 5/15/17.
 */
public class Solution_Test
{

    Solution solution_Test;
    String simulatedInput;

    @Before
    public void setUp(){
        solution_Test = new Solution();
        simulatedInput = "5\n" +
                "1000000001 1000000002 1000000003 1000000004 1000000005";
    }

    @Test
    public void main_Test(){
        //use System.in hijack to test user input and psmv
        ByteArrayInputStream simIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(simIn);
        ByteArrayOutputStream grabOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(grabOut));
        
        solution_Test.main(null);
        BigInteger expected = BigInteger.valueOf(5000000015L);
        String actual = grabOut.toString().trim();
        assertEquals(expected.toString(), actual);


    }
}
