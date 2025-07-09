package silver;

import java.io.*;
import java.util.*;

public class boj_15810
{
    public static void main(String[] args) throws IOException {
        BalloonFactory balloonFactory = new BalloonFactory();
        balloonFactory.minimumTime();
    }
}

class BalloonFactory {

    private final BufferedReader bufR = new BufferedReader(new InputStreamReader(System.in));
    private final BufferedWriter bufW = new BufferedWriter(new OutputStreamWriter(System.out));

    public StringTokenizer inputValues() throws IOException {
        return new StringTokenizer(bufR.readLine());
    }


    public void minimumTime() throws IOException {

        StringTokenizer inputF = inputValues();
        StringTokenizer inputS = inputValues();

        int n = Integer.parseInt(inputF.nextToken());
        int m = Integer.parseInt(inputF.nextToken());

        List<Long> timeList = new ArrayList<>();
        long mn = Integer.MAX_VALUE;
        for(int i = 0 ; i < n; i++) {
            timeList.add(Long.parseLong(inputS.nextToken()));
            mn = Math.min(mn, timeList.get(i));
        }

        long st = 0;
        long en = mn * m;

        while(st + 1 < en) {
            long mid = (st + en) / 2;
            long temp = 0;

            for (Long integer : timeList) {
                temp += (mid / integer);
            }


            if(m <= temp) {
                en = mid;
            }

            else st = mid;

        }

        bufW.write(String.valueOf(en));
        bufW.flush();

    }


}

