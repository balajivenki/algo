package misc;

/**
 * Created by bvenkatesan on 7/24/17.
 */
public class Binary {

    public static void addBinary(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while(i>=0 || j>=0) {
            int sum = 0;

            if(i >=0) {
                if (num1.charAt(i) == '1') {
                    sum++;
                }
            }

            if(j>=0) {
                if (num2.charAt(j) == '1') {
                    sum++;
                }
            }

            sum = sum + carry;

            if(sum >=2) {
                carry = 1;
            } else {
                carry = 0;
            }

            sb.insert(0, (char) ((sum%2) + '0'));

            i--;
            j--;

        }

        if(carry == 1) {
            sb.insert(0, '1');
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 =  "1010";
        addBinary(num1, num2);
    }
}
