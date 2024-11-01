package JavaAdvanced;

import java.util.Iterator;
import java.util.List;

public class L09_Book_Iterator implements Iterable<String> {
    private List<String> pages;
    // Iterator - the way we iterate over the objects of the specific class
    public L09_Book_Iterator(String... pages){
        this.pages = List.of(pages);
    }
    //Iterator<data type over which to iterate>
    public Iterator<String> iterator() {
        return new PageIterator();
    }
    private class PageIterator implements Iterator<String>{
        private int index=0;
        //1. should know if there is next element i.e.: method next
        //2. should be able to return the next element (if there is one) i.e.: method hasNext
        public boolean hasNext(){
            return index < pages.size();
        }
        public String next() {
            String page = pages.get(index);
            index++;
            return page;
        }
    }
}
