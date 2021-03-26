package app;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello Java");
        System.out.println(question11("src/App/cyka.txt", "test"));
    }

    public static String helloName(String s) {
        return "Hello " + s + "!";
    }

    public static char findChar(String s, int index) {
        return s.charAt(index);
    }

    public static String atFirst(String s) {
        if (s.length() >= 2) {
            return s.substring(0, 2);
        } else {
            return s.substring(0, 1) + "@";
        }
    }

    public static String replaceString(String s, String oldChar, String newChar) {
        s.replace(oldChar, newChar);
        return s;
    }

    public static int findStr(String s, String target) {
        return s.indexOf(target);
    }

    public static int countStr(String str, String findStr) {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1)
                count++;

            lastIndex += findStr.length();
        }
        return count;
    }

    public static String sentenceAnalysis(String sentence) {
        int length = sentence.length();
        String[] woLieKaiLe = sentence.split(" ");
        int wordCount = woLieKaiLe.length;
        int charCount = 0;
        for (int i = 0; i < woLieKaiLe.length; i++) {
            charCount += woLieKaiLe[i].length();
            if (woLieKaiLe[i].contains(",") || woLieKaiLe[i].contains(".") || woLieKaiLe[i].contains("?")
                    || woLieKaiLe[i].contains(":") || woLieKaiLe[i].contains(";")) {
                charCount--;
            }
        }
        double avgWordLength = (double) charCount / woLieKaiLe.length;
        return "Length : " + length + "\n" + "Word Count: " + wordCount + "\n" + "Average Word Length: "
                + avgWordLength;
    }

    public static String question11(String filePath, String findStr){
        return "1. Open " + filePath +" with a text editor." + "\n" +
               "2. Press \"CTRL + F\" on your keybord." + "\n" + 
               "3. In the pop-up, type in \"" + findStr + "\"" + "\n" +
               "4. Click \"FIND NEXT\" key on the pop-up."
        ;

    }
}