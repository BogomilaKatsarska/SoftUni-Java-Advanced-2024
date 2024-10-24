package JavaAdvanced;

public class E06_OpinionPoll {
    private String name;
    private int age;

    public E06_OpinionPoll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    @Override
    public String toString() {
        return String.format("%s - %d", this.name, this.age);
    }
}
