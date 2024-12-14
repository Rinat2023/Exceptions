import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //------- 1 ------------------------
//        String fruit = scanner.next();
//        Fruits CHECK = Fruits.valueOf(Fruits.class, fruit.toUpperCase());
//        System.out.println(CHECK.isLime()? "цитрусовый" : "не цитрусовый");

        // ---------- 2 ---------------
//        try {
//            String password = scanner.next();
//            if (password.length() >= 8 && !password.equals(password.toLowerCase()) && isHasNumber(password) && isHasSymbol(password)){
//                System.out.println(password);
//            }
//            else{
//                throw new PasswordFormatException("пароль недопустим");
//            }
//        }
//        catch (PasswordFormatException exception) {
//            System.out.println(exception.getMessage());
//        }

        // ----- 3 ------------
//        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK, Color.WHITE, Color.GRAY, Color.BLACK, Color.PURPLE};
//        Random random = new Random();
//        int randomColor = random.nextInt(0, 10);
//        System.out.println(colors[randomColor].colorMessage);

        //4
//        User user1 = new User("rinat", 13);
//        user1.checkAge(user1.getAge());

    }

    public static boolean isHasNumber(String password) {
        String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int i = 0; i < nums.length; i++) {
            if (password.contains(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHasSymbol(String password) {
        String[] symbols = {"@", "#", "$", "&", "_", "*", "(", ")", "-", "=", "?", "/"};
        for (int i = 0; i < symbols.length; i++) {
            if (password.contains(symbols[i])) {
                return true;
            }
        }
        return false;
    }
}