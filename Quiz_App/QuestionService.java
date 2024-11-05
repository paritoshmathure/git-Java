package Quiz_App;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService()
    {
        questions[0] = new Question(1,"What is 2 Square", "a)2","b)4","c)8","d)16","4");
        questions[1] = new Question(2,"What is 4 Square", "a)2","b)4","c)8","d)16","8");
        questions[2] = new Question(3,"What is 8 Square", "a)2","b)64","c)8","d)16","64");
        questions[3] = new Question(4,"What is 10 Square", "a)81","b)64","c)100","d)125","100");
        questions[4] = new Question(5,"What is 12 Square", "a)100","b)144","c)81","d)169","144");
    }
    
    public void playQuiz()
    {
        int i =0;
        for(Question q : questions){
            System.out.println("Question no. : "+ q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.println("Your Answer : ");
            selection[i] =  sc.nextLine();
            i++;
        }
        int j = 1;
        for(String s : selection)
        {
            System.out.println("Answers Given for : "+ j + s);
            j++;
        }
    }
    public void printScore()
    {
        int score = 0 ;
        for(int i = 0; i<questions.length; i++)
        {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            
            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("Your Score is : " + score);
    }
}

