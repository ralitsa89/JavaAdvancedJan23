package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import static java.lang.System.in;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Deque<String> history = new ArrayDeque<>();

        String currentInput = scanner.nextLine();

        while (!currentInput.equals("Home")){
            if(currentInput.equals("back")){
                if(history.isEmpty() || history.size() == 1){
                    System.out.println("no previous URLs");
                    currentInput = scanner.nextLine();
                    continue;
                }else {
                    history.pop();
                }
            }else{
                history.push(currentInput);
            }

            System.out.println(history.peek());

            currentInput = scanner.nextLine();
        }
    }
}
