package JavaAdvanced;

import java.util.ArrayDeque;

//provide generic param, can be anything, but follow convention, single capital letter, i.e.: T==data type
// expects to be replaced with any data type
public class L08_JarOfT<T> {
//    private ArrayDeque<String> elements;
//    private ArrayDeque<Integer> elenemtsNums;
    private ArrayDeque<T> elements;

    public L08_JarOfT(){
//        this.elements = new ArrayDeque<>();
//        this.elenemtsNums = new ArrayDeque<>();
        this.elements = new ArrayDeque<>();
    }

//    public void add(String text){
//        this.elements.push(text);
//    }
//    public String remove(){
//        return this.elements.pop();
//    }
//    public void addNum(int number){
//        this.elenemtsNums.push(number);
//    }
//    public int removeNum(){
//        return this.elenemtsNums.pop();
//    }
//    => make the methods generic
    public void add(T element){
        this.elements.push(element);
    }
    public T remove(){
        return this.elements.pop();
    }
}
