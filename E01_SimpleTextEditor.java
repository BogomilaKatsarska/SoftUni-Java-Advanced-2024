package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E01_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> textHistory = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for(int command=1; command<=n; command++){
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("1")){
                textHistory.push(text.toString());
                text.append(input[1]);
                break;
            } else if(input[0].equals("2")){
                textHistory.push(text.toString());
                int countToBeDeleted = Integer.parseInt(input[1]);
                int startDelPosition = text.length() - countToBeDeleted;
                text.delete(startDelPosition, text.length());
                break;
            } else if(input[0].equals("3")){
                int index = Integer.parseInt(input[1]) - 1;
                System.out.println(text.charAt(index));
                break;
            } else if(input[0].equals("4")){
                text = new StringBuilder(textHistory.pop());
                break;
            }
        }
    }
}
