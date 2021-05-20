package com.example.dhatu;

public class Questions {
    public String questions[] = {"What is the language we are creating our app in?"};

    public String options[][] = {{"Tamil", "Kannada","Sankskrit","Hindi"}};

    public String answers[] = {"Sanksrit"};

    public String getquestions(int a){
        String question = questions[a];
        return question;
    }

    public String getoption1(int a){
        String option1 = options[a][0];
        return option1;
    }

    public String getoption2(int a){
        String option2 = options[a][1];
        return option2;
    }

    public String getoption3(int a){
        String option3 = options[a][2];
        return option3;
    }

    public String getoption4(int a){
        String option4 = options[a][3];
        return option4;
    }

    public String getanswer(int a){
        String answer = answers[a];
        return answer;
    }

}
