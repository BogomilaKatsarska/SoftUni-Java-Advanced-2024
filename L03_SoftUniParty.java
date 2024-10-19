package JavaAdvanced;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class L03_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> regularGuests = new TreeSet<>();
        Set<String> vipGuests = new TreeSet<>();

        String input = scanner.nextLine();
        while(!input.equals("PARTY")){
            char firstSymbol = input.charAt(0);
            if (Character.isDigit(firstSymbol)){
                vipGuests.add(input);
            } else {
                regularGuests.add(input);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while(!input.equals("END")){
            vipGuests.remove(input);
            regularGuests.remove(input);
            input = scanner.nextLine();
        }

        System.out.println(regularGuests.size() + vipGuests.size());
        for(String vip: vipGuests){
            System.out.println(vip);
        }
        for (String regular: regularGuests){
            System.out.println(regular);
        }
    }
}
