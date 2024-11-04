package JavaAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class E09_ListyIteratorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListyIterator<String> listyIterator = new ListyIterator<>();
        String line = scanner.nextLine();

        while(!"END".equals(line)){
            String[] tokens = line.split(" ");
            String command = tokens[0];

            if(command.equals("Create")){
                String[] elements = Arrays.stream(tokens).skip(1).toArray(String[]::new);
                listyIterator = new ListyIterator<>(elements);
            } else if (command.equals("Move")){
                System.out.println(listyIterator.move());
            } else if (command.equals("Print")){
                try{
                    listyIterator.print();
                } catch (IllegalStateException ex){
                    System.out.println(ex.getMessage());
                }
            } else if (command.equals("HasNext")){
                System.out.println(listyIterator.hasNext());
            } else if (command.equals("PrintAll")){
                listyIterator.forEach( e -> System.out.print(e + " "));
                System.out.println();
            }
            line = scanner.nextLine();
        }
    }
}
