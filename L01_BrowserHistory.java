package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> urls = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")){
            if (!input.equals("back")){
                urls.push(input);
                System.out.println(input);
            } else {
                if (urls.size()==1){
                    System.out.println("No previous url");
                } else {
                    urls.pop();
                    System.out.println(urls.peek());
                }
            }
            input = scanner.nextLine();
        }
    }
}
