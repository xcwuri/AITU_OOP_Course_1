package ass1;

public class task7 {

    public static void main(String[] args) {
        signIn("user");
        signIn("assem");
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}