import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Digite o número inicial: ");
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        Integer times = 0;
        Integer highest = 0;
            while (number != 1) {
                if (number % 2 == 1) {
                    number = (number * 3) + 1;
                } else {
                    number /= 2;
                }

                if (number > highest) {
                    highest = number;
                }
                times++;
            }

        sc.close();
        System.out.println("Times: " + times);
        System.out.println("Highest: " + highest);
    }
}
