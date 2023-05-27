public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        String[] words = {"Here", "are ", "the", "best", "no-pull", "dog", "harnesses", "you", "can", "buy"};
        for (int i = 0; i <words.length ; i++) {
            directChaining.insertHashTable(words[i]);
        }
        directChaining.displayHashTable();
    }
}
