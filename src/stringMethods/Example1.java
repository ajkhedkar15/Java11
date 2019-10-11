package stringMethods;

//Strip(),stripLeading(),stripTrailing() used to
//remove white spaces from the string
//isBlank() used to check whether String is empty or not
//and return an empty value
//repeat() used to repeat the String value for number we
//passed as input.
//Lines() method return the stream of strings that
//are partitioned by line terminators
public class Example1 {
    public static void main(String[] args) {
        String s = " abc ";
        System.out.println(s.stripLeading());
        System.out.println(s.stripTrailing());
        System.out.println(s.stripLeading().stripTrailing());
        System.out.println(s.strip());

        String s1 = "";
        System.out.println(s1.isBlank());
        System.out.println(s.isBlank());

        String s2 = "xyz";
        System.out.println(s2.repeat(3));
    }
}
