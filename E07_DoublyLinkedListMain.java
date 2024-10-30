package JavaAdvanced;

public class E07_DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst(1);
        doublyLinkedList.addFirst(2);
        doublyLinkedList.addFirst(3);
        doublyLinkedList.addLast(4);
        doublyLinkedList.addLast(5);
        doublyLinkedList.addLast(6);
        System.out.println(doublyLinkedList.get(2));
    }
}
