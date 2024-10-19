package JavaAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E03_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new TreeMap<>();

        String[] command  = scanner.nextLine().split("-");
        while(!command[0].equals("search")){
            phonebook.put(command[0], command[1]);
            command = scanner.nextLine().split("-");
        }
        String nextCommand = scanner.nextLine();
        if (!phonebook.containsKey(nextCommand)){
            System.out.printf("Contact %s does not exist", nextCommand);
        } else {
            for(Map.Entry<String, String> entry: phonebook.entrySet()){
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }
}
