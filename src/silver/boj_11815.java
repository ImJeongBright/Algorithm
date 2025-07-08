package silver;

import java.io.*;

public class boj_11815
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        OddOrEven oddOrEven = new OddOrEven(bufferedReader, bufferedWriter);

        oddOrEven.classifyNumber();
    }
}


class OddOrEven {

    private final BufferedReader bufR;
    private final BufferedWriter bufW;

    OddOrEven(BufferedReader bufR, BufferedWriter bufW) {
        this.bufR = bufR;
        this.bufW = bufW;
    }


    public void classifyNumber() throws IOException {

        int testCase = Integer.parseInt(bufR.readLine());
        String[] split = bufR.readLine().split(" ");

        for(int i = 0 ; i < testCase; i++) {

            long number = Long.parseLong(split[i]);

            long sqrt = (long) Math.sqrt(number);


            if(sqrt * sqrt == number) bufW.write(1 + " ");
            else bufW.write(0 + " ");

        }
        bufW.flush();
    }

}