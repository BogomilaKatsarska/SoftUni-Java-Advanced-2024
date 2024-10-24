package JavaAdvanced;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E06_OpinionPollMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<E06_OpinionPoll> people = new ArrayList<>();

        for (int i=0; i<n; i++){
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            E06_OpinionPoll person = new E06_OpinionPoll(name, age);
            people.add(person);
        }

        people.stream()
                .filter(person -> person.getAge() > 30)
//                  .sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
                .sorted(Comparator.comparing(E06_OpinionPoll::getName))
                .forEach(person -> System.out.println(person));


    }
}
