package JavaAdvanced;

import java.util.Iterator;

public class L09_Library_Iterator implements Iterable<L09_Book_Iterator>{
    private L09_Book_Iterator[] books;

    public L09_Library_Iterator(L09_Book_Iterator... books){
        this.books = books;
    }

    public Iterator<L09_Book_Iterator> iterator(){
        return new BookIterator();
    }

    private class BookIterator implements Iterator<L09_Book_Iterator>{
        private int index = 0;
        public boolean hasNext(){
            return index < books.length;
        }
        public L09_Book_Iterator next(){
            L09_Book_Iterator book = books[index];
            index++;
            return book;
        }
    }
}
