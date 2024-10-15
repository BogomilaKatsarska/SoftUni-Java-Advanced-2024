package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L01_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> queuePrinter = new ArrayDeque<>();

        while(!command.equals("print")){
            if (!command.equals("cancel")){
                queuePrinter.offer(command);
            } else {
                if (!queuePrinter.isEmpty()) {
                    String toBeCancelled = queuePrinter.poll();
                    System.out.printf("Cancelled %s%n", toBeCancelled);
                } else {
                    System.out.println("Printer is on standby");
                }
            }
            command = scanner.nextLine();
        }
        for(String filename: queuePrinter){
            System.out.println(filename);
        }
    }
}
