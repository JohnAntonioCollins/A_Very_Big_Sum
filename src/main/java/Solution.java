/**
 * @Author John Antonio Collins
 * Created on 5/14/17.
 */
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //MY CODE START
        //PLAN: use addition iteration from 'largest sub array' problem. convert to big int.
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < length; i++)
        {
            sum = sum.add(scan.nextBigInteger());
        }
        System.out.println(sum);

        //MY CODE END
    }
}