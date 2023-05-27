import java.util.LinkedList;

public class DirectChaining {
    private LinkedList<String>[] hashTable;
    private final int maxChainSize = 5;

    private int size;

    public DirectChaining(int size) {
        hashTable = new LinkedList[size];
        this.size = size;
    }

    public int modASCIIHashFunction(String word, int M) {
        char ch[];
        ch = word.toCharArray();

        int i, sum;
        for (sum = 0, i = 0; i < word.length(); i++) {
            sum += ch[i];
        }
        return sum % M;
    }

    public void insertHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);

        if (hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        } else hashTable[newIndex].add(word);
    }

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("EMPTY");
            return;
        } else {
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index: " + i + ", Key: " + hashTable[i]);
            }
        }
    }

    public boolean searchHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        if (hashTable[newIndex] != null && hashTable[newIndex].contains(word)) {
            return true;
        }
        return false;
    }

    public void deleteKeyHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, size);
        if (searchHashTable(word)) {
            hashTable[newIndex].remove(word);
            System.out.println("\"" + word + "\"" + " removed!");
            return;
        }
        System.out.printf(" \"%s\" not found\n", word);
    }
}
