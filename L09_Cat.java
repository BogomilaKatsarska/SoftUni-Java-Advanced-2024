package JavaAdvanced;

public class L09_Cat implements Comparable<L09_Cat>{
    private String name;
    private int age;
    private double weight;

    public L09_Cat(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    //describe the way of comparing 2cats - also for SORTING
    public int compareTo(L09_Cat otherCat){
        // the return result can be:
        //1. negative: myCat is LT than the otherCat by a given criteria
        //2. zero: when the two cats == by a given criteria
        //3. positive: when my cat GT the otherCat by a given criteria
//        if(this.age == otherCat.age){
//            return 0;
//        } else if (this.age < otherCat.age){
//            return  -1;
//        } else {
//            return 1;
//        }
        return Integer.compare(this.age, otherCat.age);
    }
}
