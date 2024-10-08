import java.util.Random;
import java.util.Scanner;
import java.util.Arrays; // Arraysクラスのインポート

class HeadsOrTails {
    public static void main(String[] args) {
        new HeadsOrTails().run();
    }

    void run() {
        String[] list = new String[3];

        String UserName = Greeding();

        System.out.println("Tossing a coin...");

        System.out.print("Round 1: ");
        list[0] = PrintHeadsOrTails();
        System.out.println(list[0]);

        System.out.print("Round 2: ");
        list[1] = PrintHeadsOrTails();
        System.out.println(list[1]);

        System.out.print("Round 3: ");
        list[2] = PrintHeadsOrTails();
        System.out.println(list[2]);

        long cnt_Heads = Arrays.stream(list).filter(x -> x.equals("Heads")).count();
        long cnt_Tails = Arrays.stream(list).filter(x -> x.equals("Tails")).count();
        System.out.println("Heads: " + cnt_Heads + ", Tails: " + cnt_Tails);

        PrintJudge(cnt_Heads, cnt_Tails, UserName);

    }

    private String PrintHeadsOrTails() {
        Random rand = new Random();
        if (rand.nextInt(2) == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }

    private String Greeding() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Who are you?");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        sc.close();
        return userName;
    }

    private void PrintJudge(long cnt_H, long cnt_T, String Name) {
        if (cnt_H > cnt_T) {
            System.out.println(Name + " won");
        } else {
            System.out.println(Name + " lost");
        }
    }
}