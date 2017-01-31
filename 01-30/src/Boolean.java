/*
 * 
 */
import java.util.Scanner;

/*
 * @author hwangest
 *
 */
public class StringMethods {
    /* @param args */
    public static boolean endsWithRep(String s1, String s2, int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str = s2 + s2;
        }
        if (s1.endsWith (str)) {
        	return true;
        } else {
        	return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Code for endsWithRep");
        System.out.println(endsWithRep("foobarbar", "bar", 2));
        System.out.println(endsWithRep("foobarbar", "baz", 1));
    }
}
