package utilities;

public class TextCounter {
    public static String getCharacterCount(String input){
        return String.valueOf(input.length());
    }
    public static String getWordCount(String input){
        int count = input.split("\\s").length;
        return String.valueOf(count);
    }
}
