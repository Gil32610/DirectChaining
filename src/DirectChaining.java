import java.util.LinkedList;

public class DirectChaining {
    private LinkedList<String>[] hashTable;
    private final int maxChainSize = 5;

    public DirectChaining(int size) {
        hashTable = new LinkedList[size];
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
}
