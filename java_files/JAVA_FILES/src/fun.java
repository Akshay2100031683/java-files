import java.util.*;

public class fun {

    public static String[] encode(String input1, String input2, String input3) {
        String[] s1 = split(input1);
        String[] s2 = split(input2);
        String[] s3 = split(input3);

        String res1 = s1[0] + s2[1] + s3[2];
        String res2 = s1[1] + s2[2] + s3[0];
        String res3 = s1[2] + s2[0] + s3[1];

        StringBuilder changeCase = new StringBuilder(res3.length());
        for (char c : res3.toCharArray()) {
            if (Character.isUpperCase(c)) {
                changeCase.append(Character.toLowerCase(c));
            } else {
                changeCase.append(Character.toUpperCase(c));
            }
        }
        res3 = changeCase.toString();

        return new String[] { res1, res2, res3 };
    }

    public static String[] split(String input) {
        int len = input.length();
        int p = len / 3;
        int rem = len % 3;

        String front, middle, end;
        if (rem == 0) {
            front = input.substring(0, p);
            middle = input.substring(p, 2 * p);
            end = input.substring(2 * p);
        } else if (rem == 1) {
            front = input.substring(0, p);
            middle = input.substring(p, 2 * p + 1);
            end = input.substring(2 * p + 1);
        } else {
            front = input.substring(0, p + 1);
            middle = input.substring(p + 1, 2 * p + 1);
            end = input.substring(2 * p + 1);
        }
        return new String[] { front, middle, end };
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();

        String[] res = encode(input1, input2, input3);

        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);

        sc.close();

    }
}
