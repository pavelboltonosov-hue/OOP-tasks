package StringProcessing.task3;

public class Task3Method {
   private String target;
   private String replacement;

    public Task3Method(String target, String replacement) {
        this.target = target.toLowerCase();
        this.replacement = replacement;
    }

    public String replaceEverySecondOccurrence(String inputString) {
        StringBuilder modifiedString = new StringBuilder(inputString);
        int count = 0;
        int index = 0;

        while (index < modifiedString.length()) {
            index = modifiedString.toString().toLowerCase().indexOf(target, index);
            if (index == -1) {
                break;
            }
            count++;
            if (count % 2 == 0) {
                modifiedString.replace(index, index + target.length(), replacement);
            }
            index += replacement.length();
        }
        return inputString;
    }
}
