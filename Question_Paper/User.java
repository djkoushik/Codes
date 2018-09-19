package Project.Question_Paper;
import java.io.IOException;

public class User {
    public static void main(String argv[]) throws IOException {
        Uploading Suman = new Uploading();
        System.out.println("You answered " + Suman.coreect_answers_count + " Correct answers out of " + Suman.q.length);
    }
}