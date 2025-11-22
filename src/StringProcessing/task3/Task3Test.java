package StringProcessing.task3;

public class Task3Test {
    public void runTests() {
        Task3Method modifier = new Task3Method("object-oriented programming", "OOP");

        String testString = "Object-oriented programming is a programming language model organized around objects rather than 'actions' and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

        String Result = "Object-oriented programming is a programming language model organized around objects rather than 'actions' and data rather than logic. OOP blabla. Object-oriented programming bla.";

        String result = modifier.replaceEverySecondOccurrence(testString);

        if (!result.equals(Result)) {
            System.out.println("Test failed! Expected: " + Result + ", but got: " + result);
        } else {
            System.out.println("All tests passed!");
        }
    }
}
