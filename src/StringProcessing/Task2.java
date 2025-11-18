package StringProcessing;

import javafx.beans.binding.StringBinding;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder third = new StringBuilder();

        first.append(num1);
        first.append("+");
        first.append(num2);
        first.append("=");
        first.append(num1+num2);

        second.append(num1);
        second.append("-");
        second.append(num2);
        second.append("=");
        second.append(num1-num2);

        third.append(num1);
        third.append("*");
        third.append(num2);
        third.append("=");
        third.append(num1*num2);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        first.replace(first.indexOf("="),first.indexOf("=")+1 , "равно");
        second.replace(second.indexOf("="),second.indexOf("=")+1, "равно");
        third.replace(third.indexOf("="),third.indexOf("=")+1, "равно");

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
