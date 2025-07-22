import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("tell me how many red fish are there ");
        int redFish = entrada.nextInt();
        System.out.println("tell me how many blue fish are there ");
        int blueFish = entrada.nextInt();

        int allFish = redFish + blueFish;
        System.out.printf("the red fish equal to %d and the blue fish equal to %d all the fish in the aquariam equal to %d.\n", redFish, blueFish, allFish);
    }
}
