import java.util.*;
import java.util.Scanner;
public class QuestionService {


    Question[] question = new Question[5];  // we are creating an array of size 5; 
    String selection[] = new String[5]; 
    public QuestionService(){
              question[0] = new Question(1, "What is capital of India ? ", "Mumbai", "Delhi", "Goa","Mathura", "Delhi"); 
              question[1] = new Question(2, "What is size of Byte? ", "2", "3", "4","8", "4"); 
              question[2] = new Question(3, "What is size of String ? ", "1", "2", "3","4", "2"); 
              question[3] = new Question(4, "What is capital of Bit ? ", "1", "2", "3","4", "1"); 
              question[4] = new Question(5, "What is capital of Boolean ? ", "1", "2", "3","4", "1"); 
                         
    }
    public void displayQuestion() {
        int i =0; 
        for(Question q : question) {
        System.out.println("Question No.:" + q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());

        Scanner sc = new Scanner(System.in); 
        selection[i] = sc.nextLine(); 
        i++; 
        }
        System.out.println("The Answer that are entered by the user are: "); 
        for( String s : selection) {
            System.out.println(s); 
        }

    }

    public void printScore(){
        int score = 0;
        for(int j =0;j< question.length;j++) 
             {
              Question ques = question[j]; 
              String actualanswer = ques.getAnswer();
              String useranswer = selection[j]; 
            
              if(actualanswer.equals(useranswer)) {
                score++; 
            }
        }
        System.out.println("Your score is:" + score); 
    }
}