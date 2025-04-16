package hashTable;

public class Main {
    public static void main(String[] args){

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails" , 100);
        myHashTable.set("tile" , 50);
        myHashTable.set("bolts" , 180);
        myHashTable.set("screws" , 200);

        //System.out.println(myHashTable.get(200));

        myHashTable.printTable();
    }
}
