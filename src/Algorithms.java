import java.util.Random;

public class Algorithms {
    public static void main(String[] args) {
        Random random = new Random();

        int sum= 0;
        int num = random.nextInt(100_000) + 11;
        System.out.println("Num original = " + num);

        while(num > 10){
            sum += num % 10;
            num /= 10;
        }
        sum += num;


        System.out.println("Summa = " + sum);
    }
}
