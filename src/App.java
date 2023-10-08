import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(10 + 2);
        double dura = 12;

        System.out.println(dura + 12);

        Random random = new Random();
        System.out.println("Some random value" + random.nextInt());
    }
}
