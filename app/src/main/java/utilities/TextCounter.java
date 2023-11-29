package utilities;

public class TextCounter {
    public static String getCharacterCount(String input){
        return String.valueOf(input.length());
    }
    public static String getWordCount(String input){
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9\\s]", "");
        int count = cleanedInput.split("\\s+").length;
        return String.valueOf(count);
    }
}
