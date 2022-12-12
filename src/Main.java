import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        String q = "hello";
        int hashCode = q.hashCode() % 30;
        System.out.println(hashCode);

    }
}
