package StringProcessing;

public class Task1 {
    public static void main(String[] args) {

        String str = "I like Java!!!";

        char lastchar = str.charAt(str.length() - 1);
        System.out.println(lastchar);

        boolean endsWith = str.endsWith("!!!");
        System.out.println(endsWith);

        boolean startsWith = str.startsWith("I like");
        System.out.println(startsWith);

        boolean contains = str.contains("Java");
        System.out.println(contains);

        int position = str.indexOf("Java");
        System.out.println(position);

        String replace = str.replace("a", "o");
        System.out.println(replace);

        String upperCase = str.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);

        System.out.println(str.replace("a", "o"));

    }
}
