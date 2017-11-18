package nyc.c4q.mustafizurmatin.quiz.controller;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.mustafizurmatin.quiz.R;
import nyc.c4q.mustafizurmatin.quiz.model.SiliconValleyModel;
import nyc.c4q.mustafizurmatin.quiz.views.SiliconValleyViewHolder;

/**
 * Created by c4q on 11/16/17.
 */

public class SiliconValleyAdapter extends RecyclerView.Adapter<SiliconValleyViewHolder> {

    List<SiliconValleyModel> siliconValleyList = new ArrayList<>();


    public SiliconValleyAdapter(List<SiliconValleyModel> siliconValleyList) {
        this.siliconValleyList = siliconValleyList;
    }

    @Override
    public SiliconValleyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // takes item_view layout and inflates it.
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new SiliconValleyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SiliconValleyViewHolder siliconValleyViewHolder, int position) {

        // bind items in the list to a position

        SiliconValleyModel aSiliconValley = siliconValleyList.get(position);
        siliconValleyViewHolder.getRadioGroup().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Log.d("onBindViewHolder", "onCheckChanged" + i);
            }
        });
        siliconValleyViewHolder.bind(aSiliconValley);


    }

    @Override
    public int getItemCount() {
        return siliconValleyList.size();
    }
}
