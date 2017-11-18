package nyc.c4q.mustafizurmatin.quiz.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import nyc.c4q.mustafizurmatin.quiz.R;

public class ResultsActivity extends AppCompatActivity {
    private int answer1;
    private int answer2;
    private int answer3;
    private int answer4;
    private int answer5;

    private int countChoiceA = 0;
    private int countChoiceB = 0;
    private int countChoiceC = 0;
    private int countChoiceD = 0;


    private LinearLayout linearLayout;
    private TextView textView;
    private ImageView imageView;
    private Button go_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        answer1 = intent.getIntExtra("answer1",0);
        answer2 = intent.getIntExtra("answer2",0);
        answer3 = intent.getIntExtra("answer3",0);
        answer4 = intent.getIntExtra("answer4",0);
        answer5 = intent.getIntExtra("answer5",0);
    }
    public String[] calculateResults(){
        switch (answer1) {
            case 2131165216:
                countChoiceC++;
                break;
            case 2131165214:
                countChoiceD++;
                break;
            case 2131165217:
                countChoiceB++;
                break;
            case 2131165215:
                countChoiceA++;
                break;
        }
        switch (answer2) {
            case 2131165216:
                countChoiceC++;
                break;
            case 2131165217:
                countChoiceB++;
                break;
            case 2131165215:
                countChoiceA++;
                break;
            case 2131165214:
                countChoiceD++;
                break;
        }
        switch (answer3) {
            case 2131165216:
                countChoiceC++;
                break;
            case 2131165217:
                countChoiceB++;
                break;
            case 2131165214:
                countChoiceD++;
                break;
            case 2131165215:
                countChoiceA++;
                break;
        }
        switch (answer4) {
            case 2131165215:
                countChoiceA++;
                break;
            case 2131165216:
                countChoiceC++;
                break;
            case 2131165214:
                countChoiceD++;
                break;
            case 2131165217:
                countChoiceB++;
                break;
        }
        switch (answer5) {
            case 2131165216:
                countChoiceC++;
                break;
            case 2131165215:
                countChoiceA++;
                break;
            case 2131165214:
                countChoiceD++;
                break;
            case 2131165217:
                countChoiceB++;
                break;
        }

        int[] completedResults = {countChoiceA,countChoiceD,countChoiceC,countChoiceB};
        int MaxResult = countChoiceC;
        for (int i: completedResults) {
            if (i > MaxResult){
                MaxResult = i;
            }
        }
        if (MaxResult == countChoiceC) {
            String choiceCPic = "https://img.buzzfeed.com/buzzfeed-static/static/2016-03/30/18/enhanced/webdr09/enhanced-4665-1459377432-8.jpg?downsize=715:*&output-format=auto&output-quality=auto";
            String choiceCResult = "You got: Bertram Gilfoyle\n" +
                    "You are honest and nice, but not at the same time. " +
                    "You don’t take shit from anyone, and you need a man who does the same. " +
                    "You finally found your dream man: tall, dark and worships Satan. " +
                    "You meet at a coffee shop where he is attempting to hack the wifi. " +
                    "You happily live together with your three beautiful, ferret-like children until he gets deported back to Canada";
            String[] choiceC = {choiceCPic,choiceCResult};
            return choiceC;
        } else if (MaxResult == countChoiceA) {
            String choiceAPic = "https://img.buzzfeed.com/buzzfeed-static/static/2016-03/30/18/enhanced/webdr13/enhanced-28117-1459377378-1.png?downsize=715:*&output-format=auto&output-quality=auto";
            String choiceAResult = " You got: \"Jared\" Dunn\n" +
                    "You appreciate a man who is attentive, organized and possesses ghostlike features. " +
                    "While he may look like a guy who fucks, he is actually very sweet and you will definitely be the one wearing the pants in this relationship. " +
                    "You meet Jared at the movies where you are both attending the newest Julia Roberts film. " +
                    "He is extremely loyal and full of childlike wonder, but you have to sleep in separate rooms since he yells at you in German while he sleeps.";
            String[] choiceA = {choiceAPic,choiceAResult};
            return choiceA;
        } else if (MaxResult == countChoiceD) {
            String choiceDPic = "https://img.buzzfeed.com/buzzfeed-static/static/2016-03/30/18/enhanced/webdr02/enhanced-21285-1459377490-1.png?downsize=715:*&output-format=auto&output-quality=auto";
            String choiceDResult = "You got: Richard Hendricks\n" +
                    "Your very own Steve Wozniak. " +
                    "You might be slightly neurotic, but you have big ideas and dreams! You meet Richard in the doctor’s office where he is being treated for his frequent panic attacks. " +
                    "He throws up on your shoes and you immediately fall head over ~barfy~ heels. " +
                    "He is very supportive and loving, which makes up for the fact that he wets the bed - errr, has night sweats.";
            String[] choiceD = {choiceDPic, choiceDResult};
            return choiceD;
        } else if (MaxResult == countChoiceB) {
            String choiceBPic = "https://img.buzzfeed.com/buzzfeed-static/static/2016-03/30/18/enhanced/webdr06/enhanced-29271-1459378247-6.png?downsize=715:*&output-format=auto&output-quality=auto";
            String choiceBResults = "You got: Nelson \"Big Head\" Bighetti\n" +
                    "You are easygoing and don’t like to take life too seriously. " +
                    "While some people may consider him a useless appendage, he is your knight in somewhat shining armor. " +
                    "You eventually live together on his boat…in the harbor…since he never got around to getting his boat license.";
            String[] choiceB = {choiceBPic,choiceBResults};
            return choiceB;
        }
        return new String[0];
    }
}

