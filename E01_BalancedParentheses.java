package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class E01_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] allParentheses = scanner.nextLine().toCharArray();

        Deque<Character> openingParenthesesStack = new ArrayDeque<>();
        for(int i=0; i<allParentheses.length; i++){
           if (allParentheses[i] == '{' || allParentheses[i] == '(' || allParentheses[i] == '['){
               openingParenthesesStack.push(allParentheses[i]);
           } else {
               if (openingParenthesesStack.isEmpty()){
                   System.out.println("No");
                   break;
               }
               char poppedEl = openingParenthesesStack.pop();
               char currClosingEl = allParentheses[i];
               if (poppedEl == '(' && currClosingEl == ')'){
                   continue;
               } else if (poppedEl == '[' && currClosingEl == ']'){
                   continue;
               } else if (poppedEl == '{' && currClosingEl == '}'){
                   continue;
               } else {
                   System.out.println("No");
                   break;
               }
           }
        }
        System.out.println("Yes");

        }
}
