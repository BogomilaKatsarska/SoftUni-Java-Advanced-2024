package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class L01_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        int count = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queueKids = new ArrayDeque<>();

//        for (int i = 0; i < names.length; i++) {
//            queueKids.offer(names[i]);
//        }
        Collections.addAll(queueKids, names);

        while (queueKids.size() > 1) {
            for (int i = 1; i <= count; i++) {
                if (i == count){
                    String removedKid = queueKids.poll();
                    System.out.println("Removed "+removedKid);
                } else {
                    String movedKid = queueKids.poll();
                    queueKids.offer(movedKid);
                }
            }
        }
        System.out.println("Last is " + queueKids.poll());
    }
}
