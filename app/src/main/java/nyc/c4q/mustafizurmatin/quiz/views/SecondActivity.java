package nyc.c4q.mustafizurmatin.quiz.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.mustafizurmatin.quiz.R;
import nyc.c4q.mustafizurmatin.quiz.controller.SiliconValleyAdapter;
import nyc.c4q.mustafizurmatin.quiz.model.SiliconValleyModel;

public class SecondActivity extends AppCompatActivity {
    List<SiliconValleyModel> siliconValleyModelList = new ArrayList<>();
    SiliconValleyAdapter siliconValleyAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        RecyclerView siliconValleyRecyclerView = (RecyclerView) findViewById(R.id.siliconValley_recyclerview);


        siliconValleyRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));


        String[] a = {"A: Take a shot ", "B: Hide in the Bathroom", "C: Check your phone ", "D: Stand awkardly "};
        String[]  b= {"A: couple mil or tres comas ", "B: enough to support my family ", "C: make my dreams come true ", "D: I don't need money "};
        String[]  c= {"A: Code ", "B: Smoke weed ", "C: Play video games ", "D: Read "};
        String[]  d= {"A: Brains ", "B: Uniqueness ", "C: Loyalty ", "D: Charm "};
        SiliconValleyModel question1 = new SiliconValleyModel("https://i.amz.mshcdn." +
                "com/bturZni64LqOUGcq3svCweuynwQ=/950x534/filters:quality(90)/2014%2F05%2F12%2F11%2Fsiliconvall.54d09.jpg",
                "When you get to a party you... ", a);
        siliconValleyModelList.add(question1);
        SiliconValleyModel question2 = new SiliconValleyModel("https://assets-auto.rbl.ms/d815deb9032ad7b36828fd41b15e3ebe3c54a8364510dbb2a2a83960bd9058e0",
                "How much money do you need... ", b);
        siliconValleyModelList.add(question2);
        SiliconValleyModel question3 = new SiliconValleyModel("http://www.motherjones.com/wp-content/uploads/silicon-valley.jpg",
                "What do you do on your days off... ", c);
        siliconValleyModelList.add(question3);
        SiliconValleyModel question4 = new SiliconValleyModel("https://www.wired.com/wp-content/uploads/2016/03/silicon_valley_opener2.jpg2",
                "What do you look for in a partner... ", d);
        siliconValleyModelList.add(question4);

        //Log.d("checking", siliconValleyModelList.get(0).getQuestion());
        siliconValleyAdapter = new SiliconValleyAdapter(siliconValleyModelList);
        siliconValleyRecyclerView.setAdapter(siliconValleyAdapter);


    }
}
