import java.util.Arrays;

public class linearProbing {
    public static void main(String[] args) throws Exception {
        System.out.println(72 % 9);
    }
    // Declare vars for use later on in class
    private String[] hashTable;
    private int tableSize;
    private final String DELETED = "DELETED"; // Placeholder for deleted keys

    // Constructor
    public linearProbing(int size) {
        tableSize = size;
        hashTable = new String[tableSize];
        Arrays.fill(hashTable, null);
    }

    // Hash method 
    private int hash(String key) {
        return (key.hashCode() % tableSize);
    }

    // Remove method
    public void remove(String key) {
        int index = hash(key);
        while (hashTable[index] != null) {
            if (hashTable[index].equals(key)) {
                hashTable[index] = DELETED;
                return;
            }
            index = (index + 1) % tableSize;
        }
    }
}
