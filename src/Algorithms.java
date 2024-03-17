import java.util.Random;

public class Algorithms {
    public static void main(String[] args) {
        Random random = new Random();

        int sum= 0;
        int num = random.nextInt(100_000) + 11;
        System.out.println("Num original = " + num);
        for (int i = 0; i < 6; i++) {
            if (num > 10){
                sum += num % 10;
                num /= 10;
            } else {
                sum += num;
                break;
            }
        }

        System.out.println("Summa = " + sum);
    }
}
