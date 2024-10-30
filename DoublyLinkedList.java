package JavaAdvanced;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

//L07 - Workshop - DoublyLinkedList
public class DoublyLinkedList {

    class Node{
        int element;
        Node next;
        Node prev;

        public Node(int element){
            this.element = element;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int element){
        Node newNode = new Node(element);

        if (this.size == 0){
            this.head = this.tail = newNode;
        } else {
            // set new Node's next to the old head
            newNode.next = this.head;
            // set the old head's prev node to new Node
            this.head.prev = newNode;
            // set new head
            this.head = newNode;
            // increase size
        }
        this.size++;
    }
    public void addLast(int element){
        Node newNode = new Node(element);
        if (this.size == 0){
            this.head = this.tail = newNode;
        } else {
            // set new Node's prev to the old tail
            newNode.prev = this.tail;
            // set the old tail's next to new Node
            this.tail.next = newNode;
            // set new tail
            this.tail = newNode;
            // increase size
        }
        this.size++;
    }
    public int get(int index){
        checkIndex(index);
        Node currentNode;
        if (index <= this.size / 2) {
            currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }

        return currentNode.element;
    }
    public int removeFirst() {
        checkEmpty();
        int element = this.head.element;
        this.head = this.head.next;
        // single element
        if (this.head == null) {
            this.tail = null;
        } else {
            this.head.prev = null;
        }

        this.size--;
        return element;
    }

    public int removeLast() {
        checkEmpty();
        int element = this.tail.element;
        this.tail = this.tail.prev;
        if (this.tail == null) {
            this.head = null;
        } else {
            this.tail.next = null;
        }
        this.size--;
        return element;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = this.head;

        while (currentNode != null) {
            consumer.accept(currentNode.element);
            currentNode = currentNode.next;
        }
    }

    public int[] toArray() {
        int[] array = new int[this.size];
        int index = 0;
        Node currentNode = this.head;
        while (currentNode != null) {
            array[index++] = currentNode.element;
            currentNode = currentNode.next;
        }

        return array;
    }

    private boolean isEmpty() {
        return this.size == 0;
    }

    private void checkEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
    }


    private void checkIndex(int index) {
        if (index <= 0|| index >= this.size){
            throw new IndexOutOfBoundsException(
                    String.format("Index %d is out of bounds for size %d", index, this.size));
        }
    }
}
