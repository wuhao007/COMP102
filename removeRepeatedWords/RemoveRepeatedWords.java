public class RemoveRepeatedWords {
    public static String removeRepeatedWords(String inputString) {

        inputString = inputString.trim(); // Remove any leading and trailing blanks
        String result = "", currentWord = "", nextWord = "";
        int stringLength = inputString.length(); // Length of the input string
        int stringIndex = 0; // Index for input string

        while (stringIndex < stringLength) {

            // Get the next word in inputString

            while (stringIndex < stringLength && inputString.charAt(stringIndex) != ' ') {

                nextWord = nextWord + inputString.charAt(stringIndex);
                stringIndex++;
            }

            // Check if nextWord is the same as currentWord

            if (!currentWord.equals(nextWord)) {

                result = result + " " + nextWord;
            }

            stringIndex++;
            currentWord = nextWord;
            nextWord = "";
        }

        return result.trim(); // Remove any leading and trailing blanks from result

    }
    public static void main(String[] args) { 
        System.out.println(removeRepeatedWords("the the the"));
        System.out.println(removeRepeatedWords("cat fat cat cat hat"));
    }
}
