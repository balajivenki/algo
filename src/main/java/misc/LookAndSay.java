package misc;

/**
 * Created by bvenkatesan on 7/22/17.
 */
public class LookAndSay {
    public static void printLookAndSaySequence(int n) {
        if(n == 1) System.out.println("1");
        if(n == 2) System.out.println("11");

        String str = "11";

        for(int i=3;i<=n;i++) {

            int cnt = 1;
            StringBuffer stringBuffer = new StringBuffer();
            char prev = str.charAt(0);
            for(int j=1;j<=(str.length() -1);j++) {
                if(str.charAt(j) == prev) {
                    cnt++;
                } else {
                    stringBuffer.append(cnt);
                    stringBuffer.append(prev);

                    cnt = 1;
                    prev = str.charAt(j);
                }
            }

            stringBuffer.append(cnt);
            stringBuffer.append(prev);

            str = stringBuffer.toString();

            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        LookAndSay.printLookAndSaySequence(n);
    }
}
