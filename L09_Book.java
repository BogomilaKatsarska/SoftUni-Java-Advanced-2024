package JavaAdvanced;

import java.util.ArrayList;
import java.util.List;

public class L09_Book implements Comparable<L09_Book>{
    private String title;
    private int year;
    private List<String> authors;

    public L09_Book(String title, int year, String... authors){
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    public int getYear() {
        return this.year;
    }

    public String getTitle() {
        return this.title;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setTitle(String title){
        this.title = title;
    }
    private void setYear(int year){
        this.year = year;
    }
    private void setAuthors(String... authors){
        this.authors = new ArrayList<>();
        for(String author: authors){
            this.authors.add(author);
        }
    }
    public int compareTo(L09_Book otherBook){
        int result = this.title.compareTo(otherBook.title);
        if (result == 0){
            result = Integer.compare(this.year, otherBook.year);
        }
        return result;
    }
}
