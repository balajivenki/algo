package misc;



import java.util.Stack;

/**
 * Created by bvenkatesan on 7/19/17.
 * http://www.geeksforgeeks.org/decode-string-recursively-encoded-count-followed-substring/
 */
public class DecodeString {
    public static void decode(String str) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<Character> characterStack = new Stack<>();

        for(int i = 0; i< str.toCharArray().length;i++) {
            if(Character.isDigit(str.charAt(i))) {//push integer number.UniqueNumber
                numberStack.push(Character.getNumericValue(str.charAt(i)));
            } else {//push all chars except the closing one
                if(str.charAt(i) != ']') {
                    characterStack.push(str.charAt(i));
                }
            }
        }

        System.out.println(numberStack.toString());
        System.out.println(characterStack.toString());
        String repeatString = "";

        while(!numberStack.isEmpty()) {
            int n = numberStack.pop();
            System.out.println(n);
            StringBuffer stringBuffer = new StringBuffer();
            String substr;
            repeatString = "";
            while(characterStack.peek() != '[') {
                stringBuffer.append(characterStack.pop());
            }
            //pop the [
            characterStack.pop();

            stringBuffer.reverse();

            substr = stringBuffer.toString();

            for(int i=0;i<n;i++) {
                repeatString = repeatString + substr;
            }

            for(int i=0;i<repeatString.toCharArray().length;i++) {
                characterStack.push(repeatString.charAt(i));
            }
        }

        System.out.println(repeatString);

    }

    public static void main(String[] args) {
        String str = "3[b2[ca]]";
        str = "3[a3[b]1[ab]]";
        DecodeString.decode(str);
    }
}
