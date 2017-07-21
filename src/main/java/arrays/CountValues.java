package arrays;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class CountValues {
    public static void main(String[] args) {
        int input = 1234551;

        char[] chars = String.valueOf(input).toCharArray();

        int cnt = 1;
        char prev=chars[0];
        char current;
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=1;i<chars.length;i++) {
            current = chars[i];
            if(current == prev) {
                cnt++;
            } else {
                stringBuffer.append(cnt + String.valueOf(prev));
                prev = current;
                cnt=1;
            }
        }
        stringBuffer.append(cnt + String.valueOf(prev));

        System.out.println(stringBuffer);
    }
}
