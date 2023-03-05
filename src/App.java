import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {

            Set<User> set = new HashSet<>();

            System.out.print("How many students for Course A? ");
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                set.add(new User(s.nextInt()));
            }

            System.out.print("How many students for Course B? ");
            n = s.nextInt();
            for (int i = 0; i < n; i++) {
                set.add(new User(s.nextInt()));
            }

            System.out.print("How many students for Course C? ");
            n = s.nextInt();
            for (int i = 0; i < n; i++) {
                set.add(new User(s.nextInt()));
            }

            System.out.print("Total students: ");
            System.out.println(set.size());
        }
    }
}
