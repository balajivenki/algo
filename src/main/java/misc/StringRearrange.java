package misc;

/**
 * Created by bvenkatesan on 7/18/17.
 */
public class StringRearrange {
    public void rearrange(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = str.toCharArray();
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))) {
                sum = sum + Character.getNumericValue(str.charAt(i));
            } else {
                stringBuffer.append(str.charAt(i));
            }
        }

        System.out.println(stringBuffer + "" + sum);
    }
    public static void main(String[] args) {
        String str = "ACCBA10D2EW30";
        StringRearrange stringRearrange = new StringRearrange();
        stringRearrange.rearrange(str);
    }
}
