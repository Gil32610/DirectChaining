public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        String[] words = {"Here", "are", "the", "best", "no-pull", "dog", "harnesses", "you", "can", "buy"};
        for (int i = 0; i < words.length; i++) {
            directChaining.insertHashTable(words[i]);
        }
        directChaining.displayHashTable();
        String animal = "horse";
        System.out.println(directChaining.searchHashTable(animal) ? "The word " + animal + " was found in the table" : "The word "
                +"\""+ animal+ "\"" + " wasn't found in the table");
        directChaining.deleteKeyHashTable("dog");
        directChaining.displayHashTable();
    }
}
