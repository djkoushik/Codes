package Project.Question_Paper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questions {
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String answer;
    private String ans;

    Questions(String question, String a, String b, String c, String d, String answer, String ans) {
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.ans = ans;
        this.answer = answer;
    }

    String getAnswer() {
        return answer;
    }

    String getAns() {
        return ans;
    }

    public String toString() {
        return (this.question+this.a+this.b+this.c+this.d);
    }
}
class Uploading {
    int coreect_answers_count ;
    private Questions Q1 = new Questions("Who is the present Prime Minister of India\n", "a. Sardhar vallabai patel\n", "b. Pranam mukarji\n", "c. Narendhra Modi\n", "d. Ramnadh Govindh\n", "Narendhra Modi", "c");
    private Questions Q2 = new Questions("Who is the present President of India\n", "a. Ramnath Govindh\n", "b. Vishwanatham\n", "c. chaithanya\n", "Upprendhra\n", "Ramnath Govind", "a");
    private Questions Q3 = new Questions("What is tommarows Exam\n", "a. LDLC\n", "b. BMI\n", "c. Java\n", "d. CO\n", "Java", "c");
    private Questions Q4 = new Questions("Which movie is this\n", "a. Varun Sandhesh\n", "b. Mahesh Babu\n", "c. Prabhas\n", "d. Sunil\n","Mahesh Babu", "b");
    private Questions Q5 = new Questions("Which Movie iam watching now\n", "a. Hero\n", "b. Maghadheera\n", "c. sinikudu\n", "d. Geetha govindham\n","Geetha Govindham", "d");

    Questions q[] = new Questions[5];

    Uploading()throws IOException {
        q[0] = Q1;
        q[1] = Q2;
        q[2] = Q3;
        q[3] = Q4;
        q[4] = Q5;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
            if (validateAnswer(q[i],br.readLine()))
                System.out.println("\tCorrect answer\n");
            else
                System.out.println("\twrong answer\n");
        }
    }

    private boolean validateAnswer(Questions l,String s1)
    {

        if(s1.equalsIgnoreCase(l.getAns()) || s1.equalsIgnoreCase(l.getAnswer())) {
            coreect_answers_count++;
            return true;
        }
        else{
            return false;
        }
    }
}
