package com.segang.gxcare.gxcare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Karim on 1/28/2018.
 */

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private static LayoutInflater inflater = null;

    public CustomAdapter(Context context) {
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
    }

    @Override
    public int getCount() {
        return Schedule.IMAGES.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {

        View view = v;
        if (view == null)
            view = inflater.inflate(R.layout.schedule_item, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView drug = view.findViewById(R.id.drug);
        TextView time = view.findViewById(R.id.time);
        TextView description = view.findViewById(R.id.description);

        imageView.setImageResource(Schedule.IMAGES[i]);
        drug.setText(Schedule.NAMES[i]);
        description.setText(Schedule.DESCRIPTIONS[i]);

        return view;

    }


}