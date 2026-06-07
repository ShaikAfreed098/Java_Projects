import java.util.*;

public class Memorygame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> sequence = new ArrayList<>();

        System.out.println("Memory Game");

        for (int round = 1; round <= 5; round++) {
            sequence.add(random.nextInt(9) + 1);

            System.out.print("Memorize: ");
            for (int num : sequence) {
                System.out.print(num + " ");
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n\n\n\n\n");

            System.out.print("Enter the sequence: ");

            boolean correct = true;
            for (int num : sequence) {
                int userInput = sc.nextInt();
                if (userInput != num) {
                    correct = false;
                }
            }

            if (!correct) {
                System.out.println("Game Over!");
                break;
            }

            System.out.println("Correct! Next round.");
        }

        sc.close();
    }
}