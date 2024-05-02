import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        int numberPositive = 0;
        int numberNegative = 0;
        int numberZero = 0;

        for (Integer positionArrayInteger : arr) {

            if (positionArrayInteger > 0) {
                numberPositive++;
            } else if (positionArrayInteger < 0) {
                numberNegative++;
            } else {
                numberZero++;
            }
        }

        System.out.println(numberPositive/arr.size());
        System.out.println(numberNegative/arr.size());
        System.out.println(numberZero/arr.size());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
