import java.util.*;

public class chapter09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        System.out.println(text);
        int number = scan.nextInt();
        System.out.println(number * 10);
        System.out.println("おこづかい" +number+"円");
    }
}
