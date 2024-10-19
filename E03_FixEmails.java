package JavaAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E03_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, String> listOfMails = new TreeMap<>();

        while(!command.equals("stop")){
            String name = command;
            String email = scanner.nextLine();
            if (email.toLowerCase().contains("us") || email.toLowerCase().contains("com")){
                command = scanner.nextLine();
            } else {
                listOfMails.put(name, email);
                command = scanner.nextLine();
            }
        }
        for(Map.Entry<String, String> entry: listOfMails.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
