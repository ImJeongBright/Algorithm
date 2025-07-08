package silver;

import java.io.*;

public class boj_6591
{
    public static void main(String[] args) throws IOException {
        ShowDown showDown = new ShowDown();
        showDown.calculateCombination();

    }
}


class ShowDown {

    private final BufferedReader bufR = new BufferedReader(new InputStreamReader(System.in));
    private final BufferedWriter bufW = new BufferedWriter(new OutputStreamWriter(System.out));


    public String[] inputFraction() throws IOException {
        return bufR.readLine().split(" ");
    }


    public void calculateCombination() throws IOException {


        while(true) {

            String[] inputNumbers = inputFraction();
            int n = Integer.parseInt(inputNumbers[0]);
            int k = Integer.parseInt(inputNumbers[1]);

            if(n == 0 && k == 0) break;

            long ans = 1;

            k = Math.min(k, n - k);

            for(int i = 0 ; i < k; i++) {
                ans *= n - i;
                ans /= i + 1;
            }

            bufW.write(ans + "\n");
        }
        bufW.flush();

    }


}
