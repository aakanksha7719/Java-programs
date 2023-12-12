
// Java code to illustrate String
import java.io.*;

class Concat {
    public static void main(String[] args) {
        // Declare String without using new operator
        String s1 = "GeeksforGeeks";
        String s2 = "GeeksforGeeks";

        System.out.println("using data type");
        if (s1 == s2) {
            System.out.println("Both are same");
        } else {
            System.out.println("Not same");

        }

        System.out.println();

        System.out.println("using equals");
        if (s1.equals(s2)) {
            System.out.println("Both are same");
        } else {
            System.out.println("Not same");

        }

        System.out.println();

        String s3 = new String("GeeksforGeeks");
        String s4 = new String("GeeksforGeeks");
        System.out.println("using object");
        if (s3 == s4) {
            System.out.println("Both are same");
        } else {
            System.out.println("Not same");

        }

        System.out.println();

        System.out.println("using equals");
        if (s3.equals(s4)) {
            System.out.println("Both are same");
        } else {
            System.out.println("Not same");

        }

        System.out.println();
        System.out.println("using concatenation");
        s1.concat(s2);
        System.out.println(s1);

        System.out.println();
        System.out.println("using concatenation");
        System.out.println(s1.concat(s2));

        System.out.println();
        System.out.println("using + operator");
        System.out.println(s1 + s2);
    }
}
