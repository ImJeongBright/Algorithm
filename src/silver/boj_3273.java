package silver;
import java.util.*;
import java.io.*;


public class boj_3273
{
    public static void main(String[] args) throws IOException {
        SumOfTwoNumber sumOfTwoNumber = new SumOfTwoNumber();
        sumOfTwoNumber.solveProblem();
    }
}

class SumOfTwoNumber {

    private final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public int[] inputNumbers(int size) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] numbers = new int[size];
        for(int i = 0 ; i < size; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        return numbers;
    }

    public void solveProblem() throws IOException {
        int size = Integer.parseInt(bf.readLine());
        int[] numbers = inputNumbers(size);
        int targetNumber = Integer.parseInt(bf.readLine());

        int fairNumber = 0;

        Arrays.sort(numbers);

        for(int st = 0; st < size; st++) {
            int en = st + 1;

            while(en < size && numbers[st] + numbers[en] <= targetNumber) {
                if(numbers[st] + numbers[en] == targetNumber) fairNumber++;
                en++;
            }

        }

        bw.write(String.valueOf(fairNumber) + '\n');
        bw.flush();
    }

}
