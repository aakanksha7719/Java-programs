//formating a number

class Format {
    public static void main(String[] args) {
        int n1 = 47;
        float n2 = 35.864f;
        double n3 = 44534345.76d;

        // format as an octal number
        System.out.println(String.format("n1 in octal: %o", n1)); // 57

        // format as hexadecimal numbers
        System.out.println(String.format("n1 in hexadecimal: %x", n1)); // 2f
        System.out.println(String.format("n1 in hexadecimal: %X", n1)); // 2F

        // format as strings
        System.out.println(String.format("n1 as string: %s", n1)); // 47
        System.out.println(String.format("n2 as string: %s", n2)); // 35.864

        // format in scientific notation
        System.out.println(String.format("n3 in scientific notation: %g", n3)); // 4.45343e+07
    }
}
