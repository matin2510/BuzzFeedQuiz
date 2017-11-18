package nyc.c4q.mustafizurmatin.quiz.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import nyc.c4q.mustafizurmatin.quiz.R;
import nyc.c4q.mustafizurmatin.quiz.model.SiliconValleyModel;

/**
 * Created by c4q on 11/16/17.
 */

public class SiliconValleyViewHolder extends RecyclerView.ViewHolder {

    private ImageView urlImageView;
    private TextView questions;
    private RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    private Context context;

    private RadioGroup radioGroup;


    public SiliconValleyViewHolder(View itemView) {
        super(itemView);
        urlImageView = (ImageView) itemView.findViewById(R.id.image_view);
        questions = (TextView) itemView.findViewById(R.id.question);
        radioButton1 = (RadioButton) itemView.findViewById(R.id.answer_one);
        radioButton2 = (RadioButton) itemView.findViewById(R.id.answer_two);
        radioButton3 = (RadioButton) itemView.findViewById(R.id.answer_three);
        radioButton4 = (RadioButton) itemView.findViewById(R.id.answer_four);
        context= itemView.getContext();
        radioGroup = (RadioGroup) itemView.findViewById(R.id.radio_group);

    }
    public void bind(SiliconValleyModel model){
        // binding data to your widget.
        String url = model.getUrl();
        Picasso.with(context)
                .load(url)
                .into(urlImageView);
        String questionString = model.getQuestion();
        questions.setText(questionString);
        String[] choicesArray = model.getChoices();
        radioButton1.setText(choicesArray[0]);
        radioButton2.setText(choicesArray[1]);
        radioButton3.setText(choicesArray[2]);
        radioButton4.setText(choicesArray[3]);

    }

    public RadioGroup getRadioGroup() {
        return radioGroup;
    }
}
