import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.println("Choose an option: \n" +
                    "1. Send a message \n" +
                    "2. Receive a message \n" +
                    "3. Display the queue \n" +
                    "4. Exit");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    System.out.println("Enter the message: ");
                    new SendMessageCommand(queue, scanner.nextLine()).execute();
                    break;
                case "2":
                    new ReceiveMessageCommand(queue).execute();
                    break;
                case "3":
                    new DisplayQueueCommand(queue).execute();
                    break;
                case "4":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}