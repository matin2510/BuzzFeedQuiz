package nyc.c4q.mustafizurmatin.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import nyc.c4q.mustafizurmatin.quiz.views.SecondActivity;

public class MainActivity extends AppCompatActivity {
    /*List<SiliconValleyModel> siliconValleyModelList = new ArrayList<>();
    SiliconValleyAdapter siliconValleyAdapter;*/
    private Button SiliconValley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SiliconValley = (Button) findViewById(R.id.silicon_valley_quiz_button);



    }

    public void chooseQuiz(View v) {
        switch (v.getId()) {
            case R.id.silicon_valley_quiz_button:
                Intent intentSiliconValleyQuiz = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intentSiliconValleyQuiz);
                break;


        }
    }
}
