public class evenwords {
    public static void printWords(String s) {
        for (String word : s.split(" ")) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        String s = "my name is uday kiran and i live in c625";
        printWords(s);
    }
}