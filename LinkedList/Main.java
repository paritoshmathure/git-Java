package LinkedList;

public class Main{
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList(5);
        myLinkedList.append(10);
        myLinkedList.append(12);
        myLinkedList.append(15);
       // myLinkedList.removeLast();
      // myLinkedList.removeFirst();
    //    myLinkedList.prepend(19);
        // myLinkedList.set(2, 30);
        // myLinkedList.insert(1, 20);
        // myLinkedList.insert(1, 15);
        // myLinkedList.remove(1);
        myLinkedList.printAll();
        myLinkedList.reverse();
        myLinkedList.printAll();
        System.out.println("Middle Node: " + myLinkedList.findMiddleNode().value);
        System.out.println("Kth from end: "+ myLinkedList.findKthFromEnd(2).value);
        myLinkedList.removeNthFromEnd(2);
        myLinkedList.printAll();
    }
}
